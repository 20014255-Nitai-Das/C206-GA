import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	
	// Purchase Order (Nitai)
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


	
	private Food fd1;
	private Food fd2;
	private Food fd3;

	private ArrayList<Food> foodList = new ArrayList<Food>();

	private Stall s1;
	private Stall s2;
	private Stall s3;
	
	private ArrayList<Stall> stallList = new ArrayList<Stall>();


	public C206_CaseStudyTest() {
		super();
	}

	@Before
	public void setUp() throws Exception {
		
		// Purchase Order (Nitai) 
		po1 = new PurchaseOrder(1, "Sushi", "07/08/2021", "Rice", 2);
		po2 = new PurchaseOrder(2, "Western", "07/08/2021", "Chicken", 5);

		poList = new ArrayList<PurchaseOrder>();


		// Food


		fd1 = new Food("Curry Puff", 3.00, "s1");
		fd2 = new Food("Fried Rice", 4.00, "s2");
		fd3 = new Food("Sushi", 3.50, "s3");

		foodList = new ArrayList<Food>();
		
		// Stall (Crystal)
		s1 = new Stall("Curry Puff", "05/06/2021");
		s2 = new Stall("Fried Rice", "03/04/2021");
		s3 = new Stall("Sushi Express", "01/02/2021");
	}

	@Test
	public void testAddPurchaseOrder() {
		//Test if PurchaseOrderList is not null but empty
		assertNotNull("Test if there is valid PurchaseOrder arraylist to add to", poList);

		//Given an empty list, after adding 1 item1, test if the size of the list is 1
		C206_CaseStudyCodes.addPurchaseOrder(poList, po1);
		assertEquals("Test that PurchaseOrder arraylist size is 1", 1, poList.size());
		assertSame("test that PurchaseOrder is added", po1, poList.get(0));

		//Given an empty list, after adding 2 items, test if the size of the list is 2
		C206_CaseStudyCodes.addPurchaseOrder(poList, po2);
		assertEquals("Test that PurchaseOrder arraylist size is 2", 2, poList.size());
		assertSame("test that PurchaseOrder is added", po2, poList.get(1));

	}

	@Test
	public void testRetrieveAllPurchaseOrder() {
	    //Test if PurchaseOrderList is not null but empty
		assertNotNull("Test if there is valid PurchaseOrder arraylist to retrieve purchase ordersfrom", poList);

		 //Test if the list of Purchase order retrieved from the Purchase List is empty
		String allPurchaseOrder = C206_CaseStudyCodes.retrieveAllPurchaseOrder(poList);
		String testOutput = "";
		assertEquals("Test that the retrieved PurchaseOrderlist is empty?", testOutput, allPurchaseOrder);

		 //Test if the expected output string same as the list of Purchase Order retrieved from PurchaseList
		allPurchaseOrder = C206_CaseStudyCodes.retrieveAllPurchaseOrder(poList);
		testOutput = String.format("%-10d %-10 s %-10s %-10s %-10d\n", 1, "Sushi", "07/08/2021", "Rice", 2);
		testOutput = String.format("%-10d %-10s %-10s %-10s %-10d\n", 2, "Western", "07/08/2021", "Chicken ", 5);
		assertEquals("Test that ViewAllPurchaseOrder", testOutput, allPurchaseOrder);
	}

	@Test
	public void testViewPurchaseOrder() {
		//Test if PurchaseOrderList is not null but empty
		assertNotNull("Test if there is valid PurchaseOrder arraylist to view the purchase orders", poList);
		
		 //Test if the list of Purchase orders retrieved from the PurchaseOrderList is empty
	    String allPurchaseOrder = C206_CaseStudyCodes.retrieveAllPurchaseOrder(poList);
	    String testOutput = "";
	    assertEquals("Check that ViewAllPurchaseOrder", testOutput, allPurchaseOrder);

	    //Test if the expected output string same as the list of Purchase Order retrieved from PurchaseOrderList
		allPurchaseOrder = C206_CaseStudyCodes.retrieveAllPurchaseOrder(poList);
		testOutput = String.format("%-10d %-10 s %-10s %-10s %-10d\n", 1, "Sushi", "07/08/2021", "Rice", 2);
		testOutput = String.format("%-10d %-10s %-10s %-10s %-10d\n", 2, "Western", "07/08/2021", "Chicken ", 5);
		assertEquals("Test that ViewAllPurchaseOrder", testOutput, allPurchaseOrder);
	}

	@Test
	public void testEditPurchaseOrder() {
		assertNotNull("Test if there is valid PurchaseOrder arraylist to edit the purchase orders", poList);

	}

	@Test
	public void testDeletePurchaseOrder() {
		//Test if PurchaseOrderList is not null but empty
		assertNotNull("Test if there is valid PurchaseOrder arraylist to delete purchase orders", poList);

		//Test when there is no purchase order in the list the list size is 0
		assertEquals("Test that PurchaseOrder arrayList size is 0", 0, poList.size());

		//Test that when a purchase orders is removed, then the array list's size decreases 
		C206_CaseStudyCodes.addPurchaseOrder(poList, po1);
		C206_CaseStudyCodes.addPurchaseOrder(poList, po2);
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

	
	// Stall
	 public void testAddStall() { 
		 assertNotNull("Test if there is valid Category arraylist to add to", stallList);
		 
		 C206_CaseStudyCodes.addStall();
	     assertEquals("Test that Stall arraylist size is 1", 1, stallList.size());
	     assertSame("Test that Category is added", s2, stallList.get(1));
	     
	     C206_CaseStudyCodes.addStall();
	     assertEquals("Test that Stall arraylist size is 2", 2, stallList.size());
	     assertSame("Test that Category is added", s2, stallList.get(1));
	     
	     C206_CaseStudyCodes.addStall();
	     assertEquals("Test that Stall arraylist size is 3", 3, stallList.size());
	     assertSame("Test that Category is added", s3, stallList.get(1));
	}
	 
	 public void testViewStall() {
		 assertNotNull("Test if there is valid Stall arraylist to add to ", stallList);


	     String allStall = C206_CaseStudyCodes.viewStall(stallList);
	     String testOutput = "";
	     assertEquals("Check that ViewAllStalllist", testOutput, allStall);


	     C206_CaseStudyCodes.addStall();
	     C206_CaseStudyCodes.addStall();
	     assertEquals("Test that Stall arraylist size is 2", 2, stallList.size());


	     allStall = C206_CaseStudyTest.viewStall(stallList);
	     testOutput = String.format("%-20s %-20s\n", "Stall 1", "05/06/2021");
	     testOutput += String.format("%-20s %-20s\n", "Stall 2", "03/04/2021");
	     testOutput += String.format("%-20s %-20s\n", "Stall 3", "01/02/2021");
	     assertEquals("Test that ViewStallList", testOutput, allStall);
	    }
	 


	public void testDeleteStall() {
		 assertNotNull("Test if there is valid Stall arrayList to add to", stallList);

	     stallList.add(s1);
	     stallList.add(s2);
	     stallList.add(s3);
	     assertEquals("Test if that Stall arrayList size is 3?", 3, stallList.size());

	     stallList.remove(s1);
	     assertEquals("Test if that Stall arrayList size is 1", 1, stallList.size());

	     stallList.remove(s2);
	     assertEquals("Test if that Stall arrayList size is 0", 0, stallList.size());

	    }
	
	public void testUpdateStall() {
		assertNotNull("Test if have valid Stall arrayList to update from", stallList);
		boolean isUpdated = false;
		assertFalse("Test if Stall is updated ", isUpdated);
		isUpdated = true;
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
