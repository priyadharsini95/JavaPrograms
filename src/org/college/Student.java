package org.college;
//child
public class Student extends College{

	public void studentName() {
		System.out.println("Yash");

	}

	public void studentDept() {
		System.out.println("CSE");

	}

	public void studentId() {
		System.out.println("8908");

	}
	
	public static void main(String[] args) {
		Student stdObj = new Student();
		stdObj.studentName();
		stdObj.studentId();
		stdObj.studentDept();
		stdObj.collegeName();
		stdObj.collegeCode();
		stdObj.collegeRank();
		stdObj.HostelName();
		stdObj.deptName();
	}
}
