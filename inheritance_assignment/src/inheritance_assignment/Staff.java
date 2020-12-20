package inheritance_assignment;

import java.util.Scanner;

public class Staff extends Employee{
	private String jobDetail;

	
	public void initializeInfo() {
		super.initializeInfo();
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter job detail: ");
		jobDetail = input.nextLine();
		//input.close();
		}
	public void displayInformation() {
		super.displayInformation();
		System.out.println("This Staff display info");
		System.out.println("Job Detail: "+jobDetail);
		
	}
}
