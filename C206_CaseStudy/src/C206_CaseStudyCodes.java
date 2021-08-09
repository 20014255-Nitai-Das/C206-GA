import java.util.ArrayList;

public class C206_CaseStudyCodes {


	public static final ArrayList<PurchaseOrder> poList = new ArrayList<PurchaseOrder>();

	private static final ArrayList<PromotionOffers> PromotionList = new ArrayList<PromotionOffers>();
	public static final ArrayList<Stall> stallList = new ArrayList<Stall>();


	public static final ArrayList<Food> foodList = new ArrayList<Food>();
	public static final ArrayList<Stall> stallList = new ArrayList<Stall>();

	public static void main(String[] args) {



	
	public static  final ArrayList<Food> foodList = new ArrayList<Food>();
	public static  final ArrayList<Stall> stallList = new ArrayList<Stall>();



	public static void main(String[] args) {

		 ArrayList<PurchaseOrder> poList = new ArrayList<PurchaseOrder>(8);
		
		Stall s1 = new Stall("Curry Puff", "05/06/2021");
		Stall s2 = new Stall("Fried Rice", "03/04/2021");
		Stall s3 = new Stall("Sushi Express", "01/02/2021");
		stallList.add(s1);
		stallList.add(s2);
		stallList.add(s3);

		Food f1 = new Food("Curry Puff", 1.50, "s1");
		Food f2 = new Food("Fried Rice", 3.50, "s2");
		Food f3 = new Food("Sushi", 2.00, "s3");
		foodList.add(f1);
		foodList.add(f2);
		foodList.add(f3);

		int option = 0;


	while(option != 4) {
		
	userMenu();
		option += Helper.readInt("Enter ");
		
		if (option == 1) {
			int caOption = 0;
			
			while (caOption != 4) {
				
			}
		}else if(option ==2) {
			
		}else if(option ==3 ) {
			
		}else if(option == 4) {
			System.out.println("Good bye!");
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

		System.out.println("1. Food Items");
		System.out.println("2. Stalls ");
		System.out.println("3. Back");

	}

	public static void FoodItemMenu() {
		Helper.line(50, "-");
		System.out.println("Food Item Menu");
		Helper.line(50, "-");

		System.out.println();
		System.out.println("1. Add Food Item");
		System.out.println("2. View Food Item");
		System.out.println("3. Delete Food Item");
		System.out.println("4. Edit Food Item");
	}

	public static void StallMenu() {
		Helper.line(50, "-");
		System.out.println("Stall  Menu");
		Helper.line(50, "-");
		System.out.println();

		System.out.println("1. Add Stall");
		System.out.println("2. View Stall");
		System.out.println("3. Delete Stall");
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

	public static void PromotionOffers() {
		Helper.line(50, "-");
		System.out.println("Promotion offers");
		Helper.line(50, "-");
		System.out.println("1. Add Promotion offers");
		System.out.println("2. View Promotion offers");
		System.out.println("3. Change Promotion offers");
		System.out.println("4. Delete Promotion offers");
	}

	public static void CustomerMenu() {
		Helper.line(50, "-");
		System.out.println("Customer Menu");
		Helper.line(50, "-");

	}

	// Nitai

	// Codes for Purchase Order
	// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------
<<<<<<< HEAD
=======
	public static void addPurchaseOrder() {
	}
>>>>>>> branch 'master' of https://github.com/20014255-Nitai-Das/C206-GA.git

	public static void Stall() {

		Helper.line(50, "-");
		System.out.println("Stall");
		Helper.line(50, "-");
		System.out.println("1. Add a New Stall");
		System.out.println("2. View an Existing Stall ");
		System.out.println("3. Delete an Existing Stall");
		System.out.println("4. Quit");

	}

	// Codes for Purchase Order (Nitai)
	// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------

	public static PurchaseOrder inputPurchaseOrder() {
		Helper.line(50, "-");
		System.out.println("Add Purchase Order");
		Helper.line(50, "-");
		System.out.println();

		String name = Helper.readString("Enter Stall Name > ");
		int ordNum = Helper.readInt("Enter Order Number > ");
		String ordDate = Helper.readString("Enter Order Date (dd/mm/yyyy) > ");
		String ingrDesc = Helper.readString("Enter ingredients Description > ");
		int ingrAmt = Helper.readInt("Enter ingredients amount > ");

		PurchaseOrder po = new PurchaseOrder(ordNum, ordDate, ingrDesc, name, ingrAmt);
		return po;

	}

	public static void addPurchaseOrder(ArrayList<PurchaseOrder> poList, PurchaseOrder po) {

		poList.add(po);

		System.out.println("Purchase Order Added!");

	}

	// Nitai

	public static String retrieveAllPurchaseOrder(ArrayList<PurchaseOrder> poList) {
		String output = "";

		for (PurchaseOrder po : poList) {
			output += String.format("%-20s %-20d %-20s %-20s %-20d \n", po.getStallName(), po.getOrderNumber(),
					po.getOrderDate(), po.getIngrDesc(), po.getIngrAmt());
		}
		return output;
	}

	public static void viewPurchaseOrder(ArrayList<PurchaseOrder> poList) {

		Helper.line(50, "-");
		System.out.println("View Purchase Order");
		Helper.line(50, "-");
		System.out.println();

		String output = String.format("%-20s %-20s %-20s %-20s %-20s \n", "Stall Name", "Order No", "Order Date",
				"Description", "Amount");

		output += retrieveAllPurchaseOrder(poList);

		System.out.println(output);
	}

	// Nitai
<<<<<<< HEAD
=======

>>>>>>> branch 'master' of https://github.com/20014255-Nitai-Das/C206-GA.git
	public static void editPurchaseOrder(ArrayList<PurchaseOrder> poList) {

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

	// Nitai

	public static void deletePurchaseOrder(ArrayList<PurchaseOrder> poList) {

		Helper.line(50, "-");
		System.out.println("Delete Purchase Order");
		Helper.line(50, "-");
		System.out.println();

		int userOrderNum = Helper.readInt("Enter Purchase Order Number > ");

		for (PurchaseOrder po : poList) {
			if (userOrderNum == po.getOrderNumber()) {
				poList.remove(po);
				System.out.println("Purchase Order: " + po.getOrderNumber() + " has been deleted");
			} else {
				System.out.println("Invalid Purchase Order Number!");
			}
		}
	}

<<<<<<< HEAD
=======
	// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------

>>>>>>> branch 'master' of https://github.com/20014255-Nitai-Das/C206-GA.git
	// Codes for Food (Jolin)
	// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------

	public static void addFood(ArrayList<Food> foodList) {
<<<<<<< HEAD

=======
=======
	public static void addFood() {
<<<<<<< HEAD

=======
>>>>>>> branch 'master' of https://github.com/20014255-Nitai-Das/C206-GA.git
>>>>>>> branch 'master' of https://github.com/20014255-Nitai-Das/C206-GA.git
>>>>>>> branch 'master' of https://github.com/20014255-Nitai-Das/C206-GA.git
>>>>>>> branch 'master' of https://github.com/20014255-Nitai-Das/C206-GA.git
		Helper.line(50, "-");
		System.out.println("Add Food Item");
		Helper.line(50, "-");
		System.out.println();

		String name = Helper.readString("Enter the name of the food > ");
		double price = Helper.readDouble("Enter the price of the food > $");
		String stallName = Helper.readString("Enter the name of the stall selling the food > ");

		Food fd = new Food(name, price, stallName);

		foodList.add(fd);

		System.out.println("Food item was added succesfully!");
	}

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
	public static void viewFood(ArrayList<Food> foodList) {
=======
<<<<<<< HEAD
>>>>>>> branch 'master' of https://github.com/20014255-Nitai-Das/C206-GA.git
	public static void viewFood() { // FOOD
<<<<<<< HEAD

=======
=======
>>>>>>> branch 'master' of https://github.com/20014255-Nitai-Das/C206-GA.git
	public static void viewFood() {
<<<<<<< HEAD

=======
>>>>>>> branch 'master' of https://github.com/20014255-Nitai-Das/C206-GA.git
>>>>>>> branch 'master' of https://github.com/20014255-Nitai-Das/C206-GA.git
>>>>>>> branch 'master' of https://github.com/20014255-Nitai-Das/C206-GA.git
>>>>>>> branch 'master' of https://github.com/20014255-Nitai-Das/C206-GA.git
		Helper.line(50, "-");
		System.out.println("View Food Item");
		Helper.line(50, "-");

		String output = String.format("%-15s %-8s %-16s\n", "Name of Food", "Price", "Name of Stall");
		for (Food fd : foodList) {
			output += String.format("%-15s $%-8.2f %-14s\n", fd.getName(), fd.getPrice(), fd.getStallName());
		}
		System.out.println(output);
	}

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
	public static void deleteFood(ArrayList<Food> foodList) {
=======
<<<<<<< HEAD
	public static void deleteFood() { // FOOD
=======
>>>>>>> branch 'master' of https://github.com/20014255-Nitai-Das/C206-GA.git
>>>>>>> branch 'master' of https://github.com/20014255-Nitai-Das/C206-GA.git
	public static void deleteFood() {
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
>>>>>>> branch 'master' of https://github.com/20014255-Nitai-Das/C206-GA.git
>>>>>>> branch 'master' of https://github.com/20014255-Nitai-Das/C206-GA.git
>>>>>>> branch 'master' of https://github.com/20014255-Nitai-Das/C206-GA.git
>>>>>>> branch 'master' of https://github.com/20014255-Nitai-Das/C206-GA.git
		Helper.line(50, "-");
		System.out.println("Delete Food Item");
		Helper.line(50, "-");
		System.out.println();

		String nameToDelete = Helper.readString("Enter the name of the food item you would like to delete > ");
<<<<<<< HEAD

=======
<<<<<<< HEAD

		boolean isDeleted = false;

=======
						
>>>>>>> branch 'master' of https://github.com/20014255-Nitai-Das/C206-GA.git
>>>>>>> branch 'master' of https://github.com/20014255-Nitai-Das/C206-GA.git
		for (Food fd : foodList) {
			if (nameToDelete == fd.getName()) {
				foodList.remove(fd);
<<<<<<< HEAD
				isDeleted = true;
=======
				System.out.println("Food Item: " + fd.getName() + " has been deleted");
			} else {
				System.out.println("Invalid Food Item!");
>>>>>>> branch 'master' of https://github.com/20014255-Nitai-Das/C206-GA.git
			}
		}
<<<<<<< HEAD

		if (isDeleted == true) {
			System.out.println("Food item: " + nameToDelete + " has been deleted!");
		} else {
			System.out.println("Invalid Food Item!");
		}
=======
>>>>>>> branch 'master' of https://github.com/20014255-Nitai-Das/C206-GA.git
	}
<<<<<<< HEAD

=======
<<<<<<< HEAD

	public static void editFood() {
=======
	
>>>>>>> branch 'master' of https://github.com/20014255-Nitai-Das/C206-GA.git
	public static void editFood(ArrayList<Food> foodList) {
>>>>>>> branch 'master' of https://github.com/20014255-Nitai-Das/C206-GA.git
		Helper.line(50, "-");
		System.out.println("Edit Food Item");
		Helper.line(50, "-");
		System.out.println();

		String nameToEdit = Helper.readString("Enter the name of the food item you would like to edit > ");

		for (Food fd : foodList) {

<<<<<<< HEAD
			if (nameToEdit == fd.getName()) {
=======
			if (nameToDelete == fd.getName()) {
>>>>>>> branch 'master' of https://github.com/20014255-Nitai-Das/C206-GA.git
				foodList.remove(fd);
				System.out.println("Food Item named " + fd.getName() + " has been deleted");
			} else {
				System.out.println("The name of the food item is invalid!");
<<<<<<< HEAD
				if (nameToEdit == fd.getName()) {
=======
>>>>>>> branch 'master' of https://github.com/20014255-Nitai-Das/C206-GA.git

<<<<<<< HEAD
					double newSellingPrice = Helper.readDouble("Enter the new selling price > $");
=======
				if (nameToEdit == fd.getName()) {
>>>>>>> branch 'master' of https://github.com/20014255-Nitai-Das/C206-GA.git

<<<<<<< HEAD
					fd.setPrice(newSellingPrice);
=======
					double newSellingPrice = Helper.readDouble("Enter the new selling price > $");
>>>>>>> branch 'master' of https://github.com/20014255-Nitai-Das/C206-GA.git

<<<<<<< HEAD
=======
					fd.setPrice(newSellingPrice);

>>>>>>> branch 'master' of https://github.com/20014255-Nitai-Das/C206-GA.git
					System.out.println("Changes made!");
				} else {
					System.out.println("Invalid Food Item!");
				}
			}
		}

	}

	// Codes for Stall (Crystal)
	// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------
	public static void addStall() { // Add Stall
		Helper.line(50, "-");
		System.out.println("Add New Stall");
		Helper.line(50, "-");
		System.out.println();

		String name = Helper.readString("Enter stall name > ");
		String startDate = Helper.readString("Enter Start date > (dd/mm/yy) ");

		Stall newStall = new Stall(name, startDate);
		stallList.add(newStall);

		System.out.println("Stall was added succesfully!");
	}

	public static void viewStall() { // View Stall
		Helper.line(50, "-");
		System.out.println("View Existing Stall");
		Helper.line(50, "-");

		System.out.printf("%-10s %-40s \n", "NAME", "START DATE");

		for (Stall stall : stallList) {
			System.out.printf("%-10s %-40s \n", stall.getName(), stall.getStartDate());
		}
	}

	public static void deleteStall() { // Delete Stall
		Helper.line(50, "-");
		System.out.println("Delete Exisiting Stall");
		Helper.line(50, "-");
		System.out.println();

		String deleteStall = Helper.readString("Enter Stall Name to Delete > ");

		for (Stall stall : stallList) {
			if (deleteStall == stall.getName()) {
				stallList.remove(stall);
				System.out.println("Stall Name:" + stall.getName() + " has been deleted successfully.");
			} else {
				System.out.println("Invalid Stall Name !");

			}
		}
	}

	public static void updateStall() { // Update Stall
		Helper.line(50, "-");
		System.out.println("Update Stall Name");
		Helper.line(50, "-");
<<<<<<< HEAD
=======
		System.out.println();
	}
>>>>>>> branch 'master' of https://github.com/20014255-Nitai-Das/C206-GA.git

<<<<<<< HEAD
	}

=======
>>>>>>> branch 'master' of https://github.com/20014255-Nitai-Das/C206-GA.git
	public static void addPromotionOffers() { // PromotionOffers
		Helper.line(50, "-");
		System.out.println("Add Promotion Offers");
		Helper.line(50, "-");
		System.out.println();

		String promoDate = Helper.readString("Enter promotion date > ");
		String promoName = Helper.readString("Enter promotion dish name> ");
		String promoDish = Helper.readString("Enter promotion dish  >");
		int promoDisc = Helper.readInt("Enter promotion discount > ");

		PromotionOffers Promo = new PromotionOffers(promoDate, promoName, promoDish, promoDisc);
		PromotionList.add(Promo);

		System.out.println("PromotionOffers was added succesfully!");
	}

	public static void viewPromotionOffers() { // PromotionOffers
		Helper.line(50, "-");
		System.out.println("View PromotionOffers");
		Helper.line(50, "-");
		System.out.println();

		String output = String.format("%-10s %-20s\n", "Name of Food", "Price");
		for (PromotionOffers Promo : PromotionList) {
			output += String.format("%-10s %-20.2f\n", Promo.getPromoName(), Promo.getPromoDiscount());
		}
	}

	public static void editPromotionOffers() {
		String editPromoOffer = Helper.readString("Enter Promotion to delete > ");
		for (int i = 0; i < PromotionList.size(); i++) {
			if (editPromoOffer.equalsIgnoreCase(PromotionList.get(i).getPromoName())) {
				PromotionList.remove(i);
				System.out.println("Promotional item deleted successfully");
				break;

			}

			else {
				System.out.println("Item Not Found");
			}
		}
	}

<<<<<<< HEAD
=======
	String updateName = Helper.readString("Enter Current Stall Name > ");
	{

		for (Stall stall : stallList) {
			if (updateName == stall.getName()) {

				String newName = Helper.readString("Enter New Stall Name > ");

				stall.setName(newName);

				System.out.println("Name successfully updated!");
			} else {
				System.out.println("Invalid Stall Name !");
			}
		}
	}
>>>>>>> branch 'master' of https://github.com/20014255-Nitai-Das/C206-GA.git
}
