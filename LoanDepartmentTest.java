import java.util.Scanner; 

public class LoanDepartmentTest {

	public static void main(String[] args) {
		Scanner Loan = new Scanner(System.in);

		
		String awd;
		
		do {
			
			System.out.println("What loan would you like today? \n(1) Mortgage Loan\n(2) Car Loan\n(3) Student Loan\n(4) Personal Loan");
			String Shivam = Loan.next();
			
		if (Shivam.equals("1")) {
			LoanDepartmentBank.MortLoan();
		}
		
		else if (Shivam.equals("2")) {
			LoanDepartmentBank.CarLoan();
			
		}
		else if (Shivam.equals("3")) {
			LoanDepartmentBank.StudLoan();
			
		}
		else if (Shivam.equals("4")) {
			LoanDepartmentBank.myPerLoan();
		}
		else {}
		
		System.out.print("Return? Y or N\n");
		awd = Loan.next();
		
		
		
		} while (awd.equalsIgnoreCase("Y"));
	}
	
	
	
	




}
