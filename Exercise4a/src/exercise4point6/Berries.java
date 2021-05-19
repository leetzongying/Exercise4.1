package exercise4point6;

public class Berries extends Fruit{
	
	protected int quantity;
	protected double price;
	
	public Berries(String n, int q, double p) {
		super(n);
		this.quantity = q;
		this.price = p;
		
		System.out.println(n + " constructor is invoked!");
		
		if (this.quantity <=5 ) {

			System.out.println("Quantity bought\t\t\t: " + this.quantity);
			System.out.printf("Price per "+ name + "\t\t: RM%.2f ", this.price);
			System.out.println("\nDiscount get\t\t\t: 0 %");
			System.out.printf("Total price: RM%.2f " , (quantity*price));
		}
		
			else if(this.quantity>5 && this.quantity<=20) { //if quantity more than 5 and less than or equal to 20
				double TP; //declare variable for total price
				TotalPrice btp = new BerriesTotalPrice(); //create a new object for TotalPrice berries
				double newP = btp.price();  //declare and initialize the new price of berries
				TP = btp.totalPrice(quantity);  //initialize the total price of berries
				System.out.println("Quantity bought\t\t\t: " + this.quantity);
				System.out.printf("Original price per " + name + "\t: RM%.2f" , price);
				System.out.printf("\nPrice per "+ name + "\t\t: RM%.2f" , newP);
				System.out.println("\nDiscount get\t\t\t: 0% ");
				System.out.printf("Total price: RM%.2f", TP);
		}
		
			else {
				double TP;  //declare variable for total price
				double disc;  //declare variable for discount
				Discount aa = new BerriesDiscount();  //create a new object for discount
				disc = aa.rateOfDiscount(); //initialize the discount
				TotalPrice btp = new BerriesTotalPrice();//create a new object for TotalPrice berries
				double newP = btp.price2();   //declare and initialize the new price of berries
				TP = btp.totalPrice(quantity, disc);  //initialize the total price of berries
				System.out.println("Quantity bought\t\t\t: " + this.quantity);
				System.out.printf("Original price per " + name + "\t: RM%.2f" , price);
				System.out.printf("\nPrice per "+ name + "\t\t: RM%.2f" , newP);
				System.out.println("\nDiscount get\t\t\t: "+ (disc*100) + "%");
				System.out.printf("Total price: RM %.2f", TP);
		}
	}
	
	public double totalPrice(double newP) {    // overloading method with 1 argument
		return newP * this.quantity;
	}
	
	public double totalPrice(double newP, double disc) {     // overloading method with 2 argument
		return (newP * this.quantity) - (newP * this.quantity*disc);
	}
	
	public String Facts() {
		return "Berries can help improve blood sugar and insulin response!";
	}
	
	public String toString() {
		return Facts();
	}

}
