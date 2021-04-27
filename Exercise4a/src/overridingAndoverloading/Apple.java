package overridingAndoverloading;

public class Apple extends Fruit {
	
	protected int quantity;
	protected double price;
	
	public Apple() {
		super();
		quantity = 0;
		price = 0;
	}
	
	public Apple(String n, int q, double p) {
		super(n);
		quantity = q;
		price = p;
		
		setInfo(n,q,p);
	}
	
	public void setInfo(String n, int q, double p) {
		if(name.equals(null))
			n = " ";
		else
			n = name;
		
		if(q >= 0)
			quantity = q;
		else
			quantity = 0;
		
		if(p >= 0)
			price = p;
		else
			price = 0;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double getPrice() {
		return price;
	}
	
	public double totalPrice() {
		return price * quantity;
	}
	
	public String toString() { //overriding method
		return "Type\t\t\t\t: " + name + 
			   "\nQuantity\t\t\t: " + quantity + 
			   "\nPrice\t\t\t\t: RM " + price +
			   "\nTotal Price\t\t\t: RM " + totalPrice();
	}
	

}
