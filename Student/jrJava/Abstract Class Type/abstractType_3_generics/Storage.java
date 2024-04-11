package jrJava.abstractType_3_generics;


public class Storage<E> {

	private E data;
	
	public void setData(E data){ this.data = data; }
	public E getData(){ return data; }
	
}
