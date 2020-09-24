package triangle;
public class MyPoint implements java.io.Serializable {
	public int x;
	public int y;
	
	public void sendCheck() {
		System.out.println("Mailing a check to " + x + " " + y);
	}
}