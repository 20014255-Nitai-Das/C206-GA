
public class PurchaseOrder {

	private int orderNumber;
	private String orderDate;
	private String ingrDesc;
	private int ingrAmt;
	private int count = 8;
	
	private String stallName = Stall.class.getName();

	public PurchaseOrder(int orderNumber, String stallName ,String orderDate, String ingrDesc, int ingrAmt) {
		
		this.orderNumber = orderNumber;
		this.stallName = stallName;
		this.orderDate = orderDate;
		this.ingrDesc = ingrDesc;
		this.ingrAmt = ingrAmt;
		
	}

	public int countLesser() {
		count --;
		return count;
	}
	public String getStallName() {
		return stallName;
	}

	public void setStallName(String stallName) {
		this.stallName = stallName;
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getIngrDesc() {
		return ingrDesc;
	}

	public void setIngrDesc(String ingrDesc) {
		this.ingrDesc = ingrDesc;
	}

	public int getIngrAmt() {
		return ingrAmt;
	}

	public void setIngrAmt(int ingrAmt) {
		this.ingrAmt = ingrAmt;
	}
	
	
	
}
