package webdriver;

public class Interface  implements Interface1{
	
	public static void main(String[] args) {
		Interface1 obj = new Interface();
		obj.sample();
		obj.sample2();
//		obj.sample3();
	}
	public void sample() {
		System.out.println("class to Interface Implementation");
	}

}
