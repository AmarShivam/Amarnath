package org.in;

public class Sample {
	
	private void id() {
System.out.println("id is 123");
	}
	private void num() {
System.out.println("number is 9566");
}
//<<<<<<< HEAD
	private void mobile() {
System.out.println("mobile is nokia");
	}
	private void area() {
System.out.println("area is nanganallur");
//>>>>>>> 2bb23ffac6b0d5d5d823964b2e8a15b27cbd8c53
	}
	
	public static void main(String[] args) {
		Sample s= new Sample();
		s.id();
		s.num();
//<<<<<<< HEAD
		s.mobile();
//=======
		s.area();
		
//>>>>>>> 2bb23ffac6b0d5d5d823964b2e8a15b27cbd8c53
	}
}
