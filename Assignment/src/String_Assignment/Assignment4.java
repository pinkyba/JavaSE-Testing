package String_Assignment;

import java.util.Scanner;

public class Assignment4 {
public static void main(String[] args) {
	String nrc;
	Scanner input = new Scanner(System.in);
	System.out.println("Enter NRC no");
	nrc = input.nextLine();
	int sIndex = nrc.indexOf("/")+1;
	int eIndex = nrc.indexOf("(");
	
	int sIndex1 = nrc.indexOf(")")+1;
	
	System.out.println("Township: "+nrc.subSequence(sIndex, eIndex));
	System.out.println("Township: "+nrc.substring(sIndex1));
	
}
}
