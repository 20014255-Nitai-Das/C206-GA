import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
<<<<<<< HEAD
		
		// FOOD 
		ArrayList<Food> foodList = new ArrayList<Food>();
		
		// FOOD
		foodList.add(new Food("Curry Puff", 1.50));
		foodList.add(new Food("Fried Rice", 3.50));
		foodList.add(new Food("Sushi", 2.00));
		
		int option = 0;
		
		while (option != 5) {
=======
	 int options = 0;
	 
	 while(options != 5) {
		 
	 }
		
		
	}
	private void menu() { 
>>>>>>> branch 'master' of https://github.com/20014255-Nitai-Das/C206-GA.git
=======
		int options = 0;
>>>>>>> branch 'master' of https://github.com/20014255-Nitai-Das/C206-GA.git

<<<<<<< HEAD
		while (options != 4) {
=======
<<<<<<< HEAD
<<<<<<< HEAD
			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > ");

			if (option == 1) {
				// View all items 
				C206_CaseStudy.viewAllFood(foodList);


			} else if (option == 2) {
				// Add a new item
				C206_CaseStudy.setHeader("ADD");			
				C206_CaseStudy.setHeader("ITEM TYPES");
				System.out.println("1. Food");
				
				int itemType = Helper.readInt("Enter option to select item type > ");

				if (itemType == 1) {
					// Add a food item 


				} else if (itemType == 2) {
					// Add ....


				} else {
					System.out.println("Invalid type");
				}

			} else if (option == 3) {
				// Delete item
				C206_CaseStudy.setHeader("DELETE");			
				C206_CaseStudy.setHeader("ITEM TYPES");
				System.out.println("1. Food");
	
				int itemType = Helper.readInt("Enter option to select item type > ");

				if (itemType == 1) {
					// Delete food 
					C206_CaseStudy.deleteFood(foodList);
					
				} else if (itemType == 2) {
					// Delete ...

				} else {
					System.out.println("Invalid type");
				} 
				
			} else if (option == 4) {
				System.out.println("Bye!"); 
				
			} else {
				System.out.println("Invalid option");
			}
		}
	}
		


	
	private static void deleteFood(ArrayList<Food> foodList) {
		// TODO Auto-generated method stub
=======
		String title = " Ca ";
>>>>>>> branch 'master' of https://github.com/20014255-Nitai-Das/C206-GA.git
		
=======
		while (options != 5) {
>>>>>>> branch 'master' of https://github.com/20014255-Nitai-Das/C206-GA.git
			menu();
			options += Helper.readInt("Enter your option > ");

			if (options == 1) {
				viewMenu();
			}
			if (options == 2) {
				addMenu();
			}
			if (options == 3) {
				deleteMenu();
			}
			else {
				System.out.println("invalid option!");
			}
		}
	}

	public static void menu() {
		Helper.line(50, "-");
		System.out.println("Canteen Automation System");
		Helper.line(50, "-");
		System.out.println("1. View");
		System.out.println("2. Add");
		System.out.println("3. Delete");
		System.out.println("4. Quit");
		Helper.line(50, "-");

	}

	public static void viewMenu() {
		Helper.line(50, "-");
		System.out.println("View Menu");
		Helper.line(50, "-");
		System.out.println("1. Food");
		System.out.println("2. Purchase Order");
		System.out.println("3. Stall ");
		System.out.println("4. Promotions ");
		
	}

	public static void addMenu() {
		Helper.line(50, "-");
		System.out.println("Add Menu");
		Helper.line(50, "-");
		System.out.println("1. Food");
		System.out.println("2. Purchase Order");
		System.out.println("3. Stall ");
		System.out.println("4. Promotions ");
	}

<<<<<<< HEAD
	public static void deleteMenu() {
		Helper.line(50, "-");
		System.out.println("Delete Menu");
		Helper.line(50, "-");
		System.out.println("1. Food");
		System.out.println("2. Purchase Order");
		System.out.println("3. Stall ");
		System.out.println("4. Promotions ");
	}
	
	public static void addFood() {
		
=======
	private static void deleteMenu() {

>>>>>>> branch 'master' of https://github.com/20014255-Nitai-Das/C206-GA.git
>>>>>>> branch 'master' of https://github.com/20014255-Nitai-Das/C206-GA.git
	}


	
	private static void viewAllFood(ArrayList<Food> foodList) {
		// TODO Auto-generated method stub
		
	}


	
	private static void menu() {
		// TODO Auto-generated method stub
		
	}


	private static void setHeader(String string) {
		// TODO Auto-generated method stub
		
	}
}