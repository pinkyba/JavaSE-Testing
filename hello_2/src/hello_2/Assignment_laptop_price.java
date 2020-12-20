package hello_2;

import java.util.Scanner;

public class Assignment_laptop_price {
	static String brand_name;
	static String cpu_core;
	static double price, total;
	static int index1, index2;
	static boolean isexit = false;
	
	public static void main(String[] args) {

		String computer[][] = {{"", "Lenovo", "HP", "Samsung", "Acer", "Dell", "Express"}, 
							{"core i3", "230.21", "400.21", "294.2", "693.33", "340.44", "691.99"},
							{"core i5", "529.483", "920.483", "676.66", "1594.65", "783.012", "1591.577"},
							{"core i7", "552.504", "960.504", "706.08", "1663.99", "817.056", "1660.776"},
							{"core i9", "690.63", "1200.63", "882.6", "693.33", "2079.99", "2075.97"}};
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<7; j++) {
				System.out.print(computer[i][j]+"\t\t");
			}
			System.out.println();
		}
		Scanner input = new Scanner(System.in);
		
		System.out.print("Choose Brand Name: ");
		brand_name = input.nextLine().toLowerCase();
		
		System.out.print("Choose CPU: ");
		cpu_core = input.nextLine().toLowerCase();
		
		for(int i=0; i<5; i++) {			
			if(computer[i][0].toLowerCase().equals(cpu_core)) {
				index1 = i;
				isexit = true;
			}				
		}
		
		for(int j=0; j<7; j++) {
			if(computer[0][j].toLowerCase().equals(brand_name)) {
				 index2 = j;	
				 isexit = true;
			}			
		}
		if(isexit == true) {
		price = Double.parseDouble(computer[index1][index2]);
		System.out.println("Price: "+price+"$");
		
		System.out.print("Do you want to purchase?? ");
		String purchase = input.nextLine().toLowerCase();
		System.out.println(purchase);
		if (purchase.equals("yes")) {
			System.out.print("Quantity: ");
			int qty = input.nextInt();
			total = price*qty*1500;
			System.out.println("Total Amount: "+total+"MMK");
		}
		else {
			System.out.println("Thank You!");
		}
		}
		else {
			System.out.println("Brand name or core cpu does not exit.");
		}
	}

}
