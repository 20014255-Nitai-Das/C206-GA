import java.util.ArrayList;

public class C206_CaseStudyCodes {

	public static void main(String[] args) {

		ArrayList<PurchaseOrder> purchaseOrderList = new ArrayList<PurchaseOrder>();

		int option = 0;

		while (option != 4) {
			userMenu();
			option += Helper.readInt("Enter your choice > ");
		}

		if (option == 1) {
			CanAdmMenu();
		}
		else if (option == 2) {

		} 
		else if (option == 3) {

		} 
		else if (option == 4) {
			System.out.println("Goodbye!");
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
		Helper.line(50,"-");
		System.out.println("Canteen Administrator Menu");
		Helper.line(50,"-");
	}

}