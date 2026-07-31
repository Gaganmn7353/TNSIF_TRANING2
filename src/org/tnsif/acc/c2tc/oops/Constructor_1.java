package org.tnsif.acc.c2tc.oops;
class Student4
{
	String name;
	int age;
	
	Student4()
	{
		System.out.println("Default constructor");
	}
	Student4(String name)
	{
		this.name=name;
		System.out.println("Name "+name);
	}
	Student4(String name,int age)
	{
		this.name=name;
		this.age=age;
		System.out.println("Name "+ name +"Age "+age);	 
	}	
}
public class Constructor_1 {

	public static void main(String[] args) {
		Student4 st1=new Student4();
		Student4 st2=new Student4("Gagan");
		Student4 st3= new Student4("Nithin",21);

	}

}