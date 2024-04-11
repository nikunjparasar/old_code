package jrJava.nestedClass5;

import java.io.File;
import java.util.Iterator;
import java.util.Scanner;

public class DirtyArray {

	private String[] data;
	
	public DirtyArray(int size) {
		data = new String[size];
		
		new FileDataLoader().load();
	}
	
	
	public Iterator<String> iterator() {
		return new MyIterator();
	}
	 
	
	private class FileDataLoader {
		
		private Scanner scanner;
		private String path = "jrJava/nestedClass5/";
		
		public void load() {
			
			for(int i=0; i<data.length; i++) {
				File file = new File(path + "record" + i);
				if(!file.exists()) continue;
				try {
					scanner = new Scanner(file);
					String content = scanner.nextLine();
					
					if(content==null || content.trim().length()==0) continue;
					else data[i] = content;
					
					scanner.close();
				}
				catch(Exception e) { }
			}
		}
	}
	
	
	
	public class MyIterator implements Iterator<String> {
		
		private int currentIndex = -1; 
		
		public boolean hasNext() {
			for(int i=currentIndex; i<data.length-1; i++) {
				if(data[i+1]!=null) {
					currentIndex = i;
					return true;
				}
			}
			return false;
		}
		
		public String next() {
			return data[++currentIndex];
		}
		
		public void remove() {
			data[currentIndex] = null;
		}
		
	}
	
}





