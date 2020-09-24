package exercice2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;



public class Main {

	private static BufferedReader input;
	static String fileName = "C:\\Users\\Admin\\eclipse-workspace\\exercice2\\src/Mytxt.txt";

	public static void main(String[] args) throws IOException {
		/*
		 * int[] arr = new int[10]; int k=0; for (int i = 0; i < arr.length; i++) {
		 * System.out.println("\n line "+(i+1)+" "); for(int j = 0;j<arr.length;j++) {
		 * System.out.print("\t"+(k+1)+" "); k++; //System.out.println("hh ");
		 * 
		 * }
		 */
		// this section is to create numbers from 1 to 100 in 10 rows and then write
		// them to external txt file called Mytxt.txt
		try {
			FileWriter writer = new FileWriter(fileName);
			int[] Arr = new int[10];
			int K = 0;
			for (int I = 0; I < Arr.length; I++) {
				for (int z = 0; z < Arr.length; z++) {
					writer.write((K + 1) + "\t");
					K++;
				}
				writer.write(System.getProperty("line.separator"));
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// System.out.println("hello");

		ArrayList<Integer[]> arrayList = new ArrayList<>();

		try {
			input = new BufferedReader(new FileReader(fileName));
			String line;
			// while ((line = input.readLine()) != null) {
			// System.out.println(line);
			// }
			while (input.ready()) {
				line = input.readLine();
				//System.out.println(line);
				Integer[] arr = new Integer[10];
				int count = 0;
				Scanner s = new Scanner(line);
				while (s.hasNextInt()) {
						try {
						int n = s.nextInt();
						//assert (n > 90) : "wrong";//false exit and print wrong
						//arr[count] = n;
						//count++;
						
						if(n>80 && n<90){
							throw new NewException();
							//System.out.println("value added to array");
							}
						arr[count] = n;
						count++;
						}
						
						catch (NewException e) {
					//assert (s.nextInt() == 6) : System.out.println("wrong");
						System.out.println(e.getMessage());
					}
					
					
				}
				s.close();
				arrayList.add(arr);
				//System.out.println("f" + line);

			}
		} catch (FileNotFoundException e) {
			System.out.println("Could not find file!");
		}
		// to print the list array element
		String msg = "";
		for (int f = 0; f < 8; f++) {
			Integer[] arr = arrayList.get(f);
			for (int g = 0; g < 10; g++) {
				msg= msg+arr[g].toString() +" ";
			}
		}
		new DialogBox(msg);
		//System.out.println(msg);
	}

}