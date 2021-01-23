package de.naumovs.page101;

public enum CofeeSize {
	// 8, 10 & 16 are passed to the constructor
	EMPTY, SMALL(4, "A"),  BIG(8), HUGE(10), OVERWHELMING(16);

	int ounces; // an instance variable
	
	CofeeSize() {
		// TODO Auto-generated constructor stub
	}

	CofeeSize(int ounces, String string) {
		this(ounces);
	}
	
	
	CofeeSize(int ounces) {
		this.ounces = ounces;
	}

	public int getOunces() {
		return this.ounces;
	}

	public static void main(String[] args) {

		
		Cofee cofee = new Cofee();
		cofee.cofeeSize = CofeeSize.BIG;
		System.out.println(cofee.cofeeSize.getOunces());
		
		
		for (CofeeSize cofeeSize : CofeeSize.values()) {
			System.out.println(cofeeSize + " " + cofeeSize.getOunces());
		}
	}
	
}


class Cofee {
	
	CofeeSize cofeeSize;
	
	
}