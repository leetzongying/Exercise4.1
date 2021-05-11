package abstratAndInterface;

public class YellowMelon extends Melon{
	
	public YellowMelon(String n, int q, double p) {
		super(n,q,p);
	}
	
	public String printFacts() {
		return "\nYellow Melon helps you with better bowel movement, thus no constipation!";
	}
	
	public String toString() {
		return printFacts();
	}

}
