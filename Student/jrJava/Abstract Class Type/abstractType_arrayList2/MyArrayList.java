package jrJava.abstractType_arrayList2;

public class MyArrayList {


	//get(i); will get reference at index i
	//add(r); will add at the end
	//add(i, r); will insert r so index will be i
	//remove(i); will remove and return the reference at index i
	//remove(r); will search and find the r and remove it
	//size(); report the current number of references
	
	private Object[] elements;
	private int  lastElementIndex;
	
	public MyArrayList() {
		elements = new Object[5];
		lastElementIndex = -1;
	}
	
	public MyArrayList(int size) {
		elements = new Object[size];
		lastElementIndex = -1;
	}
	
	public int size() {
		return lastElementIndex+1;
	
	}
	
	public Object get(int index) {
		if(index <0 || index> lastElementIndex) {
			throw new IndexOutOfBoundsException();
		}
		
		return elements[index];
	}
	
	public void add(Object ref) {
		/*
		if(lastElementIndex == elements.length-1) {
			Ball[] temp = new Ball[(elements.length)*2];
			for(int i = 0; i<lastElementIndex; i++) {
				temp[i] = elements[i];
			}
			elements = temp;
		}
		elements[lastElementIndex+1] = ref;
		lastElementIndex++;
		*/
		add(lastElementIndex+1, ref);
	}
	
	
	public void add(int i, Object ref) {
		if(i <0 || i> lastElementIndex+1) {
			throw new IndexOutOfBoundsException();
		}
		
		
		if(lastElementIndex == elements.length-1) {
			Object[] temp = new Object[(elements.length)*2];
			for(int j = 0;j<lastElementIndex; j++) {
				temp[j] = elements[i];
			}
			elements = temp;
		}
		for(int k = lastElementIndex; k>=i; k--) {	
			elements[k+1] = elements[k];
		}
		elements[i] = ref;
		lastElementIndex++;
		
	}
	
	public Object remove(int index) {
		if(index <0 || index > lastElementIndex+1) {
			throw new IndexOutOfBoundsException();
		}
		
		Object temp = elements[index];
		for(int i = index; i<lastElementIndex;i++) {
			elements[i] = elements[i+1];
		}
		lastElementIndex--;
		return temp;
	}
	
	public boolean remove(Object ref) {
		for(int i = 0; i<lastElementIndex; i++) {
			if(elements[i].equals(ref)) {//if(elements[i]==ref) // wrong{
				remove(i);
				return true;
			}
		}
		return false;
	}
	
	
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<=lastElementIndex; i++) {
			sb.append(elements[i]);
			if(i!=lastElementIndex) sb.append("->");
		}
		return sb.toString();
	}
	
	
	//only for development purpose//delete later
	public void spillTheGut() {
		for(int i = 0; i<elements.length;i++) {
			if(elements[i] != null) System.out.print(elements[i]);
			else {
				System.out.print("[" + elements[i] +"]");
			}
		}
	}
}
