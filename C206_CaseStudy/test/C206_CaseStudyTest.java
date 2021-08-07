import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
private PurchaseOrder po1;
private PurchaseOrder po2; 

private ArrayList<PurchaseOrder> poList;

public C206_CaseStudyTest() {
	super();
}
	@Before
	public void setUp() throws Exception {
		po1 = new PurchaseOrder(1,"Sushi","09/08/2021", "Rice", 2);
		po2 = new PurchaseOrder(2,"Western","07/08/2021", "Chicken", 5);
		
		poList = new ArrayList<PurchaseOrder>();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void c206_test() {
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
	}

}
