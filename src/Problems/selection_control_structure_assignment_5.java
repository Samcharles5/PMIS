package Problems;
import java.util.Scanner;
public class selection_control_structure_assignment_5 {
	
	
	public static void checkAccountNo(long x) {
		if (!(x>=1000 && x<=1999)) {
			System.out.println("Invalid Account No");
		}
	}
	
	public static void checkMinBalance(int x) {
		if (x<1000) {
			System.out.print("Insufficient Balance");
		}
	}
	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Account No: ");
		long accountNo=s.nextLong();
		System.out.print("Salary: ");
		int salary=s.nextInt();
		System.out.print("Account Balance: ");
		int accountBalance=s.nextInt();
		s.nextLine();
		System.out.print("Loan Type: Car,House,Business: ");
		String loanType=s.nextLine();
		System.out.print("Lone amount Expected: ");
		int expectedLoneAmount=s.nextInt();
		System.out.print("EMIs Expected: ");
		int emis=s.nextInt();
		
		checkAccountNo(accountNo);
		checkMinBalance(accountBalance);
		
		if(salary>75000 && loanType.equals("Business") && expectedLoneAmount<=75000000 && emis<=84) {
			System.out.println("Loan Conformed");
			System.out.println("Account No: "+accountNo);
			System.out.println("Eligible lone amount: "+500000);
			System.out.println("Requested Loan amount: "+expectedLoneAmount);
			System.out.println("Eligible EMIs: "+36);
			System.out.println("Requested EMIs: "+emis);
		}else if(salary>50000 && loanType.equals("House") && expectedLoneAmount<=6000000 && emis<=60) {
			System.out.println("Loan Conformed");
			System.out.println("Account No: "+accountNo);
			System.out.println("Eligible lone amount: "+500000);
			System.out.println("Requested Loan amount: "+expectedLoneAmount);
			System.out.println("Eligible EMIs: "+36);
			System.out.println("Requested EMIs: "+emis);
		}else if(salary>25000 && loanType.equals("Car") && expectedLoneAmount<=500000 && emis<=36) {
			System.out.println("Loan Conformed");
			System.out.println("Account No: "+accountNo);
			System.out.println("Eligible lone amount: "+500000);
			System.out.println("Requested Loan amount: "+expectedLoneAmount);
			System.out.println("Eligible EMIs: "+36);
			System.out.println("Requested EMIs: "+emis);
		}else {
			System.out.println("Error");
		}
		

	}

}
