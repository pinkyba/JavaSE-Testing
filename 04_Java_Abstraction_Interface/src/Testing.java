
public class Testing {
public static void main(String[] args) {
	//People p = new People(); cannot create object of abstract class
	//People p = new Employee(); cannot create object of abstract class
	
	System.out.println("Parent people < child Teacher");
	People p = new Teacher();
	p.initializeData();
	p.displayData();
	
	System.out.println("Parent employee < child Teacher");
	Employee e = new Teacher();
	e.initializeData();
	e.setEmpIdSalary();
	e.displayData();
		

	//e.displayCompanyName(); //cannot call employee's child class(Teacher class)'s own method
							// displayCompanyName() is own method of Teacher class (child class)
	
	System.out.println("Teacher Object");
	Teacher t = new Teacher();
	
	t.setEmpIdSalary();	
	t.initializeData();
	t.displayData();
	t.displayCompanyName();
	
	Student s = new Student();
	s.initializeData();
	s.displayData();
	
}
}
