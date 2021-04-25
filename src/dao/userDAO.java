/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import controller.AccountController;
import entity.Users;

/**
 *
 * @author HOME
 */
public class userDAO {
    
    
public static ArrayList getAll(){
        
        ArrayList<Users> list = new ArrayList();
        
         Connection con = new MyConnect().getcn();
        if (con == null){
          return null; // ket noi khong duoc ===> ket thuc ham luon

        }
        try {
            String sql = "select * from Users";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(); 
            
            while(rs.next()){
                Users acc = new Users();
                acc.setUsername(rs.getString(1));
                acc.setPassword(rs.getString(2));
                acc.setEmail(rs.getString(3));
                acc.setVaitro(rs.getInt(4));
                list.add(acc);
                
                
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        System.out.println(list);
        
        
        return list;
        
    }
    public boolean checkLogin(String username, String password){
          
        Users test;
		try {
			test = findByUsername(username);
			if(test == null){
	            return false;
	        }else{
	            if(test.getPassword().equals(password)){
	                return true;
	            }else{
	                return false;
	            }
	        }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        /*if(test == null){
            return false;
        }else{
            if(test.getPassword().equals(password)){
                return true;
            }else{
                return false;
            }
        }*/
		return false;
    }
    
    public Users findByUsername(String username) throws SQLException {
    	Connection cn = new MyConnect().getcn();
    	String sql = "select * from users WHERE username = ?";
        PreparedStatement ps = cn.prepareStatement(sql);
        ps.setString(1, username);
        ResultSet rs = ps.executeQuery(); 
        if(rs.next()) {
        	Users user = new Users();
        	user.setUsername(rs.getString(1));
        	user.setPassword(rs.getString(2));
       
        	System.out.println(rs.getString(1)+"_"+rs.getString(2));
        	return user;
        }
		return null;
    	
    }

    public int addNewUser(Users acc){
        int kq = 0;
        Connection con = new MyConnect().getcn();
        if (con == null)
            return -1; // ket noi khong duoc ===> ket thuc ham luon
        try {
            String sql = "insert into users values(?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, acc.getUsername());
            ps.setString(2, acc.getPassword());
            ps.setInt(3, acc.getVaitro());
            kq = ps.executeUpdate();
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return kq;
    }
    
    public int updateAccount(Users a) {
        //1. khai bao
        int kq = 0;
        Connection con = new MyConnect().getcn();
        if (con == null) {
            return -1; 
        }
        try {
            String sql = "update users set password = ?, vaitro = ?  where username = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, a.getPassword());
            ps.setInt(2, a.getVaitro());
            ps.setString(3, a.getUsername());
            kq = ps.executeUpdate();

            ps.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kq; 
    }
    
    public int deleteAccount(String username) {
        //1. khai bao
        int kq = 0;
        Connection con = new MyConnect().getcn();
        if (con == null) {
            return -1; 
        }
        try {
            String sql = "DELETE FROM users WHERE username = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, username);
            kq = ps.executeUpdate();

            ps.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kq; 
    }
}
