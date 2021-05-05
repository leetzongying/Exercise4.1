package overridingAndoverloading;

public class RedApple extends Apple {
	
	private String taste;
	private double calory;

	public RedApple(String n, int q, double p, String t, double c) { //constructor sub class with argument
		super(n, q, p); //called method in superclass with passing parameter
		taste = t;
		calory = c;

		
	}
	
	public double getCalory() {
		return calory;
	}
	
	public String getTaste() {
		return this.taste;
	}

	public double totalCalory() {
		return this.calory*quantity;
	}


	public String toString() { //overriding method
		return super.toString() +
			   "\nTaste\t\t\t\t: " + taste +
			   "\nCalory\t\t\t\t: " + calory +
			   "\nTotal Calory\t\t\t: " + totalCalory() + " J";

	}
}
