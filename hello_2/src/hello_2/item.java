package hello_2;

import java.util.Scanner;

public class item {

	public static void main(String[] args) {	
		String itemName[] = new String[5];
		double priceArr[] = new double[5];
		double maxPrice;
		String maxName = null;
		
		Scanner sc = new Scanner(System.in);
		
		for (int i=0; i<5; i++) {
			System.out.println("Enter item name: ");
			
			itemName[i] = sc.nextLine();
			System.out.println("Enter item price: ");
			priceArr[i] = sc.nextDouble();
			sc.nextLine();
		}
		System.out.println("-------Item List---------");
		for (int i=0; i<5; i++) {			
			System.out.println("Item Name: "+itemName[i]);
			System.out.println("Item Price: "+priceArr[i]);
			
			}
		System.out.println("----------Maximum Price----------");
		maxPrice = priceArr[0];	
		for (int i=0; i<5; i++) {		
		if (priceArr[i] > maxPrice) {
			maxPrice = priceArr[i];
			maxName = itemName[i];
		}
		}
		System.out.println("Maximum Price: "+maxPrice);
		System.out.println("Item Name of Maximum Price: "+maxName);
	}

}
