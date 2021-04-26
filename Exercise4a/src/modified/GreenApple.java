package modified;

public class GreenApple extends Apple{

	private String taste;
	private double vitc;
	
	public GreenApple(String name, int q, double p, String t, double v) {
		super(name,q,p);
		this.taste = t;
		this.vitc = v;
		
		System.out.println(name + " Constructor is Invoked");
	}
	public String taste() {
		return this.taste;
	}
	
	public double VitaminC() {
		return this.vitc;
	}
	public double TotalVitaminC(){
		return this.quantity*this.vitc;
	}
}
