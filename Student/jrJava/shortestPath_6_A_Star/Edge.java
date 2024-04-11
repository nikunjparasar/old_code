package jrJava.shortestPath_6_A_Star;

public class Edge {
	
	private String start;
	private String end;
	private String roadName;
	private double distance;
	private String compassDir;
	
	
	public Edge(String start, String end, String roadName, double distance, String compassDir) {
		super();
		this.start = start;
		this.end = end;
		this.roadName = roadName;
		this.distance = distance;
		this.compassDir = compassDir;
	}
	
	
	public String getStart() {
		return start;
	}


	public String getEnd() {
		return end;
	}


	public String getRoadName() {
		return roadName;
	}

	

	public double getDistance() {
		return distance;
	}


	public void setDistance(double distance) {
		this.distance = distance;
	}


	public String getCompassDir() {
		return compassDir;
	}


	public void setCompassDir(String compassDir) {
		this.compassDir = compassDir;
	}

	
}



