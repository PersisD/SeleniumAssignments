/*
Home Assignment 1: Print Fibonacci series for first 11 numbers

0  1  1  2  3  5  8  13  21  34  55  89  144

Goal: To understand the arithmetic operation and loop

a) Create a class by name: Fibonacci
b) Create a main method using shortcut
c) Write a logic to print fibonacci from 0 to 56

Hints: 

Initialize 3 int variables (Tip: firstNum = 0, secNum = 1, sum = 0)
Print first number
Iterate from 1 to the 11
Add first and second number assign to sum
Assign second number to the first number
Assign sum to the second number
Print sum
 */

package week1.day2Assignments;

public class Fibonacci {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 1;
		
		System.out.println(num1);
		System.out.println(num2);
		
		for (int i=1; i<=11; i++) {
			
			int sum = num1+num2;
			num1=num2;
			num2=sum;
			System.out.println(sum);
		}
	}

}
