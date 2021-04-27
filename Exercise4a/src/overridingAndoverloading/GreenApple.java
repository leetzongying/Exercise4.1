package overridingAndoverloading;

public class GreenApple extends Apple{

	private String taste;
	private double vitc;
	
	public GreenApple() { //constructor for sub class
		super(); //inherit data, method from super class(constructor with no argument)
		taste = " ";
		vitc = 0;	
}

    public GreenApple(String n, int q, double p, String t, double c) { //constructor sub class with argument
	    super(n, q, p); //called method in superclass with passing parameter
	    taste = t;
	    vitc = c;
	
	//green apple
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

public String getTaste() {
	return this.taste;
}

public double getVitaminC() {
	return vitc;
}

public double totalVitaminC(){
	return this.quantity*this.vitc;
}

public String toString() { //overriding method
	return "Type\t\t\t\t: " + name +
		   "\nQuantity\t\t\t: " + quantity +
		   "\nPrice\t\t\t\t: RM " + price +
		   "\nTaste\t\t\t\t: " + taste +
		   "\nPrice\t\t\t\t: RM " + totalPrice() +
		   "\nTotal Vitamin C content\t\t: " + totalVitaminC() + " mg";
}
}
