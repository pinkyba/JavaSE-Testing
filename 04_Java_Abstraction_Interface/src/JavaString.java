import java.net.SocketTimeoutException;

public class JavaString {

	public static void main(String[] args) {
		String str = "Java Programming. Room2 is used for batch 4.";
		String str1 = new String("Java Programming 1");
		
		System.out.println("Length: "+str.length());
		
		if(str.contains("used")) {
			System.out.println("found!");
		}else {
			System.out.println("not found!");
		}
		
		String arr[] = str.split(" ");
		System.out.println("No of Words: "+arr.length);
		
		if (str.startsWith("A")) {
			System.out.println("Start wiht A");
		}else {
			System.out.println("Not start with A");
		}
		
		System.out.println("Lower: "+str.toLowerCase());
		System.out.println("Upper: "+str.toUpperCase());
		
		if(str.endsWith(".")) {
			System.out.println("End with .");
		}else {
			System.out.println("Not end with .");
		}
		
		int index = str.indexOf("P");
		System.out.println("Position of p: "+index);
		
		char ch = str.charAt(5);
		System.out.println("Char at index 5: "+ch);
		
		int lastIndex = str.lastIndexOf("a");
		System.out.println("Position of a: "+lastIndex);
		
		String substr = str.substring(5);
		System.out.println("Substring :"+ substr);
		
		String substr1 = str.substring(0,6);
		System.out.println("Substrng 1:"+substr1);
		
		int bIndex = str.indexOf("b");
		System.out.println("Substring: "+str.substring(bIndex));
		
		String nrc = "12/sakhana(naing)1234";
		int sIndex = nrc.indexOf("/")+1;
		int aIndex = nrc.indexOf("(");
		System.out.println("Substring: "+nrc.substring(sIndex, aIndex));
		
		
	}

}
