/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DanhMuc {
    @Id
             @Column(name = "MaDM")
      @GeneratedValue(strategy = GenerationType.IDENTITY)
    int MaDM;
    String tenDM;
    
    public DanhMuc(){
        
    }

    public DanhMuc(int MaDM, String tenDM) {
        this.MaDM = MaDM;
        this.tenDM = tenDM;
    }

    public int getMaDM() {
        return MaDM;
    }

    public String getTenDM() {
        return tenDM;
    }

    public void setMaDM(int MaDM) {
        this.MaDM = MaDM;
    }

    public void setTenDM(String tenDM) {
        this.tenDM = tenDM;
    }
    
    
}
