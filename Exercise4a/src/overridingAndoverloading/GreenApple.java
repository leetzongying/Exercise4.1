package overridingAndoverloading;

public class GreenApple extends Apple{

	private String taste;
	private double vitc;
	
    public GreenApple(String n, int q, double p,String t, double c) { //constructor sub class with argument
	    super(n, q, p); //called method in superclass with passing parameter
	    taste = t;
	    vitc = c;


}
 
public String getTaste() {
	return this.taste;
}

public double getVitaminC() {
	return vitc;
}

public double totalVitaminC(){
	return this.vitc*quantity;
}

public String toString() { //overriding method
	return super.toString() +
		   "\nTaste\t\t\t\t: " + taste +
		   "\nVitamin C content\t\t: " + vitc + " mg" +
		   "\nTotal Vitamin C content\t\t: " + totalVitaminC() + " mg";

}
}
