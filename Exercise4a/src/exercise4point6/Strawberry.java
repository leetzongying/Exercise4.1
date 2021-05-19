package exercise4point6;

public class Strawberry extends Berries {
	
	public Strawberry(String n, int q, double p) {
		super(n,q,p);
	}
	
	public String Facts() {
		return "Strawberries are good for skincare!";
	}
	
	public String toString() {
		return Facts();
	}

}
