package de.naumovs.page063;


class Moo extends de.naumovs.page063.Zoo  {

	void useAZoo() {
		

		
		System.out.println("A Zoo says, " + this.coolMethod());
		
	}
	
	public static void main(String[] args) {
		Moo moo = new Moo();
		moo.useAZoo();
	}
	
	
}
