/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.SanPham;
import entity.Users;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Transactional
@Controller
public class HomeController {
    @Autowired
    SessionFactory factory;
    
    @RequestMapping(value = {"index", "home/index"}, method = RequestMethod.GET)
    
    public String index(ModelMap model, HttpSession sessionHttp, HttpServletRequest request){
        String username =(String) sessionHttp.getAttribute("username");
        System.out.println(username);
        if(username == null){
            return "redirect:/login/index.html";
        }else{
            Session session = factory.getCurrentSession();
            
            String hql = "FROM SanPham"; // lấy hết các tài khoản ra
            Query query = session.createQuery(hql);
            query.setFirstResult((int) 0);
            query.setMaxResults((int) 10);
            List<SanPham> list = query.list();
            model.addAttribute("listSPHome", list);
        }
        
        return "index";
    }
    
    
   
}
