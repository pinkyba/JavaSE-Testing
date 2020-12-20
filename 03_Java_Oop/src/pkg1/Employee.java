package pkg1;

import java.util.Scanner;

public class Employee {
private int empId;
private String name;
private String address;

// always create default constructor in parent class to be extended by child class
// (or) always build parent class constructor in every child class
public Employee()
{
	
}
public Employee(String name, String address, int id) 
{
	this.name = name;
	this.address = address;
	this.empId = id;
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

public void displayInformation() {
	System.out.println("EmpId: "+empId);
	System.out.println("Name: "+name);
	System.out.println("Address: "+address);
}
public void initializeInfo() {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter Id: ");
	empId = input.nextInt();
	System.out.println("Enter name: ");
	name = input.nextLine();
	System.out.println("Enter Address: ");
	address = input.nextLine();
	input.close();
	}
}
