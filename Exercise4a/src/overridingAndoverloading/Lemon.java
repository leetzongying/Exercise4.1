package overridingAndoverloading;

public class Lemon extends Fruit{
	
	protected String country;
	protected double price;
	
	public Lemon(String n, String c, double p) {
		super(n);
		this.country = c;
		this.price = p;
		
	}

	public double unitPrice() {
		return price;
	}
	public double unitPrice(double tax) {
		return price*(1+ tax);
	}
	public double unitPrice(double tax, double quota) {
		return price*(1+ tax + quota);
	}
	
	public String toString() {
		if (country.equals("Malaysia")) {
			unitPrice();
			return super.toString() +
				       "\nCountry of Origin\t\t: " + country +
					   "\nOriginal Price\t\t\t: RM" + price +
					   "No tax imposed in local made fruit" +
					   "\nActual Price\t\t\t: RM" + unitPrice();
		
		}
			else if (country.equals("Singapore")) {
			double tax = 0.3; 
			unitPrice(tax);
			return super.toString() +
					"\nCountry of Origin\t\t: " + country +
					   "\nOriginal Price\t\t\t: RM" + price +
					   "\nTotal tax\t\t\t: " + (tax*100) +"%" +
					   "\nActual Price\t\t\t: RM" + unitPrice(tax);
		}
		
			else if (country.equals("Japan")){
			double tax = 0.4;
			double quota = 0.1; 
			unitPrice(tax,quota); 
			return super.toString() +
					"\nCountry of Origin\t\t: " + country +
					   "\nOriginal Price\t\t\t: RM" + price +
					   "\nTotal tax\t\t\t: " + ((tax+quota)*100) +"%" +
					   "\nActual Price\t\t\t: RM" + unitPrice(tax,quota);

	}
		return country;
	}
}
