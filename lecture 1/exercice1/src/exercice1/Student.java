package exercice1;

//part 1 of the exercice
//Class Declaration (the concept)
public class Student extends Person implements interface1  {
	// Instance Variables
	String semester;
	String TypeOfdegree;
	float GPA;
	int gradeNumber;

	// Constructor Declaration of Class
	public Student(String name, int age, char gender, String semester, String TypeOfdegree) {
		super(name);
		this.age = age;
		this.gender = gender;
		this.semester = semester;
		this.TypeOfdegree = TypeOfdegree;
	}

	// method 1
	public String getName() {
		return super.getName();
	}

	// method 2
	public int getage() {
		return age;
	}

	// method 3
	public int getgender() {
		return gender;
	}

	// method 4
	public String getsemester() {
		return semester;
	}

	// method 5
	public String getTypeOfdegree() {
		return TypeOfdegree;
	}

	public void method1() {
		System.out.println("implementation of method1");
	}

	public void method2() {
		System.out.println("implementation of method2");
	}

	public void calculatenewGPA(int newgrade) {
		GPA = (GPA * gradeNumber + newgrade) / (gradeNumber + 1);
		gradeNumber++;
	}

	@Override
	public String toString() {
		return ("Student name: " + this.getName() + ".\n Age: " + this.getage() + ".\n gender:" + this.getgender()
				+ ".\n Semester: " + this.getsemester() + ".\n Type of degree: " + this.getTypeOfdegree());
	}
	
	public float getGPA() {
		return GPA;
	}

	public static void main(String[] args) {
		Student stu = new Student("jack", 20, 'M', "Fall", "Diploma");
		// printing way 1
		System.out.println(stu.toString());
		// printing way 2
		System.out.println(stu.getsemester());
		stu.calculatenewGPA(10);
		stu.method1();
		System.out.println(stu.getGPA());
		stu.calculatenewGPA(15);
		System.out.println(stu.getGPA());
		
		
		
		

		
	}

}
