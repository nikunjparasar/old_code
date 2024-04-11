package jrJava.specialObjects_String_object;

public class Practice3 {


		// TODO Auto-generated constructor stub
		public static void main(String[] args) {
		String exp = "I love you.";
		int pos1 = exp.indexOf('v');
		System.out.println(pos1);
		
		int pos2 = exp.indexOf('k');
		System.out.println(pos2);
		
		int pos3 = exp.indexOf("ove");
		System.out.println(pos3);
		
		int pos4 = exp.indexOf('o');
		System.out.println(pos4);
		
		pos4 = exp.indexOf('o', pos4+1);
		System.out.println(pos4);

		//////////////////////////////////
		System.out.println("---------------------------------------");
		
		Thing t1 = new Thing(10, "Hello");
		Thing t2 = new Thing(10, "Hello");
		
		//System.out.println(t1==t2);//don't do this
		//System.out.println(t1.equals(t2));//will not work unless you override
		System.out.println(t1.equals(t2));
		
		
		///////////////////////////////////
		System.out.println("------------------------------------------");
		
		String name1 = "Harry";
		String name2 = "Harry";
		//System.out.println(name1==name2);//this will actually return as true, because the string object uses the 
										//same string again, unless you use the copy constructor
		System.out.println(name1.equals(name2));
		
		
		String name3 = new String("Harry");//copy constructor
		//System.out.println(name1==name3);
		System.out.println(name1.equals(name3));

		String name4 = "harry".replace('h','H');//creates new literal string but then creates new address for new string
		//System.out.println(name1==name4);
		System.out.println(name1.equals(name4));
		
		
		
		
		
		
		
		
		
		
		
		}
	
	
	}
