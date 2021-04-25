
public class GreenApple extends Apple{
	private int quantity;
	private double vitaminc;
	
	public GreenApple(String name, int r, double s) {
		super(name);
		this.quantity = r;
		this.vitaminc = s;
		
		System.out.println(name + " constructor is invoked");
	}
	
	public double totalVitaminC() {
		return quantity*vitaminc;
	}

	public int getQuantity() {
		return this.quantity;
	}
	public double getNutrient() {
		return this.vitaminc;
	}
}
