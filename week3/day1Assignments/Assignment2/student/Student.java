/*	Assignment 2
	============
     Package   :org.college
     Class     :College
     Methods   :collegeName(),collegeCode(),collegeRank()

     Package   :org.department
     Class     :Department
     Methods   :deptName()
 
     Package   :org.student
     Class     :Student
     Methods   :studentName(),studentDept(),studentId()
  
Description:
create above 3 class and call all your class methods into the Student using multilevel inheritance.
*/

package org.student;

import org.department.Department;

public class Student extends Department {

	public void studentName() {
		System.out.println("Name of the Student: Ziannah");
	}
	
	public void studentDept() {
		System.out.println("Paediatrics");
	}
	
	public void studentId() {
		System.out.println("Student ID: PD2337");

	}
	
	public static void main(String[] args) {
		Student s = new Student();
		s.studentName();
		s.studentDept();
		s.studentId();
		s.deptName();
		s.collegeName();
		s.collegeCode();
		s.collegeRank();
	}
}
