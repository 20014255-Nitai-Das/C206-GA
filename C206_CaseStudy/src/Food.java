
public class Food {  // Done by Jolin
	
	private String name; 
	private double price; 
	private String stallName;
	
	public Food(String name, double price, String stallName) {
		this.name = name;
		this.price = price;
		this.stallName = stallName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getStallName() {
		return stallName;
	}

	public void setStallName(String stallName) {
		this.stallName = stallName;
	}
	
}



