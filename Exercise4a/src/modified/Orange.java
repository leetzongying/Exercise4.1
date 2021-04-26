package modified;

public class Orange extends Fruit{

	private String colour;
	private double weight;
	
	public Orange(String name, String c, double w) {
		super(name);
		this.colour = c;
		this.weight = w;
		
		System.out.println("Orange constructor is invoked");
	}
	public String getColour() {
		return this.colour;
	}
	public double getWeight() {
		return this.weight;
	}
}
