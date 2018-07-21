package webdriver;

public class B extends A {
	int b = 20;
	String name = "kavya";
	public void b1() {
		System.out.println("class bB from class A");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stu
        int c =100;
		B obj = new B();
	obj.a1();
		obj.b1();
		System.out.println("c=" +c );
		System.out.println("b=" + obj.b );
		System.out.println("a=" +obj.a );
		System.out.println("name=" +obj.name );
		System.out.println("name=" +obj.myname );
		

	}

}
