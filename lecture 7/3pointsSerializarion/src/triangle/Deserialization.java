package triangle;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) {
		MyPoint A = null;
		MyPoint B = null;
		MyPoint C = null;
		
		try {
			FileInputStream fileIn = new FileInputStream("C:\\Windows\\Temp\\mypoint.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			A = (MyPoint) in.readObject();
			B = (MyPoint) in.readObject();
			C = (MyPoint) in.readObject();
			in.close();
			fileIn.close();
		} catch (IOException i) {
			i.printStackTrace();
			return;
		} catch (ClassNotFoundException c) {
			System.out.println("Employee class not found");
			return;
		}
		System.out.println("Deserialized Employee:");
		System.out.println("A x,y: " + A.x+A.y);
		System.out.println("B x,y: " + B.x+B.y);
		System.out.println("C x,y: " + C.x+C.y);
	
		checkTriangle(A.x,A.y,B.x,B.y,C.x,C.y);
		
	}
	public static void checkTriangle(int x1, int y1, int x2, int y2, int x3, int y3) { 

		// Calculation the area of 
		// triangle. We have skipped 
		// multiplication with 0.5 
		// to avoid floating point 
		// computations 
		int a = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2); 

		// Condition to check if 
		// area is not equal to 0 
		if (a == 0) 
			System.out.println("NO"); 
		else
			System.out.println("yes it is a triangle with A = "+a);	
			
}
}
