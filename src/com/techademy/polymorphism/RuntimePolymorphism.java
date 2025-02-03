package com.techademy.polymorphism;

class Student {
		int rollno;
		String name;
		String dept;
		public Student( ){
			rollno = 5;
			name = "Apple";
			dept = "IoT";
		}
		public Student(int rollno, String name, String dept){ 
			this.rollno = rollno;
			this.name = name; 
			this.dept = dept;
	}
	public void studentDetails( ){ 
		System.out.println("Student Roll no:"+rollno); 
		System.out.println("Student Name:"+name); 
		System.out.println("Student Department:"+dept);
}
}


public class RuntimePolymorphism {
	public static void main(String[] arg) {
		Student st1 = new Student( ); 
		st1.studentDetails();

		Student st2 = new Student(10,"Mango","CSE"); 
		st2.studentDetails();
	}

}
