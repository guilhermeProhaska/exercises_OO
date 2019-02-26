package entities;

public class Student {
	
	public String name;
	public double tri1;
	public double tri2;
	public double tri3;
	
	public double finalGrade(){
		
		return tri1 + tri2 + tri3;
	}
	
	public void passStudent() {
		
		double minPass = 60.00;
		
		double points = finalGrade() - minPass;
		
		if (points >= 0) {
			
			System.out.println("PASS");
			
		} else {
			
			points = points * -1;
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", points);
			
		}
		
	}

}
