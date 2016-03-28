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
		person.addSale(0, 1000);
		person.addSale(0, 1000);
		assertEquals(0.0, person.calculateCommission(), 0.01);
	}
	
	/* test calculateCommission function for probationary employee.
	 * Should already have met minimum requirement for probation.
	 */
	@Test
	public void testCalculateCommissionProbationaryAlreadyMetMinimum() {
		CommissionCalculator person = new CommissionCalculator("Bob", 0);
		person.addSale(0, 1000);
		person.addSale(0, 1000);
		person.addSale(0, 1000);
		assertEquals(0.0, person.calculateCommission(), 0.01);
	}
	
	/* test calculateCommission function for experienced employee.
	 * 
	 */
	@Test
	public void testCalculateCommissionExperienced() {
		CommissionCalculator person = new CommissionCalculator("Bob", 1);
		person.addSale(0, 1000);
		person.addSale(0, 1000);
		assertEquals(0.0, person.calculateCommission(), 0.01);
	}
	
	/* test calculateCommission function for employee.
	 * 
	 */
	@Test
	public void testCalculateCommissionNull() {
		CommissionCalculator person = new CommissionCalculator("Bob", 3);
		person.addSale(0, 1000);
		person.addSale(0, 1000);
		boolean flag = false;
		try {
			SalesTransaction s = new SalesTransaction(4, 5000.00);
		} catch (Exception e) {
			flag = true;
		}
			assertTrue(flag);
	}

	/* test calculateBonusCommission function for probationary employee.
	 * 
	 */
	@Test
	public void testCalculateBonusCommissionProbationary() {
		CommissionCalculator person = new CommissionCalculator("Bob", 0);
		person.addSale(0, 1000);
		person.addSale(0, 1000);
		person.addSale(0, 1000);
		assertEquals(0.0, person.calculateBonusCommission(), 0.01);
	}
	
	/* test calculateBonusCommission function for experienced employee.
	 * 
	 */
	@Test
	public void testCalculateBonusCommissionExperienced() {
		CommissionCalculator person = new CommissionCalculator("Bob", 1);
		person.addSale(0, 1000);
		person.addSale(0, 1000);
		assertEquals(0.0, person.calculateBonusCommission(), 0.01);
	}

	/* test calculateBonusCommission function for null employee.
	 * 
	 */
	@Test
	public void testCalculateBonusCommissionNull() {
		CommissionCalculator person = new CommissionCalculator("Bob", 3);
		person.addSale(0, 1000);
		person.addSale(0, 1000);
		assertEquals(0.0, person.calculateBonusCommission(), 0.01);
	}
	
	/* test calculateCommission function probationary employee.
	 * advanced cases need to test that minum sales have been made to meet commission requirements.
	 */
	@Test
	public void testCalculateCommissionProbation() {
		CommissionCalculator person = new CommissionCalculator("Bob", 1);
		person.addSale(0, 1000);
		person.addSale(0, 1000);
		assertEquals(0.0, person.calculateCommission(), 0.01);
	}
	
	/*
	 * 
	 */
	@Test
	public void testInvalidTransactionType() {
		boolean flag = false;
		try {
			SalesTransaction s = new SalesTransaction(4, 5000.00);
		} catch (Exception e) {
			flag = true;
		}
			assertTrue(flag);
	}
	
	/*
	 *  Test that the salesTransaction() constructor throws an exception upon receiving an invalid amount.
	 *  
	 */
	@Test
	public void testInvalidTransactionAmount() {
		boolean flag = false;
		try {
			SalesTransaction s = new SalesTransaction(2, -5000.00);
		} catch (Exception e) {
			flag = true;
		}
		if(!flag) fail();
		assertTrue(flag); // expecting thrown exception
	}
	
	/* test getTotalSales() function.
	 * 
	 */
	@Test
	public void testGetTotalSales() {
		CommissionCalculator person = new CommissionCalculator("Bob", 0);
		person.addSale(0, 1000);
		person.addSale(0, 1000);
		assertEquals(2000.00, person.getTotalSales(), 0.01);
	}
	
	/* test getName() function for employee.
	 * 
	 */
	@Test
	public void testGetName() {
		CommissionCalculator person = new CommissionCalculator("Bob", 0);
		assertEquals("Bob", person.getName());
	}
	
	/*
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	*/


}
