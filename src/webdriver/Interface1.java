package webdriver;

public interface Interface1 {
	public void sample();
	public  default void sample2() {
		System.out.println("sample Interface");
		
	}

}
