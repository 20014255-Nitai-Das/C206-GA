import java.util.ArrayList;

public class C206_CaseStudyCodes {

	public static void main(String[] args) {

		ArrayList<PurchaseOrder> purchaseOrderList = new ArrayList<PurchaseOrder>();

		int option = 0;

		while (option != 4) {
			C206_CaseStudyCodes.userMenu();
			option = Helper.readInt("Enter your choice > ");
		

		if (option == 1) {
			CanAdmMenu();
		} if (option == 2) {
			
			int ssOption = 0;

			while (ssOption != 5) {
				StallStaffMenu();
				ssOption = Helper.readInt("Enter option > ");
			}
			if (ssOption == 1) {

			}
			 if (ssOption == 2) {

			}
			if (ssOption == 3) {

			}
			if (ssOption == 4) {

			}

		} else if (option == 3) {
			CustomerMenu();
		} else if (option == 4) {
			System.out.println("Goodbye!");
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
		System.out.println("Add Pruchase Order");
		Helper.line(50, "-");
	}
	
}