package overridingAndoverloading;

public class Apple extends Fruit {
	
	protected int quantity;
	protected double price;
		
	public Apple(String n, int q, double p) { //constructor with 3 arguments
		super(n);
		this.quantity = q;
		this.price = p;

	}

	public double totalPrice() {
		return price*quantity;
	}
	
	public double totalPrice(double p1) {
		return p1* quantity;
	}
	
	public double totalPrice(double discount, double p2) {
		return p2 * quantity * discount;
	}
	
	public String toString() { 
		if (quantity < 10) {
			totalPrice();
			return super.toString() +
				       "\nQuantity\t\t\t: " + quantity +
					   "\nOriginal Price\t\t\t: RM" + price +
					   "\nTotal Price\t\t\t: RM" + totalPrice();
		
		}
			else if (quantity > 10 && quantity < 50) {
			double newprice1 = 1.99; // beli lebi dari 10 tapi kurang dari 50, harga 1.99
			totalPrice(newprice1); //overloading with 1 argument
			return super.toString() +
				       "\nQuantity\t\t\t: " + quantity +
					   "\nOriginal Price\t\t\t: RM" + price +
					   "\nTotal Price\t\t\t: RM" + totalPrice(newprice1);
		}
		
			else {
			double newprice2 = 1.49; //beli lebih drp 50, harga menjadi 0.99
			double dis = 0.9; //beli byk lebih daripada 50, ada diskaun 10%
			totalPrice(dis, newprice2); //overloading with 2 arguments
			return super.toString() +
				       "\nQuantity\t\t\t: " + quantity +
					   "\nOriginal Price\t\t\t: RM" + price +
					   "\nTotal Price\t\t\t: RM" + totalPrice(dis,newprice2);

	}

	}
}
