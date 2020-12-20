package hello_2;

import java.util.Scanner;

public class array_2d {

	public static void main(String[] args) {
		String name[] [] = new String[2][3];
		
		Scanner input = new Scanner(System.in);
		
		
		for (int i=0; i<2; i++) {
			for (int j=0; j<3; j++) {
				System.out.println("Enter student name: ");
				name[i][j] = input.nextLine();
			}
		}
		System.out.println("---------Student Name List---------");
		for (int i=0; i<2; i++) {
			for (int j=0; j<3; j++) {
				System.out.println(name[i][j]);
			}
		}
	}

}
