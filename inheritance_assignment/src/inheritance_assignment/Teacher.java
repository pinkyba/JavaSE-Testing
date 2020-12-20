package inheritance_assignment;

import java.util.Scanner;
public class Teacher extends Employee{
	private int salary;
	private String rank;
	
	public void initializeInfo() {	
		//to access initializeInfo method of parent class(Employee)
		super.initializeInfo();
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter rank: ");
		rank = input.nextLine();
		System.out.print("Enter salary: ");
		salary = input.nextInt();
		input.nextLine();

		}
	public void displayInformation() {
		//to access displayInformation method of parent class(Employee)
		super.displayInformation();
			
		System.out.println("Rank: "+rank);
		System.out.println("Salary: "+salary);
	}
}
