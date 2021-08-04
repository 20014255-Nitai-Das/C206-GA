
public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int options = 0;

		while (options != 4) {
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
		
	}

}
