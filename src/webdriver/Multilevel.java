package webdriver;

public class Multilevel {
public static void main(String[] args) {
	Bb1 obj = new Bb1();
	obj.b1();
	Cc1 obj1 = new Cc1();
	
	obj.a1();
	obj1.c1();
	
	
}
}
class Aa1{
	public void a1() {
		System.out.println("A1 class");
	}
}
class Bb1 extends Aa1{
	public void b1() {
		System.out.println("B1 class");
		
	}
}
class Cc1 extends Aa1{
	public void c1() {
		System.out.println("c1 class");
		
	}
}