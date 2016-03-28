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
		try {
			SalesTransaction s = new SalesTransaction(1, 0.00);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommissionCalculator person = new CommissionCalculator("Bob", 0);
		assertEquals(0.0, person.calculateCommission(), 0.01);
	}
	
	/* test calculateCommission function for experienced employee.
	 * 
	 */
	@Test
	public void testCalculateCommissionExperienced() {
		try {
			SalesTransaction s = new SalesTransaction(1, 0.00);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommissionCalculator person = new CommissionCalculator("Bob", 1);
		assertEquals(0.0, person.calculateCommission(), 0.01);
	}
	
	/* test calculateCommission function for employee.
	 * 
	 */
	@Test
	public void testCalculateCommissionNull() {
		try {
			SalesTransaction s = new SalesTransaction(1, 0.00);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommissionCalculator person = new CommissionCalculator("Bob", 3);
		assertEquals(0.0, person.calculateCommission(), 0.01);
	}

	/* test calculateBonusCommission function for probationary employee.
	 * 
	 */
	@Test
	public void testCalculateBonusCommissionProbationary() {
		try {
			SalesTransaction s = new SalesTransaction(1, 0.00);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommissionCalculator person = new CommissionCalculator("Bob", 0);
		assertEquals(0.0, person.calculateBonusCommission(), 0.01);
	}
	
	/* test calculateBonusCommission function for experienced employee.
	 * 
	 */
	@Test
	public void testCalculateBonusCommissionExperienced() {
		try {
			SalesTransaction s = new SalesTransaction(1, 0.00);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommissionCalculator person = new CommissionCalculator("Bob", 1);
		assertEquals(0.0, person.calculateBonusCommission(), 0.01);
	}

	/* test calculateBonusCommission function for null employee.
	 * 
	 */
	@Test
	public void testCalculateBonusCommissionNull() {
		try {
			SalesTransaction s = new SalesTransaction(1, 0.00);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommissionCalculator person = new CommissionCalculator("Bob", 3);
		assertEquals(0.0, person.calculateBonusCommission(), 0.01);
	}
	
	/*
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	*/


}
