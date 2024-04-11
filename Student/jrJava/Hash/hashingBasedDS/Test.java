package jrJava.hashingBasedDS;

public class Test {

	public static void main(String[] args) {
		
		HashSet<Thing> set = new HashSet<Thing>(5);
		
		set.add(new Thing(4, 2, 21567));
		set.add(new Thing(1, 2, 88888));
		set.add(new Thing(3, 1, 1787));
		set.add(new Thing(6, 5, 11011));
		set.add(new Thing(17, 0, 567));
		set.add(new Thing(2, 1, 14467));
		set.add(new Thing(9, 7, 111));
		set.add(new Thing(12, 7, 3410));
		set.add(new Thing(7, 3, 23222));
		set.add(new Thing(10, 9, 1001));
		set.add(new Thing(5, 0, 9909));
		
		set.display(); 
		
		System.out.println();
		System.out.println();
		
		Thing removed = set.add(new Thing(12, 777, 3333));
		
		set.display();
		
		System.out.println();
		System.out.println();
		
		System.out.println(removed);
		
		 
		//Thing searchKey = new Thing(7, 0, 0);
		//Thing retrieved = set.get(searchKey);
		//System.out.println(retrieved);
	}

}
 




