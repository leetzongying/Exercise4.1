package abstratAndInterface;

public class Melon extends Fruit implements Discount{
	
	protected int quantity;
	protected double price,discount;
	
	public Melon() {
		super();
		this.price=0;
		this.quantity=0;
		this.discount=0;
	}
	
	public Melon(String n, int q, double p) {
		super(n);
		this.quantity=q;
		this.price=p;
		
		System.out.println(n + " constructor is invoked!");
		System.out.printf("\nUnit Price\t: RM%.2f" , price);
		
		if (quantity < 10) {
			System.out.println("\nQuantity\t: " + quantity);
			System.out.printf("\nQuantity is less than 10, Total Price: RM%.2f" , totalPrice());
		}
		
		else if (quantity >= 10 && quantity <= 30) {
			double newprice = price*(1-rateOfDiscount()); 
			System.out.println("\nQuantity\t: " + quantity);
			System.out.printf("\nOriginal Price: RM%.2f" , totalPrice());
			System.out.printf("\nQuantity MORE than 10, Total price: RM%.2f" , totalPrice(newprice));
		}
		
			else if(quantity > 30){
			double newprice = price*(1-rateOfDiscount()); 
			System.out.println("\nQuantity\t: " + quantity);
			System.out.printf("\nOriginal Price: RM%.2f" , totalPrice());
			System.out.printf("\nQuantity MORE than 30, Total price: RM%.2f" , totalPrice(newprice));
		}
	}
	
	public double rateOfDiscount() {
		if(quantity<10) {
			return 0.1;
			}
		else if(quantity >= 10 && quantity <= 30) {
			return 0.2;
		}
		else if(quantity > 30) {
			return 0.3;
		}
		return discount;
	}

	
	public double totalPrice() {
		return price*quantity;
	}
	
	public double totalPrice(double p1) {
		return p1* quantity;
	}
	
	public String printFacts() {
		return "\nMelon could help in reducing blood pressure.";
	}
	
	public String toString() {
		return printFacts();
	}

}
