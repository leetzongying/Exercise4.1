package modified;

public class Pineapple extends Fruit{

	private String taste;
	private double vitB;
	
	public Pineapple(String name, String t, double v) {
		super(name);
		this.taste = t;
		this.vitB = v;
		
		System.out.println("Pineapple constructor is invoked");
	}
	public String getTaste() {
		return this.taste;
	}
	public double getVitaminB() {
		return this.vitB;
	}
}
