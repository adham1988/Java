package mygui;

import java.awt.*;
import java.awt.event.*;

public class Statistics extends Frame implements ActionListener {
	Frame f = new Frame("excercise");
	// Declare an Label instances l0,l3,l4,l5,l6,l7
	Label l0, l3, l4, l5, l6, l7;
//Declare an TextArea instance area
	TextArea area;
//Declare an TextField instances t1,t2,t3
	TextField t1, t2, t3;
//Declare an Button instances b1,b2
	Button b1, b2;

//Constructor to setup the GUI components
	Statistics() {
		// Construct Label l0
		l0 = new Label("Enter a rainfall measurments separated by space");
		// setBounds(int x-coordinate, int y-coordinate, int width, int height)
		l0.setBounds(30, 30, 300, 30);

		area = new TextArea();
		area.setBounds(30, 100, 300, 150);

		b1 = new Button("Calculate statistics");
		b1.setBounds(30, 260, 110, 30);

		b2 = new Button("clear");
		b2.setBounds(150, 260, 110, 30);

		l5 = new Label("Total");
		l5.setBounds(30, 300, 50, 20);
		t1 = new TextField();
		t1.setBounds(90, 300, 50, 20);
		t1.setEditable(false);

		l6 = new Label("Number");
		l6.setBounds(30, 330, 50, 20);
		t2 = new TextField();
		t2.setBounds(90, 330, 50, 20);
		t2.setEditable(false);

		l7 = new Label("Average");
		l7.setBounds(30, 360, 50, 30);
		t3 = new TextField();
		t3.setBounds(90, 360, 50, 20);
		t3.setEditable(false);

		// event handling by anonymous class
		/**
		 * In Java, a class can contain another class known as nested class. It's
		 * possible to create a nested class without giving any name. A nested class
		 * that doesn't have any name is known as an anonymous class. An anonymous class
		 * must be defined inside another class. Hence, it is also known as an anonymous
		 * inner class..
		 */

		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// get input from text area and stored in String text
				String text = area.getText();
				// store values separated by spaces in string array storage
				String storage[] = text.split("\\s");

				Float sum = 0.0f;
				// change the type of string elements to float, sum them and then add them to
				// int sum
				for (int c = 0; c < storage.length; c++)
					sum += Float.parseFloat(storage[c]);
				// print the value of variable sum to lable t1
				t1.setText("" + sum);
				t2.setText("" + storage.length);
				t3.setText("" + (sum / storage.length));

			}
		});

		b2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// clear area and textfields
				area.setText("");
				t1.setText("");
				t2.setText("");
				t3.setText("");

			}
		});
		
		
		//this handler is to activate the close button of the panel
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		// Frame container adds components
		f.add(l0);
		f.add(area);
		f.add(b1);
		f.add(b2);
		f.add(l5);
		f.add(l6);
		f.add(l7);
		f.add(t1);
		f.add(t2);
		f.add(t3);
		// determine the size of frame
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}

//ActionEvent handler - Called back upon button-click.

	public static void main(String[] args) {
		new Statistics();
	}
}