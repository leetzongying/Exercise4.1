package abstratAndInterface;

public class RedMelon extends Melon {
	
	public RedMelon(String n, int q, double p) {
		super(n,q,p);
	}
	
	public String printFacts() {
		return "\nRed Melon is good for cooling body temperature in hot days.";
	}
	
	public String toString() {
		return printFacts();
	}
}
