import java.net.Socket;
import java.net.*;
import java.io.*;


public class ReaderThread extends Thread {
    
	private BufferedReader in;
    public ReaderThread(BufferedReader in) {
		this.in = in;
    
    }

    public void run() {
		String userInput;
		try{
            while ((userInput = in.readLine()) != null) {
			System.out.println("echo: " + userInput);}
			 } catch (IOException e) {
			 System.exit(1);}
	}
	}
				
				
				
