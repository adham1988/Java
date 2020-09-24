package geometri;
import java.util.Scanner;
public class MyCircle extends Geometri{
	double radius;
	double Areal;
	double perimeter;
	
	/**
	* Method to calculate the areal of the circle
	* pass to arguments, a and b
	* @param  a, is a double that represents the radius
	* @param  b, is a double that represents pi 
	*/
	public void calculateAreal(double a, double b) {
		Areal = (a*a*b); 			//variable Areal will store the result of the method  calculateAreal.
	}
	
	/**
	* Method to calculate the perimeter of the circle
	* pass to arguments, a and b
	* @param  a, is a double that represents the radius
	* @param  b, is a double that represents pi 
	*/
	public void calculatePerimeter(double a, double b) {
		perimeter = (2*a*b) ; 			//result stored in double perimeter
	}
	
	public Double getperi() {
		return perimeter;
	}
	
	public MyCircle(String name) {
		super(name);
	}
	public String getName() {
		return super.getName();
	}
	
	public static double inputAmount() {
	    Scanner input = new Scanner(System.in);
	    while (true) {
	    	System.out.println("Enter the radius of the circle to calculate the Areal: ");
	        try {
	            return input.nextDouble();
	        }
	        catch (java.util.InputMismatchException e) {          
	        	System.out.println("you have entered invalid value");
	        	System.out.println("please try again");
	        	System.out.println("");
	            input.nextLine();
	        }
	    }
	}


	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	System.out.print("Choose a name for the circle: ");
	String NameInput = scanner.nextLine().trim();
	MyCircle circle = new MyCircle(NameInput);
	
	
	
	//circle.inputAmount();
	circle.radius = circle.inputAmount();
	
	
	circle.calculateAreal(circle.radius,circle.pi);
	System.out.println("name : "+circle.getName());
	System.out.println("the areal is : "+circle.Areal+" square meter");
	
	circle.calculatePerimeter(circle.radius,circle.pi);
	System.out.println("the perimeter is : "+circle.perimeter+" square meter");
	
	
	
	}
	
}