package jrJava.specialObjects_String_object;

public class Practice1 {

	public Practice1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//literal string(correct way of preparing string objects)
		String name1 = "Harry";
		//creates two of them, (copy constructor)
		String name2 = new String("Harry");
		
		//Immutable
		String name = "Hirry";
		//creates a whole new string object
		String corrected = name.replace('i', 'a');

		//Literal strings will not get garbage collected
		String aName = "Harry";
		aName = "Ron";//"Harry" will not be garbage collected.
		String bName = "Harry"; // Harry will be reused.

	}

}
