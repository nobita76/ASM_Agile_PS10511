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

/**
 *
 * @author HOME
 */
@Entity
public class DonHang {
    @Id
            @Column(name = "MaDH")
      @GeneratedValue(strategy = GenerationType.IDENTITY)
                  
    int MaDH;
    String NgayDatHang;
    
    String username;
    String address;
    
    public DonHang(){
        
    }

    public DonHang(int MaDH, String NgayDatHang, String username, String address) {
        this.MaDH = MaDH;
        this.NgayDatHang = NgayDatHang;
        this.username = username;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    

    public int getMaDH() {
        return MaDH;
    }

    public String getNgayDatHang() {
        return NgayDatHang;
    }

    public String getUsername() {
        return username;
    }

    public void setMaDH(int MaDH) {
        this.MaDH = MaDH;
    }

    public void setNgayDatHang(String NgayDatHang) {
        this.NgayDatHang = NgayDatHang;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    
}
