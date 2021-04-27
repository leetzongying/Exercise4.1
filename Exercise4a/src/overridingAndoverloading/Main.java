package overridingAndoverloading;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Fruit f = new Fruit(); //universal 
		System.out.println("Fruits");
		System.out.println("======================================================");
	
		Apple a = new Apple("Apple", 6, 2.99);
		System.out.println("-----------> (Apple) <-----------\n" + a);
		
		System.out.println();
		
		RedApple r = new RedApple("Red apple", 6, 7.92, "sweet", 52.3);
		System.out.println("---------> (Red Apple) <---------\n" + r);
		
		System.out.println();
		
		GreenApple g = new GreenApple("Green Apple", 6, 7.52, "sour", 0.072);
		System.out.println("--------> (Green Apple) <--------\n" + g);
	
		System.out.println();
		
		Lemon l = new Lemon("Lemon", "Yellow", 84);
		System.out.println("----------> (Lemon) <----------\n" + l);
		
		System.out.println();
		
		Watermelon w = new Watermelon("Watermelon", "Medium", 6.2);
		System.out.println("----------> (Watermelon) <----------\n" + w);
	}

}
