package jrJava.specialObjects_String_object;

public class Thing {

	private int id;
	private String name;
	
	
	public Thing(int id, String name) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		
	}
	
	public String toString() {
		return "id: " + id + "  name: "+ name;
	}
	
	public boolean equals(Object o) {
		Thing other = (Thing)o;
		return id==other.id && name.equals(other.name);
	}

}
