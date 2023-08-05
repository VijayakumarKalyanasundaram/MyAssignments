package org.student;

import org.department.Department;

public class Student extends Department{

	public void studentName() {
		System.out.println("Student name is Vijayakumar");
	}
	public void studentDept() {
		System.out.println("Mechanicla Dept");
	}
	public void studentId() {
		System.out.println("Student Id is 07ME54");
	}
	
	public static void main(String[] args) {
		
		Student st=new Student();
		st.collegeName();
		st.collegeCode();
		st.collegeRank();
		st.studentId();
		st.studentName();
		st.studentDept();
		st.deptName();
		
	}
}
