package PS10511;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


import dao.productDAO;
import dao.userDAO;
import entity.SanPham;
import entity.Users;

public class ProductDaoTest {
	@Autowired
	static
	productDAO productDAO;
	
	@BeforeClass
	public static void setup() {
		productDAO = new productDAO();
	}
	
	@Test
	public void getAll() {
		ArrayList<SanPham> list = productDAO.getList();
		assertTrue(list != null);
	}
	
	@Test
	public void findById() {
		int value = 1;
		SanPham sp = productDAO.getSanPhamByMaSP(value);
		assertTrue(sp != null);
	}
	
	@Test
	public void addNewSanPham() throws Exception {
		SanPham sp = productDAO.getSanPhamByMaSP(1);
		sp.setMaSP(0);
		sp.setTenSP("New Prod PS10511");
		productDAO.insertProduct(sp); 
	}
	
	@Test
	public void updateSP() {
		SanPham sp = productDAO.getSanPhamByMaSP(10);
		sp.setTenSP("Nokia Updated PS10511");
		productDAO.updateSanPham(sp);
		SanPham actual = productDAO.getSanPhamByMaSP(10);
		assertEquals(actual.getTenSP(), "Nokia Updated PS10511");
	}
	
	@Test
	public void updateSPNull() throws Exception {
		SanPham sp = productDAO.getSanPhamByMaSP(10);
		sp.setTenSP(null);
		int kq = productDAO.updateSanPham(sp);
		assertTrue(kq == 1);
	}
	//Thêm update tên sp null
	
	public void deleteSP() {
		SanPham sp = productDAO.getSanPhamByMaSP(1);
		sp.setMaSP(0);
		sp.setTenSP("New Prod PS10511");
		productDAO.insertProduct(sp); 
	}
	
}
