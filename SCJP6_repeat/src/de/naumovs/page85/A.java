package de.naumovs.page85;

public class A {

	static void test(char c, int... x) {
		System.out.println(x.length);
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		test('1', 2, 3);
		test('1', 2, 3, 4, 5);
		test('1');
	}

}
