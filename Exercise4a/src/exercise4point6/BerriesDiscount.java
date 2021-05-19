package exercise4point6;

class BerriesDiscount implements Discount{
	
	public double rateOfDiscount() {
		return 0.2d;
	}
	
}

class AppleDiscount implements Discount{
	
	public double rateOfDiscount() {
		return 0.3d;
	}
}

class OrangeDiscount implements Discount{
	
	public double rateOfDiscount() {
		return 0.25d;
	}
}


