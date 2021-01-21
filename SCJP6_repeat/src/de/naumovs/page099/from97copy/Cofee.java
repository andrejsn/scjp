package de.naumovs.page099.from97copy;

// import de.naumovs.page99.from97copy.Cofee.CofeeSize;

public class Cofee {

	enum CofeeSize {
		BIG, HUGE, OVERWHELMING;
	};

	CofeeSize size = CofeeSize.OVERWHELMING;

}

class CoffeeTest1 {
	public static void main(String[] args) {
		
		
		
		Cofee cofee = new Cofee();
		cofee.size = Cofee.CofeeSize.BIG; // or import!
		// cofee.size = CofeeSize.BIG; // or import!
	}
}