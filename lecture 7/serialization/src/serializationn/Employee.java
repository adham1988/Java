package serializationn;

public class Employee implements java.io.Serializable {
	public String name;
	public String address;
	public String cpr;
	public int number;

	public void sendCheck() {
		System.out.println("Mailing a check to " + name + " " + address);
	}
}