package jrJava.abstractType_5_generics;

public class StatDataStorage<E extends Number> {

	private E[] data;
	
	public void setData(E[] data) {
		this.data = data;
	}
	
	public E getData(int index) {
		return data[index];
	}
	
	public E min() {
		E min = data[0];
		for(int i = 1; i< data.length; i++) {
			if(data[i].doubleValue()< min.doubleValue()) min = data[i]; 
		}
		return min;
	}
	
	public Double getAverage() {
		double sum = 0.0;
		for(int i = 0; i<data.length; i++) {
			sum += data[i].doubleValue();
		}
		return sum/data.length;
	}
	
}
