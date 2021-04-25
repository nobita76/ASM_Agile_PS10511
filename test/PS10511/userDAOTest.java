package PS10511;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer.Alphanumeric;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;

import dao.userDAO;
import entity.Users;




//@TestMethodOrder(Alphanumeric.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class userDAOTest {
	@Autowired
	static
	userDAO userDAO;
	
	@BeforeClass
	public static void setup() {
		userDAO = new userDAO();
	}
	//Thêm runner
	@Test
	public void FTestGetAll() {
		ArrayList<Users> list = userDAO.getAll();
		assertTrue(list != null);
	}
	@Test
	public void ATestLoginSuccess() {
		
		insertAccount("testLoginSuccess", "testLoginSuccess", "testLoginSuccess@gmail.com");
		String userName = "testLoginSuccess";
		String passWord = "testLoginSuccess";
		
		assertTrue(userDAO.checkLogin(userName, passWord));
	}
	
	@Test
	public void DDeleteUser() {
		insertAccount("testDelete", "testDelete", "testDelete@gmail.com");

		userDAO.deleteAccount("testDelete");
		Users newUser;
		try {
			newUser = userDAO.findByUsername("testDelete");
			assertTrue(newUser == null);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void CTestAddUser() {
		deleteAccount("testAddUser");
		Users u = new Users();
		u.setUsername("testAddUser");
		u.setPassword("testAddUser");
		u.setEmail("testAddUser@gmail.com");
		u.setVaitro(0);
		
		userDAO.addNewUser(u);
		Users newUser;
		try {
			newUser = userDAO.findByUsername("testAddUser");
			assertTrue(newUser != null);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	@Test
	public void BTestLoginFail() {
		//thêm message
		assertFalse(userDAO.checkLogin("ps10511", "abc"));
		assertFalse(userDAO.checkLogin("dangnhapthatbai", "abc"));
		assertFalse(userDAO.checkLogin("abc", "111111"));
	}
	
	@Test
	public void ETestFindUsername() throws SQLException {
		String userName = "ps10511";
		Users user = userDAO.findByUsername(userName);
		assertTrue(user != null);
	}
	
	public void insertAccount(String usenrame, String password, String email) {
		Users u = new Users();
		u.setUsername(usenrame);
		u.setPassword(password);
		u.setEmail(email);
		u.setVaitro(0);
		
		userDAO.addNewUser(u);
	}
	public void deleteAccount(String username) {
		userDAO.deleteAccount(username);
	}
	
	
}
