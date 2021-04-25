
public class RedApple extends Apple {

	private int quantity;
	private double price; 
	
	public RedApple(String name, int q, double p) {
		super(name);
		this.quantity = q;
		this.price = p;
		
		System.out.println(name + " constructor is invoked");
	}
	
	public double totalPrice() {
		return quantity*price;
	}

	public int getQuantity() {
		return this.quantity;
	}
	public double getPrice() {
		return this.price;
	}
}
