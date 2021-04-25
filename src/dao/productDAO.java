package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import entity.SanPham;

public class productDAO {
	public ArrayList getList(){
        ArrayList<SanPham> list = new ArrayList<SanPham>();
        
        Connection con = new MyConnect().getcn();
        System.out.println(con);
        if(con == null){
            return null;
        }
        
        try {
            String sql = "SELECT * FROM SanPham";
               PreparedStatement ps = con.prepareStatement(sql);
               ResultSet rs = ps.executeQuery();
               while(rs.next()){
                   SanPham sp = new SanPham(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getInt(7));
                   list.add(sp);
                   
               }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return list;
    }

	public SanPham getSanPhamByMaSP(int masp)
    {
        SanPham sanpham = null;
        
        Connection cn = new MyConnect().getcn();
        if (cn == null)
        {
            // không kết nối được
            return null;
        }
        
        try {
            String sql = "select * from SanPham where masp = ?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, masp);
            ResultSet rs = ps.executeQuery();
            if (rs.next())
            {
                sanpham = new SanPham(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getInt(7));

                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sanpham;
                
    }
	
	public int insertProduct(SanPham sp){
        int kq = 0;
        Connection con = new MyConnect().getcn();
        if (con == null)
            return -1; // ket noi khong duoc ===> ket thuc ham luon
        try {
            String sql = "INSERT INTO SanPham(tenSP, DonGia, SoLuong, Hinh, type, maDM) values(N'"+sp.getTenSP()+"', ?, ?, ?, ?, ?) SET IDENTITY_INSERT SanPham OFF";
            //String sql = new String(("SET IDENTITY_INSERT SanPham ON INSERT INTO SanPham(MaSP, tenSP, DonGia, SoLuong, Hinh, maDM) values(?, ?, ?, ?, ?, ?) SET IDENTITY_INSERT SanPham OFF").getBytes(), "UTF-16");

            PreparedStatement ps = con.prepareStatement(sql);
            
            
           // ps.setInt(1, sp.getMaSP());
           // ps.setString(1, sp.getTenSP());
            ps.setInt(1, sp.getDonGia());
            ps.setInt(2, sp.getSoLuong());
            ps.setString(3, sp.getHinh());
            ps.setString(4, sp.getType());
            ps.setInt(5, sp.getMaDM()); 
      
            
            kq = ps.executeUpdate();
            System.out.println(kq);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return kq;
    }
	public int updateSanPham(SanPham a)
    {
        int kq=0;
        Connection cn = new MyConnect().getcn();
        if(cn == null)
            return -1;
        
        try {
            String sql = "update SanPham set TenSP=?,DonGia=?,SoLuong=?,Hinh=?,MaDM=?,type=? where MaSP=?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, a.getTenSP());
            ps.setInt(2, a.getDonGia());
            ps.setInt(3, a.getSoLuong());
            ps.setString(4, a.getHinh());
            ps.setInt(5, a.getMaDM());
            ps.setString(6, a.getType());
            ps.setInt(7, a.getMaSP());
            kq = ps.executeUpdate(); // update thành công trả về  1
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return kq;
    }
	public int deleteSanPham(int maSP)
    {
        int kq=0;
        Connection cn = new MyConnect().getcn();
        if(cn == null)
            return -1;
        
        try {
            String sql = "DELETE FROM SanPham WHERE maSP = ?";
            PreparedStatement ps = cn.prepareStatement(sql);
            
            ps.setInt(1, maSP);
            kq = ps.executeUpdate(); // update thành công trả về  1
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return kq;
    }
}
