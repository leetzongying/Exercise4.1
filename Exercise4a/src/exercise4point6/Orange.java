package exercise4point6;

public class Orange extends Fruit{
	
	protected int quantity;
	protected double price, weight, vitC;
	protected String country;
	
	public Orange(String n, int q, double p, double w, double v, String c) {
		super(n);
		this.quantity = q;
		this.price = p;
		this.weight = w;
		this.vitC = v;
		this.country = c;
		
        System.out.println(n + " constructor is invoked!");
		
		if (this.quantity <=5 ) {

			System.out.println("Quantity bought\t\t\t: " + this.quantity);
			System.out.printf("Price per "+ name + "\t\t: RM%.2f ", this.price);
			System.out.println("\nDiscount get\t\t\t: 0 %");
			System.out.printf("Total price\t\t\t: RM%.2f " , (quantity*price));
		}
		
			else if(this.quantity>5 && this.quantity<=20) { //if quantity more than 5 and less than or equal to 20
				double TP; //declare variable for total price
				TotalPrice btp = new OrangeTotalPrice(); //create a new object for TotalPrice orange
				double newP = btp.price();  //declare and initialize the new price of orange
				TP = btp.totalPrice(quantity);  //initialize the total price of orange
				System.out.println("Quantity bought\t\t\t: " + this.quantity);
				System.out.printf("Original price per " + name + "\t: RM%.2f" , price);
				System.out.printf("\nPrice per "+ name + "\t\t: RM%.2f" , newP);
				System.out.println("\nDiscount get\t\t\t: 0% ");
				System.out.printf("Total price\t\t\t: RM%.2f", TP);
		}
		
			else {
				double TP;  //declare variable for total price
				double disc;  //declare variable for discount
				Discount aa = new OrangeDiscount();  //create a new object for discount
				disc = aa.rateOfDiscount(); //initialize the discount
				TotalPrice btp = new OrangeTotalPrice();//create a new object for TotalPrice orange
				double newP = btp.price2();   //declare and initialize the new price of orange
				TP = btp.totalPrice(quantity, disc);  //initialize the total price of orange
				System.out.println("Quantity bought\t\t\t: " + this.quantity);
				System.out.printf("Original price per " + name + "\t: RM%.2f" , price);
				System.out.printf("\nPrice per "+ name + "\t\t: RM%.2f" , newP);
				System.out.println("\nDiscount get\t\t\t: "+ (disc*100) + "%");
				System.out.printf("Total price\t\t\t: RM %.2f", TP);
		}
		
		if(country == "Malaysia"){
			getVitC();
			System.out.println("\nCountry of origin\t\t: " + country);
			System.out.println("Weight\t\t\t\t: " + weight + " g");
			System.out.printf("Amount of Vitamin C\t\t: %.2f mg%n", getVitC());
		}
		
		else if(country == "Singapore") {
			double nVC = 46.8;
			getVitC(nVC);
			System.out.println("\nCountry of origin\t\t: " + country);
			System.out.println("Weight\t\t\t\t: " + weight + " g");
			System.out.printf("Amount of Vitamin C\t\t: %.2f mg%n", getVitC(nVC));
		}
		
		else {
			double nVC = 63.82;
			getVitC(nVC);
			System.out.println("\nCountry of origin\t\t: " + country);
			System.out.println("Weight\t\t\t\t: " + weight + " g");
			System.out.printf("Amount of Vitamin C\t\t: %.2f mg%n", getVitC(nVC));
		}
	}
	
	public double totalPrice(double newP) {    // overloading method with 1 argument
		return newP * this.quantity;
	}
	
	public double totalPrice(double newP, double disc) {     // overloading method with 2 argument
		return (newP * this.quantity) - (newP * this.quantity*disc);
	}

	public double getVitC() {   //overloading method with no parameter  calculate the amount of vitamin c
		return this.vitC * this.weight;
	}
	
	public double getVitC(double nvc) {   //overloading method with 1 parameter   calculate the amount of vitamin c
		return nvc * this.weight;
	}
	
	public String Facts() {
		return "Orange can protect your body cells from being damaged!";
	}
	
	public String toString() {
		return Facts();
	}

}
