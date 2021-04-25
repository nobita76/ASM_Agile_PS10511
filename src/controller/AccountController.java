/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import entity.Item;
import entity.SanPham;

import javax.servlet.http.Cookie;

import entity.Users;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
@Transactional
@Controller
public class AccountController {
    
    @Autowired
    SessionFactory factory;
    
    
    @RequestMapping(value = {"/", "login/index"}, method = RequestMethod.GET)
    public String index(ModelMap model, HttpSession session, HttpServletRequest request){
        String username =(String) session.getAttribute("username");
        if(username != null){
            return "redirect:/index.html";
        }
        model.addAttribute("Users", new Users());
        return "login/index";
    }
    
    @RequestMapping(value = {"login/register"}, method = RequestMethod.GET)
    
    public String register(ModelMap model, HttpSession session, HttpServletRequest request){
        model.addAttribute("Users", new Users());
        
        return "login/index";
    }
    
    @RequestMapping("test")
    public String test(ModelMap model){
        
        return "test";
    }
    
    @RequestMapping(value = "login/register", method = RequestMethod.POST)
    public String register(ModelMap model, HttpSession sessionHttp, HttpServletRequest request, HttpServletResponse response, @ModelAttribute("Users") Users user){
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();
        try {
        	if(user.getUsername().equals("") || user.getPassword().equals("") || user.getUsername().length() < 5 || user.getPassword().length() < 5) {
                model.addAttribute("messageRegister", "Invalid username or password");

                return "login/index";
        	}else {
        		session.save(user); // 1. thêm 1 tài khoản vào
                t.commit();  // 2. commit nếu thêm thành công
                model.addAttribute("messageRegister", "Tạo tài khoản thành công...!!!");
                return "redirect:index.html";
        	}
            
        } catch (Exception e) {
            model.addAttribute("messageRegister", "The account already has an user");

            t.rollback();

        } finally {
            session.close();
        }
        
        return "login/index";
    }
    
    
    @RequestMapping(value = "login/login", method = RequestMethod.POST)
    public String loginAction(ModelMap model, HttpSession session, HttpServletRequest request, HttpServletResponse response, @ModelAttribute("Users") Users user){
           Users test = findByUsername2(user.getUsername());
           if(test == null){
               				model.put("error", "Account's Invalid");

               return "login/index";
           }else{
               if(test.getPassword().equals(user.getPassword())){
                   session.setAttribute("username", user.getUsername());
                   session.setAttribute("vaitro", test.getVaitro());
                   Cookie ckUsername = new Cookie("username", user.getUsername());
				ckUsername.setMaxAge(999999);
				response.addCookie(ckUsername);
				Cookie ckPassword = new Cookie("password", user.getPassword());
				ckPassword.setMaxAge(99999);
				response.addCookie(ckPassword);
                                Cookie ckVaiTro = new Cookie("vaitro", test.getVaitro()+"");
                                ckVaiTro.setMaxAge(999999);
				response.addCookie(ckVaiTro);
                                HashMap<Integer, Item> cart = new HashMap<>();
                                session.setAttribute("gioHang", cart);
            return "redirect:/index.html";
               }else{
                   				model.put("error", "Account's Invalid");

                   return "login/index";
               }
           }
        
    }
    
    @RequestMapping(value = {"logout", "login/logout"}, method = RequestMethod.GET)
	public String logout(HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		// Remove session
		session.removeAttribute("username");
                session.removeAttribute(("vaitro"));
		// Remove cookie
		for (Cookie cookie : request.getCookies()) {
			if (cookie.getName().equalsIgnoreCase("username")) {
			cookie.setMaxAge(0);
				response.addCookie(cookie);
			}
			if (cookie.getName().equalsIgnoreCase("password")) {
				cookie.setMaxAge(0);
				response.addCookie(cookie);
			}
                        if (cookie.getName().equalsIgnoreCase("vaitro")) {
				cookie.setMaxAge(0);
				response.addCookie(cookie);
			}
		}
              return "redirect:index.html";
	}
    
    @RequestMapping(value = "api/forgotPassword")
    @ResponseBody
    public ResponseEntity<String> forgotPassword(@RequestParam("username") String uesrname, @RequestParam("email") String email) {
        Users user = findByUsername2(uesrname);
        boolean status = false;
        String message = "Lỗi không xác định";
        if(user == null) {
        	status = false;
        	message = "Account does not exist";
        }else {
        	if(user.getEmail().equals(email)) {
        		status = true;
        		message = user.getPassword();
        	}else {
        		status = false;
        		message = "Invalid email";
        	}
        }
        //return new ResponseEntity<>("{\"status\" : \"true\",\"maSP\" : \"" + sp.getMaSP() + "\", \"tenSp\" : \"" + sp.getTenSP() + "\", \"donGia\" : \"" + sp.getDonGia() + "\", \"soLuong\" : \"" + sp.getSoLuong() + "\", \"hinh\" : \"" + sp.getHinh() + "\", \"type\" : \"" + sp.getType() + "\", \"maDM\" : \"" + sp.getMaDM() + "\"}", HttpStatus.OK);
    	return new ResponseEntity<>("{\"status\": \""+status+"\", \"message\" : \""+message+"\" }",HttpStatus.OK);
    }
    
    public Users checkCookie(HttpServletRequest request) {
		Cookie[] cookies = request.getCookies();
		Users account = null;
		String username = "", password = "";
		for (Cookie cookie : cookies) {
			if (cookie.getName().equalsIgnoreCase("username")) {
				username = cookie.getValue();
			}
			if (cookie.getName().equalsIgnoreCase("password")) {
				password = cookie.getValue();
			}
		}
		if (!username.isEmpty() && !password.isEmpty()) {
		//	account = new Users(username, password);
		}
		return account;
	}
    
    public Users findByUsername2(String username){
       
          try {
        	  Session session = factory.getCurrentSession();
      		Users user = (Users) session.get(Users.class, username);
      		return user;
        	  /*
           List<Users> user = new ArrayList<Users>();
            user = session.createQuery("from Users where username=?").setParameter(0, username).list();
            if(user.size() > 0){
                return user.get(0);
            }*/
            
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        
        return null;
    }
    
}
