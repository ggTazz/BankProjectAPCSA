import java.util.Scanner;

public class EmployeesDetails{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Type Employee ID Number: ");
		
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		Employee a = new Employee(number);
	}
}      

class Employee{
    
    //"OTHER" Constructor
    
    public Employee(int id){
        e_id = id;
        
        //bank tellers
        if(e_id== 637492){
        	e_position = "Bank Teller";
        	e_fname = "Mo";
        	e_lname = "Bamba";
        	e_dob = "10/14/1980";
        	e_ss = "132-50-3907";
        	e_pay = "$12 (Hourly)";
        	e_days = "Monday to Friday";
        	}
        
        else if(e_id== 815462){
        	e_position = "Bank Teller";
        	e_fname = "Jones";
        	e_lname = "Baker";
        	e_dob = "01/14/1975";
        	e_ss = "158-09-3468";
        	e_pay = "$12 (Hourly)";
        	e_days = "Monday to Friday";
        	}
        
        else if(e_id== 173459){
        	e_position = "Bank Teller";
        	e_fname = "Mary";
        	e_lname = "Susan";
        	e_dob = "06/14/1995";
        	e_ss = "120-45-7589";
        	e_pay = "$12 (Hourly)";
        	e_days = "Monday to Wednesday";
        	}
         
        else if(e_id== 357098){
        	e_position = "Bank Teller";
        	e_fname = "Faith";
        	e_lname = "Mehh";
        	e_dob = "04/24/1988";
        	e_ss = "129-45-0923";
        	e_pay = "$12 (Hourly)";
        	e_days = "Thursday to Saturday";
        	}
        
        else if(e_id== 732893){
        	e_position = "Bank Teller";
        	e_fname = "Liam";
        	e_lname = "Calos";
        	e_dob = "07/24/1986";
        	e_ss = "486-65-4821";
        	e_pay = "$12 (Hourly)";
        	e_days = "Monday to Saturday";
        	}
        
        //Managers
        else if(e_id== 940357){
        	e_position = "General Manager";
        	e_fname = "Baljeet";
        	e_lname = "Patel";
        	e_dob = "12/5/1987";
        	e_ss = "189-45-3766";
        	e_pay = "$66,000";
        	e_days = "Monday to Saturday";
        	}
        
        else if(e_id== 860945){
        	e_position = "Assisant Manager";
        	e_fname = "Lucy";
        	e_lname = "DeMaro";
        	e_dob = "04/13/1991";
        	e_ss = "456-23-1204";
        	e_pay = "$47,000";
        	e_days = "Monday to Saturday";
        	}
        
        //Loan Officers
        else if(e_id== 246786){
        	e_position = "Loan Officer";
        	e_fname = "Murphy";
        	e_lname = "Khan";
        	e_dob = "10/31/1988";
        	e_ss = "126-95-6589";
        	e_pay = "$41,000";
        	e_days = "Monday to Wednesday";
        	}
        
        else if(e_id== 289382){
        	e_position = "Loan Officer";
        	e_fname = "Daniella";
        	e_lname = "Broccoli";
        	e_dob = "03/12/1979";
        	e_ss = "546-27-4689";
        	e_pay = "$41,000";
        	e_days = "Tuesday to Friday";
        	}
        
        else if(e_id== 935715){
        	e_position = "Loan Officer";
        	e_fname = "Phineas";
        	e_lname = "Ferb";
        	e_dob = "06/26/1997";
        	e_ss = "196-45-0954";
        	e_pay = "$41,000";
        	e_days = "Thursday to Saturday";
        	}
        
        else if(e_id== 356190){
        	e_position = "Loan Officer";
        	e_fname = "Dan";
        	e_lname = "Rogers";
        	e_dob = "07/17/1995";
        	e_ss = "121-09-6379";
        	e_pay = "$41,000";
        	e_days = "Monday to Friday";
        	}
        
        //Financial Analyst
        else if(e_id== 283780){
        	e_position = "Financial Analyst";
        	e_fname = "Danny";
        	e_lname = "Fred";
        	e_dob = "01/02/1999";
        	e_ss = "393-63-3738";
        	e_pay = "$76,000";
        	e_days = "Monday to Friday";
        	}
        
        else if(e_id== 758928){
        	e_position = "Financial Analyst";
        	e_fname = "Gianna";
        	e_lname = "Morgan";
        	e_dob = "02/15/1970";
        	e_ss = "192-39-3457";
        	e_pay = "$76,000";
        	e_days = "Monday to Friday";
        	}
        
        else if(e_id== 370972){
        	e_position = "Financial Analyst";
        	e_fname = "Grace";
        	e_lname = "Tella";
        	e_dob = "07/12/1998";
        	e_ss = "237-27-9221";
        	e_pay = "$76,000";
        	e_days = "Monday to Friday";
        	}
        
        else if(e_id== 203078){
        	e_position = "Financial Analyst";
        	e_fname = "Heem";
        	e_lname = "Ali";
        	e_dob = "11/13/1989";
        	e_ss = "702-12-8995";
        	e_pay = "$76,000";
        	e_days = "Monday to Friday";
        	}
        
        else if(e_id== 378257){
        	e_position = "Financial Analyst";
        	e_fname = "Kevin";
        	e_lname = "James";
        	e_dob = "09/12/1991";
        	e_ss = "128-43-2787";
        	e_pay = "$76,000";
        	e_days = "Monday to Friday";
        	}
        
        //Security Guards
        else if(e_id== 298309){
        	e_position = "Security Guard";
        	e_fname = "Sam";
        	e_lname = "Gon";
        	e_dob = "04/22/1988";
        	e_ss = "146-25-3527";
        	e_pay = "$11 (Hourly)";
        	e_days = "Monday to Thursday";
        	}
        
        else if(e_id== 485492){
        	e_position = "Security Guard";
        	e_fname = "Alex";
        	e_lname = "morgan";
        	e_dob = "10/01/1996";
        	e_ss = "789-51-5648";
        	e_pay = "$11 (Hourly)";
        	e_days = "Wednesday to Saturday";
        	}
        
        else if(e_id== 498758){
        	e_position = "Security Guard";
        	e_fname = "Patrick";
        	e_lname = "Star";
        	e_dob = "12/04/1981";
        	e_ss = "548-45-1679";
        	e_pay = "$11 (Hourly)";
        	e_days = "Monday to Friday";
        	}
        
        else if(e_id== 926478){
        	e_position = "Security Guard";
        	e_fname = "Shaq";
        	e_lname = "O'Neil";
        	e_dob = "04/17/1987";
        	e_ss = "846-51-1841";
        	e_pay = "$11 (Hourly)";
        	e_days = "Thursday to Saturday";
        	}
        
        else if(e_id== 102680){
        	e_position = "Security Guard";
        	e_fname = "James";
        	e_lname = "Charles";
        	e_dob = "08/13/1985";
        	e_ss = "451-78-1978";
        	e_pay = "$11 (Hourly)";
        	e_days = "Monday to Friday";
        	}
        
        else if(e_id== 387478){
        	e_position = "Security Guard";
        	e_fname = "Jack";
        	e_lname = "Randy";
        	e_dob = "09/21/1995";
        	e_ss = "565-48-4569";
        	e_pay = "$11 (Hourly)";
        	e_days = "Monday to Saturday";
        	}
        
        //Accountants
        else if(e_id== 397558){
        	e_position = "Accountant";
        	e_fname = "Ronald";
        	e_lname = "Stewie";
        	e_dob = "02/12/1990";
        	e_ss = "104-33-6789";
        	e_pay = "$63,000";
        	e_days = "Monday to Wednesday";
        	}
        
        else if(e_id== 209867){
        	e_position = "Accountant";
        	e_fname = "Jason";
        	e_lname = "Lincoln";
        	e_dob = "07/24/1985";
        	e_ss = "118-34-5634";
        	e_pay = "$63,000";
        	e_days = "Monday to Friday";
        	}
        
        else if(e_id== 149020){
        	e_position = "Accountant";
        	e_fname = "Sara";
        	e_lname = "Smith";
        	e_dob = "11/14/1992";
        	e_ss = "194-17-5204";
        	e_pay = "$63,000";
        	e_days = "Monday to Saturday";
        	}
        
        else if(e_id== 189563){
        	e_position = "Accountant";
        	e_fname = "Juan";
        	e_lname = "Rodriguez";
        	e_dob = "11/30/1988";
        	e_ss = "142-48-9548";
        	e_pay = "$63,000";
        	e_days = "Monday to Friday";
        	}
        
        else if(e_id== 294936){
        	e_position = "Accountant";
        	e_fname = "Lucas";
        	e_lname = "Lillard";
        	e_dob = "01/02/1994";
        	e_ss = "123-234-5447";
        	e_pay = "$63,000";
        	e_days = "Monday to Saturday";
        	}
        
        else {
        	
        }
        
        System.out.println("ID No.: " + e_id +"\nPosition: "+ e_position +"\nFirst Name: " + e_fname +"\nLast Name: " + e_lname +"\nDate of Birth: "+ e_dob + "\nSocial Security No.: " + e_ss + "\nSalary: " + e_pay + "\nDays Working: " + e_days);
    }
    
    //Properties 
    
    private int e_id;
    private String e_position;
    private String e_fname;
    private String e_lname;
    private String e_dob;
    private String e_ss;
    private String e_pay;
    private String e_days;
    
}