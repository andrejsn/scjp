package de.naumovs.page099.ennum;

public class CoffeeSize {

	String enumName;
	int index;

	public CoffeeSize(String enumName, int index) {
		this.enumName = enumName;
		this.index = index;
	}

	public static final CoffeeSize BIG = new CoffeeSize("BIG", 0);
	public static final CoffeeSize SMALL = new CoffeeSize("SMALL", 0);
	
	
	public static void main(String[] args) {
		System.out.println(CoffeeSize.BIG.toString());
	}
	
	@Override
	public String toString() {
		return this.enumName;
	}
	
}
