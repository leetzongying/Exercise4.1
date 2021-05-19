package exercise4point6;

class BerriesTotalPrice implements TotalPrice{
	
	public double price() { 
		return 2.8;
	}
	
	public double price2() {
		return 2.5;
	}
	public double totalPrice(int quantity) {
		double newP = price(); //newP is new price
		return newP * quantity;
	}
	
	public double totalPrice(int quantity, double disc) {
		double newP= price2();  //newP is new price
		return (newP * quantity) - (newP * quantity*disc);
	}
}

class OrangeTotalPrice implements TotalPrice{
	
	public double price() {
		return 2.5;
	}
	
	public double price2() {
		return 2.35;
	}
	public double totalPrice(int quantity) {
		double newP = price();  //newP is new price
		return newP * quantity; 
	}
	
	public double totalPrice(int quantity, double disc) {
		double newP= price2();  //newP is new price
		return (newP * quantity) - (newP * quantity*disc);
	}
}

class AppleTotalPrice implements TotalPrice{
	
	public double price() {
		return 2.2;
	}
	
	public double price2() {
		return 2.05;
	}
	public double totalPrice(int quantity) {
		double newP = price(); //newP is new price
		return newP * quantity;
	}
	
	public double totalPrice(int quantity, double disc) {
		double newP= price2(); //newP is new price
		return (newP * quantity) - (newP * quantity*disc);
	}
}

