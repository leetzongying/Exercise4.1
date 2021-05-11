package abstratAndInterface;

public class Main {

	public static void main(String[] args) {
		
		Melon a = new Melon("Melon", 15 , 2.15);
		System.out.println();
		System.out.println(a + "\n");
		
		RedMelon b = new RedMelon("Red Melon", 35 , 2.3);
		System.out.println();
		System.out.println(b + "\n");
		
		YellowMelon c = new YellowMelon("Yellow Melon", 5 , 2.4);
		System.out.println();
		System.out.println(c + "\n");
		
		Apple d = new Apple("Apple", 10, 1.89, "Malaysia");
		System.out.println();
		System.out.println(d + "\n");

	}

}
