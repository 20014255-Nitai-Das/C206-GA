import java.util.ArrayList;

public class C206_CaseStudyCodes {

	public static  final ArrayList<PurchaseOrder> poList = new ArrayList<PurchaseOrder>();
	public static  final ArrayList<Food> foodList = new ArrayList<Food>();
	
	public static void main(String[] args) {

		
		
		Food f1 = new Food("Curry Puff", 1.50);
		Food f2 = new Food("Fried Rice", 3.50);
		Food f3 = new Food("Sushi", 2.00);
		foodList.add(f1);
		foodList.add(f2);
		foodList.add(f3);
		
		int option = 0;

		while (option != 4) {
			C206_CaseStudyCodes.userMenu();
			option = Helper.readInt("Enter your choice > ");

			if (option == 1) { // Food
				
				int caOption = 0;

				while (caOption != 5) {
					CanAdmMenu();
					caOption = Helper.readInt("Enter option > ");

					if (caOption == 1) {
						addFood();
					} 
					else if (caOption == 2) {
						viewFood();
					} 
					else if (caOption == 3) {
//						deletePurchaseOrder();
					} else {
						System.out.println("Invalid option!");
					}
					
				}
			
			}
			
			else if (option == 2) {

				int ssOption = 0;

				while (ssOption != 5) {
					StallStaffMenu();
					ssOption = Helper.readInt("Enter option > ");

					if  (ssOption == 1) {
						addPurchaseOrder();
					}
					else if (ssOption == 2) {
						viewPurchaseOrder();
					}
					else if (ssOption == 3) {
						editPurchaseOrder();
					}
					else if (ssOption == 4) {
						deletePurchaseOrder();
					}else {
						System.out.println("Invalid option!");
					}
					
				}
			} else if (option == 3) {
				CustomerMenu();
			} else if (option == 4) {
				System.out.println("Goodbye!");
			}else {
				System.out.println("Invalid option!");
			}
		}
	}

	public static void userMenu() {

		Helper.line(50, "=");
		System.out.println("Who is using?");
		System.out.println("1. Canteen Administrator");
		System.out.println("2. Stall staff ");
		System.out.println("3. Customer");
		System.out.println("4. Exit");
		Helper.line(50, "=");

	}

	public static void CanAdmMenu() {
		Helper.line(50, "-");
		System.out.println("Canteen Administrator Menu");
		Helper.line(50, "-");

	}

	public static void StallStaffMenu() {
		Helper.line(50, "-");
		System.out.println("Staff Stall  Menu");
		Helper.line(50, "-");
		System.out.println("1. Add Purchase Order");
		System.out.println("2. View Purchase Order");
		System.out.println("3. Change Purchase Order");
		System.out.println("4. Delete Purchase Order");
	}

	public static void CustomerMenu() {
		Helper.line(50, "-");
		System.out.println("Customer Menu");
		Helper.line(50, "-");

	}

	public static void addPurchaseOrder() {
		Helper.line(50, "-");
		System.out.println("View Purchase Order");
		Helper.line(50, "-");
		System.out.println();

		int ordNum = Helper.readInt("Enter Order Number > ");
		String ordDate = Helper.readString("Enter Order Date (dd/mm/yyyy) > ");
		String ingrDesc = Helper.readString("Enter ingredients Description > ");
		int ingrAmt = Helper.readInt("Enter ingredients amount > ");

		PurchaseOrder po = new PurchaseOrder(ordNum, ordDate, ingrDesc, ingrAmt);
		poList.add(po);

		System.out.println("Purchase Order Added!");

	}

	public static void viewPurchaseOrder() {
		Helper.line(50, "-");
		System.out.println("View Purchase Order");
		Helper.line(50, "-");
		System.out.println();

		String output = String.format("%-10s %-20s %-20s %-20s \n", "Order No", "Order Date", "Description", "Amount");
		for (PurchaseOrder po : poList) {
			output += String.format("%-10d %-20s %-20s %-20d \n", po.getOrderNumber(), po.getOrderDate(),
					po.getIngrDesc(), po.getIngrAmt());
		}
		System.out.println(output);
	}

	public static void editPurchaseOrder() {
		Helper.line(50, "-");
		System.out.println("Edit Purchase Order");
		Helper.line(50, "-");
		System.out.println();

		int userOrderNum = Helper.readInt("Enter Purchase Order Number > ");

		for (PurchaseOrder po : poList) {
			if (userOrderNum == po.getOrderNumber()) {

				
				String newIngrDesc = Helper.readString("Enter New ingredients Description > ");
				

				
				po.setIngrDesc(newIngrDesc);
				
				System.out.println("Changes made!");
			} else {
				System.out.println("Invalid Purchase Order Number!");
			}
		}

	}

	public static void deletePurchaseOrder() {
		Helper.line(50, "-");
		System.out.println("Delete Purchase Order");
		Helper.line(50, "-");
		System.out.println();

		int userOrderNum = Helper.readInt("Enter Purchase Order Number > ");

		for (PurchaseOrder po : poList) {
			if (userOrderNum == po.getOrderNumber()) {
			poList.remove(po);
			System.out.println("Purchase Order: " + po.getOrderNumber() + " has been deleted");
			}else {
				System.out.println("Invalid Purchase Order Number!");
			}
		}
	}
	
	public static void addFood() { // FOOD 
		Helper.line(50, "-");
		System.out.println("Add Food item");
		Helper.line(50, "-");
		System.out.println();

		String name = Helper.readString("Enter the name of the food > ");
		double price = Helper.readDouble("Enter the price of the food > ");

		Food fd = new Food(name, price); 
		foodList.add(fd);

		System.out.println("Food item Added!");
	}
	
	public static void viewFood() { // FOOD
		Helper.line(50, "-");
		System.out.println("View Food item");
		Helper.line(50, "-");
		System.out.println();

		String output = String.format("%-10s %-20s\n", "Name of Food", "Price");
		for (Food fd : foodList) {
			output += String.format("%-10s %-20.2f\n", fd.getName(), fd.getPrice());
		}
		System.out.println(output);
	}

}