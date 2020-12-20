package inheritance_assignment;

import java.util.Scanner;
public class Employee {
private int empId;
private String name;
private String address;
public Employee()
{
	
}

public void initializeInfo() {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter emp Id: ");
	empId = input.nextInt();
	input.nextLine();
	System.out.print("Enter name: ");
	name = input.nextLine();
	System.out.print("Enter Address: ");
	address = input.nextLine();
	//input.close();
	}
public void displayInformation() {
	System.out.println("EmpId: "+empId);
	System.out.println("Name: "+name);
	System.out.println("Address: "+address);
}
}
