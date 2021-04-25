package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import entity.DanhMuc;
import entity.SanPham;

public class dmDAO {
	public ArrayList getList(){
        ArrayList<DanhMuc> list = new ArrayList<DanhMuc>();
        
        Connection con = new MyConnect().getcn();
        System.out.println(con);
        if(con == null){
            return null;
        }
        
        try {
            String sql = "SELECT * FROM DanhMuc";
               PreparedStatement ps = con.prepareStatement(sql);
               ResultSet rs = ps.executeQuery();
               while(rs.next()){
                   DanhMuc dm = new DanhMuc(rs.getInt(1), rs.getString(2));
                   list.add(dm);
                   
               }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return list;
    }

	
	public DanhMuc getDMbyMaDM(int maDM)
    {
        DanhMuc danhmuc = null;
        
        Connection cn = new MyConnect().getcn();
        if (cn == null)
        {
            // không kết nối được
            return null;
        }
        
        try {
            String sql = "select * from DanhMuc where madm = ?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, maDM);
            ResultSet rs = ps.executeQuery();
            if (rs.next())
            {
            	danhmuc = new DanhMuc(rs.getInt(1), rs.getString(2));
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return danhmuc;
                
    }
	
	public int insertDM(DanhMuc dm){
        int kq = 0;
        Connection con = new MyConnect().getcn();
        if (con == null)
            return -1; // ket noi khong duoc ===> ket thuc ham luon
        try {
            String sql = "INSERT INTO DanhMuc(tenDM) values(N'"+dm.getTenDM()+"') SET IDENTITY_INSERT DanhMuc OFF";
            //String sql = new String(("SET IDENTITY_INSERT SanPham ON INSERT INTO SanPham(MaSP, tenSP, DonGia, SoLuong, Hinh, maDM) values(?, ?, ?, ?, ?, ?) SET IDENTITY_INSERT SanPham OFF").getBytes(), "UTF-16");

            PreparedStatement ps = con.prepareStatement(sql);
            
            
           // ps.setInt(1, sp.getMaSP());
           // ps.setString(1, sp.getTenSP());
           
      
            
            kq = ps.executeUpdate();
            System.out.println(kq);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return kq;
    }
	
	public int updateDM(DanhMuc a)
    {
        int kq=0;
        Connection cn = new MyConnect().getcn();
        if(cn == null)
            return -1;
        
        try {
            String sql = "update DanhMuc set tenDM=? where MaDm=?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, a.getTenDM());
            ps.setInt(2, a.getMaDM());
            
            kq = ps.executeUpdate(); // update thành công trả về  1
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return kq;
    }

}
