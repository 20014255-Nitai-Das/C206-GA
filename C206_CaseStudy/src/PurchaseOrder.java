
public class PurchaseOrder {

	private int orderNumber;
	private String orderDate;
	
	public PurchaseOrder(int orderNumber, String orderDate) {
		
		this.orderNumber = orderNumber;
		this.orderDate = orderDate;
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
	
	
	
	
}
