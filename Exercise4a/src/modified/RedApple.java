package modified;

public class RedApple extends Apple {

	private String taste;
	private double calory;
	
	public RedApple(String name, int q, double p, String t, double c) {
		super(name,q,p);
		this.taste = t;
		this.calory = c;
		
		System.out.println(name + " Constructor is Invoked");
	}
	public String taste() {
		return this.taste;
	}
	
	public double calory() {
		return this.calory;
	}
	public double TotalCalory(){
		return this.quantity*this.calory;
	}
}
