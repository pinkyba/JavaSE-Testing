package hello_1;

public class testing {
	public static void main(String[] args) {
		int n1, n2, n3;
		n1 = 2;
		n2 = 50;
		n3 = 10;
		
		if(n1 > n2 && n1 > n3) {
			System.out.println("Maximum "+n1);
			
		}
		else if(n2 > n1 && n2 > n3) {
			System.out.println("Maximum "+n2);
		}
		else {
			System.out.println("Maximum "+n3);
		}
	}
}
