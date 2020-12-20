
public class Calculator {
public static void main(String[] args) {
	try {
		int num1 = 100;
		int num2 = 10;		
		int result = num1/num2;
		System.out.println("Result: "+result);
		//String str = null;
		//System.out.println("Len: "+str.length());
		
		Student s = null;
		s.rno = 1;
		Student s1 = s;
		s1.rno = 1;
	}
	//execute when error occurs
	catch(ArithmeticException a){
		System.out.println("Divided by zero error");
	}
	catch(NullPointerException e) {
		System.out.println("Can't access object that is not allocated in memory.");
	}
	finally {
		System.out.println("It is always execute.");
	}
}
}
