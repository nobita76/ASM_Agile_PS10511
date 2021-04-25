/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author HOME
 */
public class PS10511 {
    private int maDH;
    private int maSP;
    private int donGia;
    private int soLuong;
    private int trangthai;
    String NgayDatHang;
    
    String username;
    String address;

    public PS10511() {
    }

    public PS10511(int maDH, int maSP, int donGia, int soLuong, int trangthai, String NgayDatHang, String username, String address) {
        this.maDH = maDH;
        this.maSP = maSP;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.trangthai = trangthai;
        this.NgayDatHang = NgayDatHang;
        this.username = username;
        this.address = address;
    }

    public int getMaDH() {
        return maDH;
    }

    public int getMaSP() {
        return maSP;
    }

    public int getDonGia() {
        return donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public int getTrangthai() {
        return trangthai;
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

    public void setMaDH(int maDH) {
        this.maDH = maDH;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setTrangthai(int trangthai) {
        this.trangthai = trangthai;
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
    
}
