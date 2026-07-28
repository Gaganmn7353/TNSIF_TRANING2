package org.tnsif.acc.c2tc.oops;

//parent class
class Course
{
	String courseName="Java Programmming"; //instance var
	
	void showCourse()
	{
		System.out.println("Course :"+courseName);
	}
}
//sub class
class Student extends Course 
{
	String name="Gamana";
	
	void showStudent()
	{
		System.out.println("Student : "+name);
	}
}
public class SingleInheritanceDemo {

	public static void main(String[] args) {
		Student student=new Student();
		student.showCourse();
		student.showStudent();
		

	}

}
