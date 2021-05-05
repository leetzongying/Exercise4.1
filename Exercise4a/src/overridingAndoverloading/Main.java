package overridingAndoverloading;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit f = new Fruit("Fruit");
		System.out.println(f);
		System.out.println();
		System.out.println("======================================================");
	
		System.out.println("-----------> (Apple) <-----------\n");
		Apple a = new Apple("Apple", 6, 2);
		System.out.println(a);
		System.out.println();
		
		RedApple r = new RedApple("Red apple", 100, 2.3, "sweet", 52.3);
		System.out.println("---------> (Red Apple) <---------\n" + r);
		System.out.println(r.totalCalory());
		System.out.println();
		
		GreenApple g = new GreenApple("Green Apple", 6, 2.4, "sour", 0.072);
		System.out.println("--------> (Green Apple) <--------\n" + g);
		System.out.println(g.totalVitaminC());
		System.out.println();
		
		Lemon l = new Lemon("Lemon", "Japan", 1.5);
		System.out.println("----------> (Lemon) <----------\n" + l);
		
		System.out.println();
		
		Watermelon w = new Watermelon("Watermelon", "Medium", 6.2);
		System.out.println("----------> (Watermelon) <----------\n" + w);
	}

}
