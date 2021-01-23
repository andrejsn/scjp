package de.naumovs.page109.extend_class;

public class B {

	int i;
	A objectA = new A();
//	String a = objectA.a;
	
	
	void abc(final int aa) {
		final String a;
		a = "a";
		// a = "b";
		int i=0;
		
		System.out.println(this.i);
		System.out.println(aa);
	}
	
	public static void main(String[] args) {
		new B().abc('a');
	}
}
