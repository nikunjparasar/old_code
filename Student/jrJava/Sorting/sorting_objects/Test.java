package jrJava.sorting_objects;

public class Test {

	public static void main(String[] args) {
		
		Ball[] balls = Utility.loadBallsFromFile("jrJava/sorting_objects/balls.txt");
		
		Utility.print(balls);
		//sort(balls);
		sort(balls, 0, balls.length-1);
		Utility.print(balls);
		
	}
	
	//bubble sort
	public static void sort(Ball[] balls) 
	{
		int i;
		Ball temp;
		boolean sorted = false;
		while(!sorted) 

		{

			sorted = true;
			for(i=0;i<balls.length-1;i++) 
			{
				if(balls[i].getRadius()>balls[i+1].getRadius()) 
				{
					temp = balls[i];
					balls[i] = balls[i+1];
					balls[i+1] = temp;
					sorted = false; 
				}
			}
		}
	}

	//quick sort
	public static void sort(Ball[] data, int low, int high) {
		
			if(low>=high) return;
			
			Ball pivot = data[(low+high)/2]; 
			int i = low, j= high; 
			Ball temp;
			
			
			while(i<=j) {
				while(data[i].getRadius()<pivot.getRadius()) i++;
				while(data[j].getRadius()>pivot.getRadius()) j--;
				
				if(i<=j) {
					temp = data[j];
					data[j] = data[i];
					data[i] = temp;
					i++;
					j--;
				}
			}	
		
	}
}
