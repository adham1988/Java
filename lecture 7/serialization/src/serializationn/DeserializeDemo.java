package serializationn;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo {
	public static void main(String[] args) {
		Employee e = null;
		try {
			FileInputStream fileIn = new FileInputStream("C:\\Windows\\Temp\\employee.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			e = (Employee) in.readObject();
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
		System.out.println("Name: " + e.name);
		System.out.println("Address: " + e.address);
		System.out.println("CPR: " + e.cpr);
		System.out.println("Number: " + e.number);
	}
}