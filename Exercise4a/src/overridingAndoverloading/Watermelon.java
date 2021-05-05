package overridingAndoverloading;

public class Watermelon extends Fruit{
	
	protected String size;
	protected double sugar;
	
	public Watermelon(String n, String S, double s) {
		super(n);
		this.size = S;
		this.sugar = s;
		
	}
	
	public double totalSugar() {
		return sugar;
	}
	public double totalSugar(double ratio) {
		return sugar*(1+ratio);
	}
	public double totalSugar(double ratio1, double ratio2) {
		return sugar*(1+ratio1+ratio2);
	}
		
		public String toString() {
			if (size.equals("Small")) {
				totalSugar();
				return super.toString() +
					       "\nSize\t\t\t\t: " + size +
						   "\nAverage Sugar Content\t\t: " + totalSugar() + " mg";
			
			}
				else if (size.equals("Medium")) {
				double ratio = 0.2; 
				totalSugar(ratio);
				return super.toString() +
						"\nSize\t\t\t\t: " + size +
						"\nAverage Sugar Content\t\t: " + sugar + " mg"+
						"\nMedium to small size comparison\t: " + (100+(100*ratio)) +  "%" +
						"\nActual Sugar Content\t\t: " + totalSugar(ratio) + " mg";
			}
			
				else if (size.equals("Large")){
					double ratio1 = 0.2;
					double ratio2 = 0.1;
					totalSugar(ratio1,ratio2);
					return super.toString() +
									"\nSize\t\t\t\t: " + size +
									"\nAverage Sugar Content\t\t: " + sugar + " mg"+
									"\nLarge to small size comparison\t: " + (100+(100*(ratio1+ratio2))) + "%" +
							"\nActual Sugar Content\t\t: " + totalSugar(ratio1,ratio2) + " mg";

		}
			return size;

		}
			   
	}


