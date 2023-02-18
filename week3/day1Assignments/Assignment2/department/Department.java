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


package org.department;

import org.college.College;

public class Department extends College {

	public void deptName() {
		System.out.println("Department: Medicine");

	}
	
	public static void main(String[] args) {
		 Department dep = new Department();
		 dep.deptName();
		 dep.collegeName();
		 dep.collegeCode();
		 dep.collegeRank();	
	}
	
}
