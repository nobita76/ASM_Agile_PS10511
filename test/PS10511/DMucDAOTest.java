package PS10511;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import dao.dmDAO;
import entity.DanhMuc;
import entity.SanPham;

public class DMucDAOTest {
	@Autowired
	static
	dmDAO dmDAO;
	
	@BeforeClass
	public static void setup() {
		dmDAO = new dmDAO();
	}
	
	@Test
	public void getAll() {
		ArrayList<DanhMuc> list = dmDAO.getList();
		assertNotNull(list);
		//assertTrue(list != null);
	}
	
	@Test
	public void findByIdNotNull() {
		int value = 1;
		DanhMuc dm = dmDAO.getDMbyMaDM(value);
		assertNotNull(dm);
		//assertTrue(dm != null);
	}
	@Test
	public void findByIdNull() {
		int value = 1000;
		DanhMuc dm = dmDAO.getDMbyMaDM(value);
		assertNotNull("Check find by id null",dm);
		
		//assertTrue(dm != null);
	}
	
	@Test
	public void addNewDM() throws Exception {
		DanhMuc dm = new DanhMuc();
		//Thêm delete trước khi insert
		dm.setTenDM("Bùi Ngọc Thành");
		dmDAO.insertDM(dm); 
	}
	public void addNewDMNull() throws Exception {
		DanhMuc dm = new DanhMuc();
		//Thêm delete trước khi insert
		dm.setTenDM(null);
		dmDAO.insertDM(dm); 
	}
	/*
	 * Thêm trường hợp insert null
	 * 
	 */
	
	@Test
	public void updateDM() {
		DanhMuc dm = dmDAO.getDMbyMaDM(5);
		dm.setTenDM("DM Updated PS10511");
		dmDAO.updateDM(dm);
		DanhMuc actual = dmDAO.getDMbyMaDM(5);
		assertEquals(actual.getTenDM(), "DM Updated PS10511");
	}
	//Thêm update từ sp null - không tồn tại
}
