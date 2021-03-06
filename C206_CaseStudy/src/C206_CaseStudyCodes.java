import java.util.ArrayList;

public class C206_CaseStudyCodes {

	private static final ArrayList<PromotionOffers> PromotionList = new ArrayList<PromotionOffers>();
	
	public static final ArrayList<Stall> stallList = new ArrayList<Stall>();

	public static final ArrayList<Food> foodList = new ArrayList<Food>();

	public static final ArrayList<PurchaseOrder> poList = new ArrayList<PurchaseOrder>(8);
	public static void main(String[] args) {

		PurchaseOrder po1 = new PurchaseOrder(1, "Sushi", "07/08/2021", "Rice", 2);
		poList.add(po1);
		
		
		

		Stall s1 = new Stall("Curry Puff", "05/06/2021");
		Stall s2 = new Stall("Fried Rice", "03/04/2021");
		Stall s3 = new Stall("Sushi Express", "01/02/2021");
		stallList.add(s1);
		stallList.add(s2);
		stallList.add(s3);

		ArrayList<Food> foodList = new ArrayList<Food>();
		
		Food f1 = new Food("Curry Puff", 3.00, "s1");
		Food f2 = new Food("Fried Rice", 4.00, "s2");
		Food f3 = new Food("Sushi", 3.50, "s3");
		foodList.add(f1);
		foodList.add(f2);
		foodList.add(f3);

		int option = 0;

		while (option != 4) {

			userMenu();
			option = Helper.readInt("Enter choice >");

			if (option == 1) {
				int caOption = -1;

				while (caOption != 4) {
					CanAdmMenu();
					caOption = Helper.readInt("Enter choice >");
					if (caOption == 1) {
						int fiOption = 0;
						while (fiOption != 5) {
							FoodItemMenu();
							fiOption = Helper.readInt("Enter choice >");

							if (fiOption == 1) {
								addFood(foodList);

							} else if (fiOption == 2) {
								viewFood(foodList);

							} else if (fiOption == 3) {
								deleteFood(foodList);

							} else if (fiOption == 4) {
								editFood(foodList);

							}
						}

					} else if (caOption == 2) {
						int sOption = 0;
						while (sOption != 5) {
							StallMenu();
							sOption = Helper.readInt("Enter choice >");
							if (sOption == 1) {
								addStall();
								
								
							} else if (sOption == 2) {
								viewStall();   
							} else if (sOption == 3) {
								deleteStall();
							} else if (sOption == 4) {
								updateStall();
							}
						}
					}else if(caOption == 3) {
						viewPromotionOffers();
					}
				}
			} else if (option == 2) {
				int ssOption = 0;

				while (ssOption != 5) {
					StallStaffMenu();
					ssOption = Helper.readInt("Enter choice > ");
					if (ssOption == 1) {
						PurchaseOrder po = inputPurchaseOrder();
						addPurchaseOrder(poList, po);
					} else if (ssOption == 2) {
						C206_CaseStudyCodes.viewPurchaseOrder(poList);

					} else if (ssOption == 3) {
						C206_CaseStudyCodes.editPurchaseOrder(poList);
					} else if (ssOption == 4) {
						C206_CaseStudyCodes.deletePurchaseOrder(poList);
					}
				}

			} else if (option == 3) {

				int cOption = 0;
				while (cOption == 4) {
					CustomerMenu();
					cOption = Helper.readInt("Enter choice > ");

					if (cOption == 1) {

					} else if (cOption == 2) {

					} else if (cOption == 3) {

					} else if (cOption == 4) {

					}
				}

			} else if (option == 4) {
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
		System.out.println("3. View Promotion");
		System.out.println("4. Back");

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
		System.out.println("5. Back");
	}

	public static void StallMenu() {
		Helper.line(50, "-");
		System.out.println("Stall  Menu");
		Helper.line(50, "-");
		System.out.println();

		System.out.println("1. Add Stall");
		System.out.println("2. View Stall");
		System.out.println("3. Delete Stall");
		System.out.println("4. Update Stall Name");
		System.out.println("5. Back");
	}

	public static void StallStaffMenu() {
		Helper.line(50, "-");
		System.out.println("Staff Stall  Menu");
		Helper.line(50, "-");
		System.out.println("1. Add Purchase Order");
		System.out.println("2. View Purchase Order");
		System.out.println("3. Change Purchase Order");
		System.out.println("4. Delete Purchase Order");
		System.out.println("5. Back");
	}

	public static void PromotionOffers() {
		Helper.line(50, "-");
		System.out.println("Promotion offers");
		Helper.line(50, "-");
		System.out.println("1. Add Promotion offers");
		System.out.println("2. View Promotion offers");
		System.out.println("3. Change Promotion offers");
		System.out.println("4. Delete Promotion offers");
		System.out.println("5. Back");
	}

	public static void CustomerMenu() {
		Helper.line(50, "-");
		System.out.println("Customer Menu");
		Helper.line(50, "-");

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

		PurchaseOrder po = new PurchaseOrder(ordNum,name, ordDate, ingrDesc, ingrAmt);
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
			output += String.format("%-20d %-20s %-20s %-20s %-20d \n",  po.getOrderNumber(),po.getStallName(),
					po.getOrderDate(), po.getIngrDesc(), po.getIngrAmt());
		}
		return output;
	}

	public static void viewPurchaseOrder(ArrayList<PurchaseOrder> poList) {

		Helper.line(50, "-");
		System.out.println("View Purchase Order");
		Helper.line(50, "-");
		System.out.println();

		String output = String.format("%-20s %-20s %-20s %-20s %-20s \n","Order No", "Stall Name", "Order Date",
				"Description", "Amount");

		output += retrieveAllPurchaseOrder(poList);

		System.out.println(output);
	}

	// Nitai

	public static void editPurchaseOrder(ArrayList<PurchaseOrder> poList) {

		Helper.line(50, "-");
		System.out.println("Edit Purchase Order");
		Helper.line(50, "-");
		System.out.println();

		int userOrderNum = Helper.readInt("Enter Purchase Order Number > ");
		boolean isEdit = false;
		for (int i = 0; i < poList.size(); i++) {
			if (userOrderNum == poList.get(i).getOrderNumber()) {

				String newIngrDesc = Helper.readString("Enter New ingredients Description > ");

				poList.get(i).setIngrDesc(newIngrDesc);

				isEdit = true;
				
			} else {
				isEdit = false;
				
			}
		}if(isEdit == true) {
			System.out.println("Changes made!");
		}else if(isEdit == false) {
			System.out.println("Changes have not been made!");
		}

	}

	// Nitai

	  public static void deletePurchaseOrder(ArrayList<PurchaseOrder> poList) {
		    Helper.line(50, "-");
		      System.out.print("Delete Purchase Order\n");
		      Helper.line(50, "-");
		      
		      
		   
		      int  poNum = Helper.readInt("Enter purchase order number > ");
		      boolean isDeleted = false;
		       
		          for (int i = 0; i < poList.size(); i++) {
		            if (poList.get(i).getOrderNumber() == poNum) {
		              poList.remove(i);
		              isDeleted = true;
		        }else {
		      isDeleted = false;
		        }
		            
		      }if (isDeleted == true) {
		        System.out.println("Purchase has been deleted successfully");
		      }else if (isDeleted == false) {
		        System.out.println("Purchase has not been deleted successfully");
		      }
		    }

	// Codes for Food (Jolin)
	// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------

	public static void addFood(ArrayList<Food> foodList) {
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

	public static void viewFood(ArrayList<Food> foodList) {
		Helper.line(50, "-");
		System.out.println("View Food Item");
		Helper.line(50, "-");

		String output = String.format("%-15s %-8s %-16s\n", "Name of Food", "Price", "Name of Stall");
		for (Food fd : foodList) {
			output += String.format("%-15s $%-8.2f %-14s\n", fd.getName(), fd.getPrice(), fd.getStallName());
		}
		System.out.println(output);
	}

	public static void deleteFood(ArrayList<Food> foodList) {
		Helper.line(50, "-");
		System.out.println("Delete Food Item");
		Helper.line(50, "-");
		System.out.println();

		String nameToDelete = Helper.readString("Enter the name of the food item you would like to delete > ");
		Boolean isDeleted = false;
		
		for (int i = 0; i < foodList.size();) {
			if (nameToDelete.equalsIgnoreCase(foodList.get(i).getName())) {
				System.out.println("Food item: " + nameToDelete + " has been deleted!");
				foodList.remove(i);
				isDeleted = true;
				i++;
			} 
			i++;
		}
		
		if (isDeleted == false) {
			System.out.println("Invalid Food Item");
		}
	}

	public static void editFood(ArrayList<Food> foodList) {
		Helper.line(50, "-");
		System.out.println("Edit Food Item");
		Helper.line(50, "-");
		System.out.println();

		for (Food fd : foodList) {
			double oldSellingPrice = fd.getPrice();
			double newSellingPrice = oldSellingPrice * 1.3;
			fd.setPrice(newSellingPrice);
			
			if (newSellingPrice != oldSellingPrice) {
				System.out.println("Selling price of " + fd.getName() + "has been updated succesfully");
			} else {
				System.out.println("");
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
		boolean isDeleted = false;

		for (int i = 0; i < stallList.size(); ) {			
			if (deleteStall.equalsIgnoreCase(stallList.get(i).getName())) {
				System.out.println("Stall Name: " + stallList.get(i).getName() + " has been deleted");
				stallList.remove(i);
				isDeleted = true;
				i++;
			} 
			i++;
		}
		if (isDeleted == false) {
			System.out.println("Invalid Stall Name");
		}
	}

	public static void updateStall() { // Update Stall
		Helper.line(50, "-");
		System.out.println("Update Stall Name");
		Helper.line(50, "-");
		System.out.println();
		
		String updateName = Helper.readString("Enter Current Stall Name > "); 
		boolean isUpdated = false;
		
			for (int i = 0; i < stallList.size(); i++ ) {			
				if (updateName.equalsIgnoreCase(stallList.get(i).getName())) {					
					String newName = Helper.readString("Enter New Stall Name > ");
					stallList.get(i).setName(newName);
					System.out.println("Name successfully updated!");
					isUpdated = true;
				}
			}
			if (isUpdated == false) {
				System.out.println("Invalid Stall Name");
		}
	}
	
    // Codes for Promotion Offers (Wang Bo)
	// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------

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
		System.out.println(output);
	}

	public static void editPromoOffer() {
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
}

