/*
Home Assignment 2: Print if the given number is prime

Goal: To understand the problem solving, looping and conditional statement

a) Create a class by name: IsPrime
b) Create a main method using shortcut
c) Write a logic to find if the given number is prime or not
d) Print if it is prime or not

Hint: Iterate through all numbers from 2 to n-1 (input) and 
for every number check if it divides n (input). 
If we find any number that divides, print prime.
*/


package week1.day2Assignments;

public class IsPrime {
	public static void main(String[] args) {
		int n = 17;
		boolean flag = false;
		for (int i=2; i<=(n-1); i++) {
			if((n%i)==0) {
				flag = true;				
			}
		}
			if (flag==false) {
				System.out.println(n + " is a Prime number");
			}
			else {
				System.out.println(n + " is Not a Prime number");
			}
		
	}

}
