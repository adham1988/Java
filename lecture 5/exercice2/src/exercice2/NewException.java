package exercice2;

public class NewException extends Exception {
	public NewException () {
		super("number is larger than 90");
	}
	
	public NewException(String message) {
		super(message);
	}
	

}
