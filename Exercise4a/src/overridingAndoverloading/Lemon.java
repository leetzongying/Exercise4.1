package overridingAndoverloading;

public class Lemon extends Fruit{
	
	private String colour;
	private double weight;
	
	public Lemon() {
		super();
		colour = "";
		weight = 0;
	}

	public Lemon(String n, String c, double w) {
		super(n);
		colour = c;
		weight = w;
		
		setInfo(n,c,w);
	}
	
	public void setInfo(String n, String c, double w) {
		if(name.equals(null))
			n = " ";
		else
			n = name;
		
		if(colour.equals(null))
			colour = "";
		else
			c = colour;
		
		if(w >= 0)
			weight = w;
		else
			w = 0;
	}
	
	public String getColour() {
		return colour;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public String toString() {
		return "Type\t\t\t\t: " + name + 
			   "\nColour\t\t\t\t: " + colour + 
			   "\nWeight\t\t\t\t: " + weight + " g";
			   
	}
}
