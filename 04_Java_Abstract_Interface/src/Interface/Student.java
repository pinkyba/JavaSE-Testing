package Interface;

public class Student implements People{
	public void initializeData() {
		System.out.println("Override method of People");
	}
	void showData() {
		System.out.println("This is static method");
	}
	

}
