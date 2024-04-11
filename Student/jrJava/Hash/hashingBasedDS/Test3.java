package jrJava.hashingBasedDS;

import java.util.Iterator;

public class Test3 {

	public static void main(String[] args) {
		
		HashMap<Thing, String> map = new HashMap<Thing, String>(5);

		map.put(new Thing(5, 55, 555), "ABC");
		map.put(new Thing(10, 1010, 101010), "ABCD");
		map.put(new Thing(12, 1212, 121212), "DEF");
		map.put(new Thing(7, 77, 777), "DEFG");
		map.put(new Thing(2, 22, 222), "DEFGH");
		map.put(new Thing(17, 1717, 171717), "DEFGHI");
		map.put(new Thing(13, 1313, 131313), "PQR");
		map.put(new Thing(3, 33, 333), "PQRS");
		map.put(new Thing(8, 88, 888), "PQRST");
		
		map.display();
		System.out.println("\n\n");
		
		HashSet<Thing> set = map.keySet();
		set.display();
		System.out.println("\n\n");
		
		Iterator<Thing> iter = set.iterator();
		Thing key;
		String value;
		while(iter.hasNext()) {
			key = iter.next();
			value = map.get(key);
			System.out.println(key + ", " + value); 
		}
		
	}

}






