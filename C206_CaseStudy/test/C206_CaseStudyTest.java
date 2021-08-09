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

		poList = new ArrayList<PurchaseOrder>();

		// Food

		fd1 = new Food("Curry Puff", 3.00, "s1");
		fd1 = new Food("Fried Rice", 4.00, "s2");
		fd1 = new Food("Sushi", 3.50, "s3");

		foodList = new ArrayList<Food>();
	}

	@Test
	public void testAddPurchaseOrder() {
		assertNotNull("Test if there is valid PurchaseOrder arraylist to add to", poList);

		C206_CaseStudyCodes.addPurchaseOrder(poList, po1);
		assertEquals("Test that PurchaseOrder arraylist size is 1", 1, poList.size());
		assertSame("test that PurchaseOrder is added", po1, poList.get(0));

		C206_CaseStudyCodes.addPurchaseOrder(poList, po2);
		assertEquals("Test that PurchaseOrder arraylist size is 2", 2, poList.size());
		assertSame("test that PurchaseOrder is added", po2, poList.get(1));

	}

	@Test
	public void testRetrieveAllPurchaseOrder() {
		assertNotNull("Test if there is valid PurchaseOrder arraylist to retrieve purchase ordersfrom", poList);

		String allPurchaseOrder = C206_CaseStudyCodes.retrieveAllPurchaseOrder(poList);
		String testOutput = "";
		assertEquals("Test that the retrieved PurchaseOrderlist is empty?", testOutput, allPurchaseOrder);

		allPurchaseOrder = C206_CaseStudyCodes.retrieveAllPurchaseOrder(poList);
		testOutput = String.format("%-10d %-10 s %-10s %-10s %-10d\n", 1, "Sushi", "07/08/2021", "Rice", 2);
		testOutput = String.format("%-10d %-10s %-10s %-10s %-10d\n", 2, "Western", "07/08/2021", "Chicke ", 5);
		assertEquals("Test that ViewAllPurchaseOrder", testOutput, allPurchaseOrder);
	}

	@Test
	public void testViewPurchaseOrder() {
		assertNotNull("Test if there is valid PurchaseOrder arraylist to view the purchase orders", poList);

	}

	@Test
	public void testEditPurchaseOrder() {
		assertNotNull("Test if there is valid PurchaseOrder arraylist to edit the purchase orders", poList);

	}

	@Test
	public void testDeletePurchaseOrder() {
		assertNotNull("Test if there is valid PurchaseOrder arraylist to delete purchase orders", poList);

		assertEquals("Test that PurchaseOrder arrayList size is 0", 0, poList.size());

		C206_CaseStudyCodes.addPurchaseOrder(poList, po1);
		C206_CaseStudyCodes.addPurchaseOrder(poList, po1);
		poList.remove(po1);
		assertEquals("Test that PurchaseOrder arraylist is 1 ", 1, poList.size());

	}

	// Food
	public void testAddFood() {
		assertNotNull("Test that foodList is not null before a new item can be added to it", foodList);
	}

	public void testViewFood() {
		assertNotNull("Test that foodList is not null before the food items in the menu can be viewed", foodList);
	}

	public void testDeleteFood() {
		assertNotNull("Test that foodList is not null before an item can be deleted", foodList);
	}

	public void testEditFood() {
		assertNotNull("Test that foodList is not null before the food items in the menu can be edited", foodList);
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
