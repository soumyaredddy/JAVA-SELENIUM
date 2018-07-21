package Selenium_Web;

public class Class8Java {
	static int a ; //static variable
	int b;        //instance variable
	
	public void method1() {
		int c= 30; //local variable
		b =23;
		a= 45;
				System.out.println("this is for local variable "+c);
				System.out.println("this is for instance variable "+b);
				System.out.println("this is for static variable "+a);
	}
	public void method2(String str) {
		System.out.println(str);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a=67;
		Class8Java obj = new Class8Java();
		obj.method1();
		obj.method2("overloading");
		obj.method2("using method2 passing values to is called overloading");
//		AccessSpecifier obj3 = new AccessSpecifier(); // using Accessspecifier method here
//		obj3.method3();
		System.out.println("callind static variable" +a);
//		System.out.println("callind instance variable" +b);
//		System.out.println("callind local variable" +c);

	}

}
