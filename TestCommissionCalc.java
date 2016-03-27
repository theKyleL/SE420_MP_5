import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 
 */

/**
 * @author JAG
 *
 */
public class TestCommissionCalc {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/* test calculateCommission function for probationary employee.
	 * 
	 */
	@Test
	public void testCalculateCommissionProbationary() {
		CommissionCalculator person = new CommissionCalculator("Bob", 0);
		assertEquals(0.0, person.calculateCommission(), 0.01);
	}
	
	/* test calculateCommission function for experienced employee.
	 * 
	 */
	@Test
	public void testCalculateCommissionExperienced() {
		CommissionCalculator person = new CommissionCalculator("Bob", 1);
		assertEquals(0.0, person.calculateCommission(), 0.01);
	}
	
	/* test calculateCommission function for experienced employee.
	 * 
	 */
	@Test
	public void testCalculateCommissionNull() {
		CommissionCalculator person = new CommissionCalculator("Bob", 3);
		assertEquals(0.0, person.calculateCommission(), 0.01);
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}


}
