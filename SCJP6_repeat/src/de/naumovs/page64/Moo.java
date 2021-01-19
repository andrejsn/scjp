package de.naumovs.page64;

public class Moo  {
	
	void useMyCoolMethod() {
		
		Zoo zoo = new Zoo();
		
		System.out.println(zoo.coolMethod());
		
	}
	
//	 String coolMethod() {
//		return "woa baby";
//	}
	
	
	public static void main(String[] args) {
		
		new Moo().useMyCoolMethod();
		 System.out.println();
		
	}

}
