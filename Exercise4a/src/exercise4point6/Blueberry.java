package exercise4point6;

public class Blueberry extends Berries{
	
	public Blueberry(String n, int q, double p) {
		super(n,q,p);
	}
	
	public String Facts() {
		return "Blueberry is the king of antitoxidant fruit!";
	}
	
	public String toString() {
		return Facts();
	}

}
