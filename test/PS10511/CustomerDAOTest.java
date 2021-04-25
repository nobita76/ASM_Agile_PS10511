package PS10511;

import org.junit.BeforeClass;
import org.springframework.beans.factory.annotation.Autowired;

import dao.productDAO;

public class CustomerDAOTest {
	@Autowired
	static
	productDAO productDAO;
	
	@BeforeClass
	public static void setup() {
		productDAO = new productDAO();
	}
}
