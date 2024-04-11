package jrJava.tree3_caseStudy;

public class State implements Comparable<State> {
	private String name;
	private String abbr;
	private String capital;
	private int population;
	private int area;
	private int yy, mm, dd;
	
	public State(String name, String abbr, String capital, int population, int area, int yy, int mm, int dd) {
		super();
		this.name = name;
		this.abbr = abbr;
		this.capital = capital;
		this.population = population;
		this.area = area;
		this.yy = yy;
		this.mm = mm;
		this.dd = dd;
	}
	
	public String toString() {
		return abbr;
	}
	
	public boolean equals(Object o) {
		if(!(o instanceof State)) return false;
		State other = (State)o;
		return abbr.equals(other.abbr);
	}
	


	public int compareTo(State o) {
		if(yy- o.yy > 0) return 1;
		else if(yy - o.yy< 0) return -1;
		else {
			if(mm - o.mm > 0) return 1;
			else if(mm - o.mm< 0) return -1;
			else{
				if(dd - o.dd> 0) return 1;
				else if(dd - o.dd < 0) return -1;
				else {
					return 0;
				}
			}
		}
			
	}
}
