import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListWithCustomObject {
public static void main(String[] args) {
	boolean isFound = false;
	ArrayList<Employee> empList = new ArrayList<>();
	
	Employee emp1 = new Employee();
	emp1.setEmpId(100);
	emp1.setName("Kyaw Kyaw");
	emp1.setSalary(45000000);
	
	empList.add(emp1);
	empList.add(new Employee(200, "Aung Aung", 400000));
	empList.add(new Employee(200, "Nilar", 450000));
	empList.add(new Employee(200, "Kyipyar", 200000));
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter emp name to search: ");
	String name = sc.nextLine();
	
	for (int i=0; i<empList.size(); i++) {
		if(empList.get(i).getName().equals("Kyipyar")) {
			System.out.println("Id: "+empList.get(i).getEmpId());
			System.out.println("Name: "+empList.get(i).getName());
			System.out.println("Salary: "+empList.get(i).getSalary());
			isFound = true;
		}
		
	}
	if(isFound == false) {
		System.out.println("Your search data is not found.");
	}
	
	
	
}
}
