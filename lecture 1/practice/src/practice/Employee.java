package practice;

import java.util.Scanner;

public class Employee {
	String name;
	int age;
	
	public Employee(String name, int ag) {
		this.name= name;
		age = ag;
	}
	
	
	
	public static void main(String[] args) {
		//System.out.println("hhhhh");
		Employee Adham = new Employee("Adham",5);
		//System.out.println("my name is :"+Adham.name+"\tmy age is : "+Adham.age);
		System.out.print("ENTER YOUR NAME : ");
		Scanner scanner = new Scanner(System.in);
		String ame = scanner.nextLine().trim();
		System.out.print("YOUR NAME is "+ame);
	}

}
