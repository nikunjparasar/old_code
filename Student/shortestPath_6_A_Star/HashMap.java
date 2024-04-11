package shortestPath_6_A_Star;

public class HashMap<K, V> {

	private Pair<K, V>[] pairs;
	
	
	public HashMap(int size) {
		pairs = new Pair[size];
	}
	
	public HashMap() {
		this(100);
	}
	
	
	public V put(K key, V value) {
		Pair<K, V> pair = new Pair<K, V>(key, value);
		int index = key.hashCode()%pairs.length;
		Pair<K, V> p = pairs[index];
		
		if(p==null) {
			pairs[index] = pair;
			return null;
		}
		if(p.key.equals(key)) {
			pair.next = p.next;
			pairs[index] = pair;
			return p.value;
		}
		
		Pair<K, V> c = p.next;
		while(c!=null) {
			if(c.key.equals(key)) {
				pair.next = c.next;
				p.next = pair;
				return c.value;
			}
			p = c;
			c = c.next;
		}
		
		p.next = pair;
		return null;
	}
	
	
	public V get(K key) {
		int index = key.hashCode()%pairs.length;
		Pair<K, V> c = pairs[index];
		
		while(c!=null) {
			if(c.key.equals(key)) return c.value;
			c = c.next;
		}
	
		return null;
	}
	
	
	public void display() {
		System.out.println("----------------------------------");
		Pair<K, V> c;
		for(int i=0; i<pairs.length; i++) {
			c = pairs[i];
			while(c!=null) {
				System.out.print(c + " --> ");
				c = c.next;
			}
			System.out.println();
		}
		System.out.println("----------------------------------");
	}
	
	
	public HashSet<K> keySet() {
		
		HashSet<K> set = new HashSet<K>(pairs.length);
		Pair<K, V> c;
		for(int i=0; i<pairs.length; i++) {
			c = pairs[i];
			while(c!=null) {
				set.add(c.key);
				c = c.next;
			}
		}
		return set;
	}
	
	
	private static class Pair<K, V> {
		public K key;
		public V value;
		public Pair<K, V> next;
		
		public Pair(K key, V value) {
			this.key = key;
			this.value = value;
		}
		
		public String toString() {
			return "[" + key + ", " + value + "]";
		}
	}
}








