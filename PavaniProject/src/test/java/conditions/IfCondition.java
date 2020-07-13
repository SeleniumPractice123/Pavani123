package conditions;

public class IfCondition {
	
	String browserName = "irefox";

	public void condition1() {

		if (browserName.equalsIgnoreCase("firefox")) {
			System.out.println("Welcome to firefox");
		} else if (browserName.equalsIgnoreCase("ie"))
			System.out.println("Welcome to ie");
		else if (browserName.equalsIgnoreCase("firefox")) {
			System.out.println("Welcome to chrome");
			
		}else {
			System.out.println("Failed Case");
		}

	}
	
	
	public void switchCaseCondition() {
		
		switch (5) {
		case 1:
			System.out.println("Welcome to firefox");
			break;
		case 2:
			System.out.println("Welcome to ie");
			break;
		case 3:
			System.out.println("Welcome to chrome");
		default:
			System.out.println("Failed Case");
			break;
		}
		
		
	}

	public static void main(String[] args) {

		new IfCondition().switchCaseCondition();

	}
}
