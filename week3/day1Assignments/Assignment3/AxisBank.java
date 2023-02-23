/*	 Assignment3
	 ============
    	Class     :BankInfo
    	Methods :saving(),fixed(),deposit()

     	Class     :AxisBank
     	Methods :deposit()

	Description:
	You have to override the method deposit in AxisBank.
*/


package week3.day1Assignments;

public class AxisBank extends BankInfo {
	
	public void deposit() {
		
		System.out.println("The minimum amount to be deposited in Savings Account should not exceed Rs.50,000 per day.");
		
	}


	public static void main(String[] args) {
		AxisBank axb = new AxisBank();
		axb.deposit();
	}
}
