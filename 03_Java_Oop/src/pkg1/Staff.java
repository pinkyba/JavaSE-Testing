package pkg1;

import java.util.Scanner;

public class Staff extends Employee{
private String jobDetail;

public String getJobDetail() {
	return jobDetail;
}

public void setJobDetail(String jobDetail) {
	this.jobDetail = jobDetail;
}

@Override
public void initializeInfo() {
	//to access method (initializeInfo) of parent class(Employee)
	super.initializeInfo();
	
	System.out.println("This is Staff initialize info");
	Scanner input = new Scanner(System.in);
	System.out.println("Enter job detail: ");
	jobDetail = input.nextLine();
	input.close();
	}

@Override
public void displayInformation() {
	//to access method (displayInformation) of parent class(Employee)
	super.displayInformation();
	
	System.out.println("This Staff display info");
	System.out.println("Job Detail: "+jobDetail);
	
}
}
