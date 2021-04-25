package PS10511;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
 userDAOTest.class, 
 ProductDaoTest.class, 
 DMucDAOTest.class, 
 })
public class TestSuite {

}
