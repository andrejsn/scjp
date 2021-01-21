package de.naumovs.page086;

public class Foo {

	private Foo(byte... b) {
		// TODO Auto-generated constructor stub
	}
	
	private void Foo() {
		System.out.println("bad named method Foo");
	}
	
	
	public static void main(String[] args) {
		new Foo((byte) 0).Foo();
	}
}
