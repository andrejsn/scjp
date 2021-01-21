package de.naumovs.page074.certification;

public class Child extends Parent {

	void testIt() {
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		Child child = new Child();
		child.testIt();
		
		System.out.println(child.x);
	}
	
}
