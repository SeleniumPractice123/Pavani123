package loopes;

public class ForLoop {

	
	public static void main(String[] args) {
	
		boolean status = false;
		
		for (int i = 1; i <=10; i++) {
			if(i==5) {
				System.out.println(i);
				status = true;
				break;
			}
		}
		
		if(status) {
			System.out.println("pass");
		}else {
			System.out.println("Failed");
		}
	}

}
