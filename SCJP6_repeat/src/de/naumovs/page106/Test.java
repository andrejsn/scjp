package de.naumovs.page106;

 class Test1 {

}

 class Test2 extends Test1{
	 static Test1 test1 = (Test1) new Test2();
	 
	 
	 public static void main(String[] args) {
		System.out.println(test1);
	}
 }