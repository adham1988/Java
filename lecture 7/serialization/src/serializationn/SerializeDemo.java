package serializationn;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.name = "John Smith";
		e.address = "Fredrik Bajers Vej 7, Aalborg";
		e.cpr = "01011990001";
		e.number = 100;
		try {
			FileOutputStream fileOut = new FileOutputStream("C:\\Windows\\Temp\\employee.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(e);
			out.close();
			fileOut.close();
			System.out.println("Serialized data is saved in /tmp/employee.ser");
		} catch (IOException i) {
			i.printStackTrace();
		}
	}
}