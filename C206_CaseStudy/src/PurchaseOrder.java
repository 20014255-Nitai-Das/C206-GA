
public class PurchaseOrder {

	private int orderNumber;
	private String orderDate;
	private String ingrDesc;
	private int ingrAmt;
	
	public PurchaseOrder(int orderNumber, String orderDate, String ingrDesc, int ingrAmt) {
		
		this.orderNumber = orderNumber;
		this.orderDate = orderDate;
		this.ingrDesc = ingrDesc;
		this.ingrAmt = ingrAmt;
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
