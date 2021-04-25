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
public class SanPham {
    @Id
      @Column(name = "maSP")
      @GeneratedValue(strategy = GenerationType.IDENTITY)
    int maSP;
    String tenSP;
    int DonGia;
    int SoLuong;
    String Hinh;
    String type;
    int maDM;
    
    public SanPham(){
        
    }

    public SanPham(int maSP, String tenSP, int DonGia, int SoLuong, String Hinh, String type, int maDM) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.DonGia = DonGia;
        this.SoLuong = SoLuong;
        this.Hinh = Hinh;
        this.type = type;
        this.maDM = maDM;
    }
    
    
    public int getMaSP() {
        return maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public int getDonGia() {
        return DonGia;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public String getHinh() {
        return Hinh;
    }

    public String getType() {
        return type;
    }

    public int getMaDM() {
        return maDM;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public void setDonGia(int DonGia) {
        this.DonGia = DonGia;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public void setHinh(String Hinh) {
        this.Hinh = Hinh;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMaDM(int maDM) {
        this.maDM = maDM;
    }
    
    
    
}
