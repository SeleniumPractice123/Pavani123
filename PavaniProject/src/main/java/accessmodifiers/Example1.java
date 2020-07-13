package accessmodifiers;

public class Example1 {
	
	public int i = 10;
	
	private int j = 18;
	
	String name = "Welcome";
	
	
	
	char c = 'a';
	
	float f = 1.5f;
	
	boolean status = true;
	
	public void convert() {
		
		String a = "9966";
		
	int s = Integer.parseInt(a);
	
	boolean status = name.equals("test");
	
	if(status) {
		System.out.println("pass");
	}else {
		System.out.println("fail");
	}
	
	
	}
	
	
	private static void test() {
		
		System.out.println("private method");
	}
	
	protected static void name() {
		System.out.println("protected");
	} 
	
	
	public static void main(String[] args) {
		
		
		Example1 a = new Example1();
		
		
		
		a.name();
	}

}
