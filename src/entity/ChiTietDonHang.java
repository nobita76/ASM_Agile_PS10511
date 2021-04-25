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
 * @author home
 */
@Entity
public class ChiTietDonHang {
    @Id
            @Column(name = "stt")
      @GeneratedValue(strategy = GenerationType.IDENTITY)
    int stt;
    @Column(name = "maDH")
     int maDH;
    @Column(name = "maSP")
     int maSP;
    @Column(name = "donGia")
     int donGia;
    @Column(name = "soLuong")
     int soLuong;
    @Column(name = "trangthai")
     int trangthai;
    @Column(name = "NgayDatHang")
     String NgayDatHang;
    @Column(name = "username")
     String username;
    @Column(name = "address")
     String address;

    public void setStt(int stt) {
        this.stt = stt;
    }

    public int getStt() {
        return stt;
    }

    public ChiTietDonHang(int stt, int maDH, int maSP, int donGia, int soLuong, int trangthai, String NgayDatHang, String username, String address) {
        this.stt = stt;
        this.maDH = maDH;
        this.maSP = maSP;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.trangthai = trangthai;
        this.NgayDatHang = NgayDatHang;
        this.username = username;
        this.address = address;
    }

    public ChiTietDonHang(int maDH, int maSP, int donGia, int soLuong, int trangthai, String NgayDatHang, String username, String address) {
        this.maDH = maDH;
        this.maSP = maSP;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.trangthai = trangthai;
        this.NgayDatHang = NgayDatHang;
        this.username = username;
        this.address = address;
    }
    public ChiTietDonHang()
    {
        
    }

    public String getNgayDatHang() {
        return NgayDatHang;
    }

    public String getUsername() {
        return username;
    }

    public String getAddress() {
        return address;
    }

    public void setNgayDatHang(String NgayDatHang) {
        this.NgayDatHang = NgayDatHang;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    

    public void setTrangthai(int trangthai) {
        this.trangthai = trangthai;
    }

    public int getTrangthai() {
        return trangthai;
    }


    public int getMaDH() {
        return maDH;
    }

    public void setMaDH(int maDH) {
        this.maDH = maDH;
    }

    public int getMaSP() {
        return maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
}
