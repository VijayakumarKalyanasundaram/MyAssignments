package week3.day1;

import org.department.Department;

public class Students extends Department {
	public void getStudentInfo() {
		System.out.println("Student1");
	}
	
	public String getStudentInfo(String name) {
		System.out.println("Student2");
		return name;
	}
	
	public String getStudentInfo(String student1, String student2) {
		System.out.println("student1 is: "+student1+ " "+"Student2 is: "+student2);
		return student1+student2;
	}

	public static void main(String[] args) {
		Students st=new Students();
		st.deptName();
		String studentInfo = st.getStudentInfo("Vijay", "Kumar");
		System.out.println("studentInfo are : "+studentInfo);
		String studentInfo1 = st.getStudentInfo("VijayK");
		System.out.println("StudentInfo1 is :"+studentInfo1);
	}
}
