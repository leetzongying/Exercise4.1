package overridingAndoverloading;

public class RedApple extends Apple {
	
	private String taste;
	private double calory;

	public RedApple() { //constructor for sub class
			super(); //inherit data, method from super class(constructor with no argument)
			taste = " ";
			calory = 0;	
	}
	
	public RedApple(String n, int q, double p, String t, double c) { //constructor sub class with argument
		super(n, q, p); //called method in superclass with passing parameter
		taste = t;
		calory = c;
		
		//red apple
		setInfo(n, q, p, t, c); //method for overloading
	}
	
	public void setInfo(String n, int q, double p, String t, double c) { //overloading method with parameters
		if(name.equals(null))
			n = " ";
		else
			n = name;
		
		if(taste.equals(null))
			t = "";
		else
			t = taste;
	}
	
	public double getCalory() {
		return calory;
	}
	
	public String getTaste() {
		return this.taste;
	}
	
	public double totalCalory(){
		return this.quantity*this.calory;
	}

	public String toString() { //overriding method
		return "Type\t\t\t\t: " + name +
			   "\nQuantity\t\t\t: " + quantity +
			   "\nPrice\t\t\t\t: RM " + price +
			   "\nTaste\t\t\t\t: " + taste +
			   "\nPrice\t\t\t\t: RM " + totalPrice() +
			   "\nTotal price\t\t\t: " + totalCalory() + " J";
	}
}
