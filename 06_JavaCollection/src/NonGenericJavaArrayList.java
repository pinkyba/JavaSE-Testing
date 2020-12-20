import java.util.ArrayList;

public class NonGenericJavaArrayList {
public static void main(String[] args) {
	// create array list
	ArrayList list = new ArrayList();
	
	// add object to array list
	list.add("Java");
	list.add(12.3);
	list.add(100);
	list.add('A');
	
	// String s = list.get(0); // return error because array list return type is object so String datatye canot accept
	String s = (String) list.get(0);
	Object s1 = list.get(0);
	
	//int i = (int) list.get(3);
	
	// display array list
//	for(int i=0; i<list.size(); i++) {
//		System.out.println(list.get(i));
//	}
}
}
