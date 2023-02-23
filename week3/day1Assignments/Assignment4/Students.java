/*	Assignment 4
	==============

      Class: Students
      Methods: getStudentInfo()

	Description: 
	Create multiple getStudentInfo() method by passing id argument alone, by id & name, by email & phoneNumber
*/

package week3.day1Assignments;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("Student ID: " +id);
	}

	public void getStudentInfo(int id,String name) {
		System.out.println("The ID "+id +" belongs to "+ name);
	}
	
	public void getStudentInfo(String email,long ph) {
		System.out.println("Email address: " + email);
		System.out.println("Phone Number: " + ph);
	}
	
	public static void main(String[] args) {
		Students s = new Students();
		s.getStudentInfo(2105);
		s.getStudentInfo(2337, "Tiara");
		s.getStudentInfo("tia@gmail.com", 9876543210l);
	}
}
