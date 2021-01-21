package de.naumovs.page097;

public class Cofee {
	

	
	CofeeSize size = CofeeSize.OVERWHELMING;
	
}

enum CofeeSize {
	BIG, HUGE, OVERWHELMING;
}

 class CoffeeTest1 {
	public static void main(String[] args) {
		Cofee cofee = new Cofee();
		cofee.size = CofeeSize.HUGE;
	}
}