package Abstract_and_Wrapper;

public class JavaStringBuffer {
public static void main(String[] args) {
	
	// String buffer is mutable object
	StringBuffer buffer = new StringBuffer("Java Programming");
	buffer.append("MMIT");
	
	// String is immutable object
	String str = new String("Java Programming");
	str.concat("MMIT");
	
	//String str1 = str.substring(0,20);
	//System.out.println(str1);
	
	System.out.println("String buffer: "+buffer);
	System.out.println("String: "+str);
}

}
