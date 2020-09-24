package triangle;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {
	public static void main(String[] args) {
		MyPoint A = new MyPoint();
		A.x = 1;
		A.y = 1;
		MyPoint B = new MyPoint();
		B.x = 0;
		B.y = 2;
		MyPoint C = new MyPoint();
		C.x = -1;
		C.y = 1;
		try {
			FileOutputStream fileOut = new FileOutputStream("C:\\Windows\\Temp\\mypoint.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(A);
			out.writeObject(B);
			out.writeObject(C);
			out.close();
			fileOut.close();
			System.out.println("Serialized data is saved in /tmp/employee.ser");
		} catch (IOException i) {
			i.printStackTrace();
		}
	}
}
