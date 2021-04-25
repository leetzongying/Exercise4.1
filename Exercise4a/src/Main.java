

public class Main {

	public static void main(String[] args) {
		
		Apple b = new Apple("Apple");
		RedApple a = new RedApple("Red Apple",3,10);
		GreenApple c = new GreenApple("Green Apple",4,53.2);
		
		System.out.println("Total price of " + a.name + " is RM" + a.totalPrice());
		System.out.println("Total vitamin c content in " + c.name + " is: " + c.totalVitaminC()+ "mg");

	}

}
