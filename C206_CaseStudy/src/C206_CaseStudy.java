
public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int options = 0;

		while (options != 5) {
			menu();
			options += Helper.readInt("Enter your option > ");
			
			if (options == 1){
				
			}
		}
	}

	private static void menu() {
		Helper.line(50, "-");
		System.out.println("Canteen Automation System");
		Helper.line(50, "-");
		System.out.println("1. View");
		System.out.println("2. Add");
		System.out.println("3. Delete");
		System.out.println("4. Quit");
		Helper.line(50, "-");

	}

	private static void viewMenu() {
		Helper.line(50, "-");
		System.out.println("View Menu");
		Helper.line(50, "-");
		System.out.println("1. Food");
		System.out.println("2. Purchase Order");
		System.out.println("3. ");
		System.out.println("4. Quit");
	}

	private static void addMenu() {

	}

	private static void deleteMenu() {

	}

}
