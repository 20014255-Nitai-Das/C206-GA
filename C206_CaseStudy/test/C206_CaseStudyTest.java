import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	private PurchaseOrder po1;
	private PurchaseOrder po2;
	private PurchaseOrder po3;
	private PurchaseOrder po4;
	private PurchaseOrder po5;
	private PurchaseOrder po6;
	private PurchaseOrder po7;
	private PurchaseOrder po8;
	private PurchaseOrder po9;

	private ArrayList<PurchaseOrder> poList = new ArrayList<PurchaseOrder>(8);
	
	// Food 
	private Food fd1;
	private Food fd2;
	private Food fd3;
	
	private ArrayList<Food> foodList = new ArrayList<Food>();
    
	public C206_CaseStudyTest() {
		super();
	}

	@Before
	public void setUp() throws Exception {
		po1 = new PurchaseOrder(1, "Sushi", "07/08/2021", "Rice", 2);
		po2 = new PurchaseOrder(2, "Western", "07/08/2021", "Chicken", 5);
		po3 = new PurchaseOrder(3, "Chicken Rice", "07/08/2021", "Chicken", 5);
		po4 = new PurchaseOrder(4, "Western", "07/08/2021", "mayo", 7);
		po5 = new PurchaseOrder(5, "Korean", "07/08/2021", "Kimchi", 9);
		po6 = new PurchaseOrder(6, "Indian", "07/08/2021", "Mutton", 2);
		po7 = new PurchaseOrder(7, "Drinks", "07/08/2021", "Sugar", 4);
		po8 = new PurchaseOrder(8, "Mix Veg. Rice", "07/08/2021", "Soy sauce", 6);
		po9 = new PurchaseOrder(9, "Drinks", "07/08/2021", "Milo", 8);

		poList = new ArrayList<PurchaseOrder>();
		
		// Food 
		
		fd1 = new Food("Curry Puff", 3.00, "s1");
		fd1 = new Food("Fried Rice", 4.00, "s2");
		fd1 = new Food("Sushi", 3.50, "s3");
		
		foodList = new ArrayList<Food>();
	}

	public void testAddPurchaseOrder() {
		assertNotNull("Test if there is valid PurchaseOrder arraylist to add to", poList);

		C206_CaseStudyCodes.addPurchaseOrder(poList, po1);
		assertEquals("Test that PurchaseOrder arraylist size is 1", 1, poList.size());
		assertSame("test that PurchaseOrder is added", po1, poList.get(0));

		C206_CaseStudyCodes.addPurchaseOrder(poList, po2);
		assertEquals("Test that PurchaseOrder arraylist size is 2", 2, poList.size());
		assertSame("test that PurchaseOrder is added", po2, poList.get(1));

	}

	public void testRetrieveAllPurchaseOrder() {
		assertNotNull("Test if there is valid PurchaseOrder arraylist to retrieve purchase ordersfrom", poList);

		String allPurchaseOrder = C206_CaseStudyCodes.retrieveAllPurchaseOrder(poList);
		String testOutput = "";
		assertEquals("Test that the retrieved PurchaseOrderlist is empty?", testOutput, allPurchaseOrder);

		allPurchaseOrder = C206_CaseStudyCodes.retrieveAllPurchaseOrder(poList);
		testOutput = String.format("%-10d %-10s %-10s %-10s %-10d\n", 1, "Sushi", "07/08/2021", "Rice", 2);
		testOutput = String.format("%-10d %-10s %-10s %-10s %-10d\n", 2, "Western", "07/08/2021", "Chicken", 5);
		assertEquals("Test that ViewAllPurchaseOrder",testOutput,allPurchaseOrder);
	}

	public void testEditPurchaseOrder() {
		assertNotNull("Test if there is valid PurchaseOrder arraylist to edit the purchase orders", poList);

	}
	
	public void testDeletePurchaseOrder() {
		assertNotNull("Test if there is valid PurchaseOrder arraylist to delete purchase orders", poList);

	}

	// Food 
	public void testAddFood() {
		
	}
	
	public void testViewFood() {
		
	}
	
	public void testDeleteFood() {
		
	}
	
	public void testEditFood() {
		
	}
	
	
	@After
	public void tearDown() throws Exception {
		po1 = null;
		po2 = null;
		po3 = null;
		po4 = null;
		po5 = null;
		po6 = null;
		po7 = null;
		po8 = null;
		po9 = null;

		poList = null;

	}

	@Test
	public void c206_test() {
		// fail("Not yet implemented");
		assertTrue("C206_CaseStudy_SampleTest ", true);
		
	}

}
