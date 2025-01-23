package org.comp;

public class Greensambattur extends Greensavadi{

	@Override
	public void noStudents() {
		System.out.println("100");
		
	}

	@Override
	public void testingStudents() {
       System.out.println("50");
		
	}
	
	
	public void fullstackStudents() {
		 System.out.println("50");

	}
	
	
	public static void main(String[] args) {
		Greensambattur s = new Greensambattur();
		s.fullstackStudents();
		s.noStudents();
		s.testingStudents();
	}
	
	
	
	
	
	
	
	

}
