package overridingAndoverloading;

public class Fruit {

	protected String name;

	public Fruit() {
		name = "";
	}
	public Fruit(String n) { //constructor for super class with parameter
	    name = n;
	}
	
	public String getName() {
		return name;
	}
	public String toString() { //overriding method
		return name + " constructor is invoked";
	}
}
