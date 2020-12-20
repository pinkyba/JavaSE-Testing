package pkg1;

public class Testing {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		Staff staff = new Staff();
		Teacher teacher = new Teacher();
		
		Employee emp2 = emp1;
		Employee emp3 = staff;
		
		emp3.displayInformation();
		
		staff = (Staff) emp1;
		
		//Teacher teacher1 = (Teacher)emp3; //runtime error (emp3>staff>staff)
		
		//parent class to child class => must explicitly type cast
		//child class to parent class => internally cast

	}

}
