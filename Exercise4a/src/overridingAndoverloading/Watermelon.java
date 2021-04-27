package overridingAndoverloading;

public class Watermelon extends Fruit{
	
	private String size;
	private double sugar;
	
	public Watermelon() {
		super();
		size = "";
		sugar = 0;
	}

	public Watermelon(String n, String S, double s) {
		super(n);
		size = S;
		sugar = s;
		
		setInfo(n,S,s);
	}
	
	public void setInfo(String n, String S, double s) {
		if(name.equals(null))
			n = " ";
		else
			n = name;
		
		if(size.equals(null))
			S = "";
		else
			S = size;
		
		if(s >= 0)
			s = sugar;
		else
			s = 0;
	}
	
	public String getSize() {
		return size;
	}
	
	public double getSugar() {
		return sugar;
	}
	
	public String toString() {
		return "Type\t\t\t\t: " + name + 
			   "\nSize\t\t\t\t: " + size + 
			   "\nSugar Content\t\t\t: " + sugar + " g";
			   
	}

}
