package modified;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Fruit myFruit = new Fruit("Fruit");
        System.out.println();
		
		Apple a = new Apple("Apple", 7, 6);
		System.out.println("Total Price: RM " + a.TotalPrice());
		System.out.println();
		
		RedApple b = new RedApple("Red Apple", 15, 2, "Sweet", 95);
		System.out.println("Total Price: RM " + b.TotalPrice());
		System.out.println("Taste: " + b.taste());
		System.out.println("Total Calories: " + b.TotalCalory());
		System.out.println();
		
		GreenApple c = new GreenApple("Green Apple", 20, 4, "Sour", 1);
		System.out.println("Total Price: RM " + c.TotalPrice());
		System.out.println("Taste: " + c.taste());
		System.out.println("Total VitaminC: " + c.TotalVitaminC() + " g");
		System.out.println();
		
		Orange d = new Orange("Orange", "orange", 12);
		System.out.println("Colour: " + d.getColour());
		System.out.println("Weight: " + d.getWeight() + " g");
		System.out.println();
		
		Pineapple e = new Pineapple("Pineapple","sour",2);
		System.out.println("Taste: " + e.getTaste());
		System.out.println("Total Vitamin B: " + e.getVitaminB() + " g");
	}

}
