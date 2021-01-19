package de.naumovs.page43;

import javax.swing.SingleSelectionModel;

 final class Identifiers {

	// legal
	int _a;
	int $c;
	int ________________abc;
	static int _$;
	int this_is_a_very_detailed_name_for_an_identifier;

	// ilegal
//	int :b;
//	int -d;
//	int e#;
//	int .f;
//	int 7g;
//	
	int foo, fooarray[]; // WRONG!

	int level; // indentation level
	int size; // size of table
	Object currentEntry; // currently selected table entry

	void myMethod() {
//		int int1;         // beginning of method block
		_$ = 2;
		boolean condition = true;
		if (condition) {
			int int1; // beginning of "if" block ...^
			int1 = 10;
			System.out.println(int1 + _$);
			for (;int1 < 12; int1 = _$++) {
				
				System.out.println(int1);
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Identifiers identifiers = new Identifiers();
		identifiers.myMethod();
		// throw new NullPointerException();
		
//		A a = identifiers;
		
		A a = new A();
		System.out.println(a);

		B b =  identifiers.new B();
		
	}
	
	
	private class B {
		
		SingleSelectionModel model;
	}

}
  class A {
	 
	 SingleSelectionModel model;
 }
 

