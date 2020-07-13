package seleniumBasics;

public class Parameters {
	
	
	public void addition(String a, String b) {
		
		String fn = a;
		
		String ln = b;
		
		System.out.println(fn +"  -----  "+ ln);
	}
	

	public static void main(String[] args) {
		
		Parameters p = new Parameters();
		
		p.addition("selenium","webdriver");
		
		p.addition("sss","ttt");
	}

}
