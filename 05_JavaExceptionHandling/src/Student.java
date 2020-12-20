
public class Student {

	int rno;
	String name;
	int mark;
	
	void checkMark() throws InvalidMarkException {
		if(mark<0 || mark>100) {
			InvalidMarkException obj = new InvalidMarkException();
			
			throw obj;
		}
	}
}
