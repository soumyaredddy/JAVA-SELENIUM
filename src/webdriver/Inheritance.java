package webdriver;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        C1 obj =new C1();
        obj.c1();
        obj.b1();
        obj.a1();
	}

}

class A1 {
public void a1()	{
	System.out.println("this is A1");
}
}
class B1 extends A1{
public void b1()	{
	System.out.println("this is B1");
}
}
class C1  extends B1{
public void c1()	{
	System.out.println("this is C1");
}
}