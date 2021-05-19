package exercise4point6;

public abstract class Fruit {

protected String name;

	public Fruit() {
		name = "";
	}
	
	public Fruit(String n) {
		this.name=n;
	}
		
	public String getName() {
		return this.name;
	}
	
	public abstract String toString();
	public abstract String Facts();
}
