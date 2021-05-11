package abstratAndInterface;

public abstract class Fruit {

	private String name;
	
	public Fruit() {
		name = "";
	}
	
	public Fruit(String n) {
		this.name=n;
	}
	
	public String printUses() {
		return "\nFruits are excellent source of essential vitamins and minerals";
	}
	
	public String getName() {
		return this.name;
	}
	
	public abstract String toString();
	public abstract double totalPrice();
	public abstract double totalPrice(double p1);

}
