public class Stall {  // Done by Crystal
	
	private String name; 
	private double sellingPrice; 
	
	public Stall(String name, double sellingPrice) {
		this.name = name;
		this.sellingPrice = sellingPrice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSellingPrice() {
		return sellingPrice;
	}

	public void setPrice(double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}
}

