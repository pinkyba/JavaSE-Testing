package String_Assignment;

import java.util.Scanner;

public class Assignment1 {
	public static void process() {
		String str1;
		String str2;
		int count=0;
		String result="";
		boolean ch = false;
	
		Scanner input = new Scanner(System.in);	
		
		System.out.println("Enter the two string with same length.");
		System.out.print("Enter string 1: ");
		str1 = input.nextLine().replace(" ", "");
		System.out.print("Enter string 2: ");
		str2 = input.nextLine().replace(" ", "");
		
		if (str1.length() == str2.length()) {
			for (int i=0; i<str1.length(); i++) {
				if(str1.charAt(i) == str2.charAt(i)){
					result += str1.charAt(i)+", ";
					count += 1;
					ch = true;
				}
			}
			if (ch == true) {
			System.out.println("No of common characters: "+count);
			System.out.println("common characters: "+result);
			}else {
				System.out.println("Common character does not exit.");
			}
			}
		else {
			System.out.println("You should enter two string with the same length!!!");
			process();
		}
	}	
	public static void main(String[] args) {	
			process();		
	}

}
