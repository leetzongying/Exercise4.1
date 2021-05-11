package abstratAndInterface;

public class Apple extends Fruit implements Discount {
	
	protected String country;
	protected int quantity;
	protected double price, discount;
	
	public Apple() {
		super();
		this.price=0;
		this.quantity=0;
		this.discount=0;
		this.country = "";
	}
	
	public Apple(String n, int q, double p, String c) {
		super(n);
		this.quantity=q;
		this.price=p;
		this.country=c;
		
		System.out.println(n + " constructor is invoked!");
		System.out.printf("\nUnit Price\t: RM%.2f" , price);
		System.out.println("\nCountry of origin: " + country);
		
		if (country=="Malaysia") {
			double newprice = price*(1-rateOfDiscount()); 
			System.out.println("Quantity\t: " + quantity);
			System.out.printf("\nOriginal Price: RM%.2f" , totalPrice());
			System.out.printf("\nLocal Fruits gets the most discount, Total price: RM%.2f" , totalPrice(newprice));
		}
		
		else if (country=="Singapore") {
			double newprice = price*(1-rateOfDiscount()); 
			System.out.println("Quantity\t: " + quantity);
			System.out.printf("\nOriginal Price: RM%.2f" , totalPrice());
			System.out.printf("\nNeighbouring Fruits gets moderate discount, Total price: RM%.2f" , totalPrice(newprice));
		}
		
		else { 
			double newprice = price*(1-rateOfDiscount()); 
			System.out.println("Quantity\t: " + quantity);
			System.out.printf("\nOriginal Price: RM%.2f" , totalPrice());
			System.out.printf("\nAll foreign fruits gets the least discount, Total price: RM%.2f" , totalPrice(newprice));
		}
	}
	
	public double rateOfDiscount() {
		if(country == "Malaysia") {
			return 0.3;
			}
		else if(country == "Singapore") {
			return 0.2;
		}
		else {
			return 0.15;
		}
	}

	
	public double totalPrice() {
		return price*quantity;
	}
	
	public double totalPrice(double p1) {
		return p1* quantity;
	}
	
	public String printFacts() {
		return "\nDo you know that one apple keeps a doctor away?";
	}
	
	public String toString() {
		return printFacts();
	}


}
