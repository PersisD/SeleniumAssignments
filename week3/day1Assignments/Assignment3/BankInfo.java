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

public class BankInfo {
	public void saving() {
		int i = 350000;
		System.out.println("Saving Amount: " +i);
	}

	public void fixed() {
		System.out.println("Fixed deposit has 8% rate of Interest");
	}
	
	public void deposit() {
		System.out.println("Cash deposits in a Savings Account cannot exceed 10 Lakhs in a financial year.");

	}
}
