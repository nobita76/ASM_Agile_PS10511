/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users {
    @Id
    String username;
    String password;
    String email;
    int vaitro;
    
    
    
    public Users(){
        
    }

    public Users(String username, String password, String email, int vaitro) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.vaitro = vaitro;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    
    public String getEmail() {
    	return email;
    }
    public int getVaitro() {
        return vaitro;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void setEmail(String email) {
    	this.email = email;
    }

    public void setVaitro(int vaitro) {
        this.vaitro = vaitro;
    }
    
    
    
}
