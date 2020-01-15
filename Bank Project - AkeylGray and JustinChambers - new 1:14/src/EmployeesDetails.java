import java.io.*;
import java.util.*;

public class EmployeesDetails{
	
	private String empID ;
	private String empFName ;
	private String empLName ;
	private String DOB ;
	private String SSN ;
	private String Salary ;
	private String Position ;
	private String Days ;
	
	
	public String getEmpID() {
		return empID;
	}

	public void setEmpID(String empID) {
		this.empID = empID;
	}

	public String getEmpFName() {
		return empFName;
	}

	public void setEmpFName(String empFName) {
		this.empFName = empFName;
	}

	public String getEmpLName() {
		return empLName;
	}

	public void setEmpLName(String empLName) {
		this.empLName = empLName;
	}
	
	public String getDOB() {
		return DOB;
	}

	public void setDOB(String DOB) {
		this.DOB = DOB;
	}
	
	public String getSSN() {
		return SSN;
	}

	public void setSSN(String SSN) {
		this.SSN = SSN;
	}
	
	public String getSalary() {
		return Salary;
	}

	public void setSalary(String Salary) {
		this.Salary = Salary;
	}
	
	public String getPosition() {
		return Position;
	}

	public void setPosition(String Position) {
		this.Position = Position;
	}
	
	public String getDays() {
		return Days;
	}

	public void setDays(String Days) {
		this.Days = Days;
	}

	
	public EmployeesDetails() {
	}

	public static void launcher() {
		try {
			ArrayList<EmployeesDetails> empList = new ArrayList<EmployeesDetails>() ;
		    File file = new File ( "G:\\Bank Project - AkeylGray and JustinChambers/EmployeesData.txt") ;
		    int rV = 0;
		    Scanner in = new Scanner(System.in);
		    while (rV == 0) {
		    System.out.print("Please Enter Employee ID:");
			String id = in.nextLine();
			
		    if (id.equalsIgnoreCase("ID List")) {
		    	System.out.println("637492");
		    	System.out.println("173459");
		    	System.out.println("815462");
		    	System.out.println("357098");
		    	System.out.println("732893");
		    	System.out.println("940357");
		    	System.out.println("860945");
		    	System.out.println("246786");
		    	System.out.println("289382");
		    	System.out.println("935715");
		    	System.out.println("356190");
		    	System.out.println("283780");
		    	System.out.println("758928");
		    	System.out.println("370972");
		    	System.out.println("203078");
		    	System.out.println("378257");
		    	System.out.println("298309");
		    	System.out.println("485492");
		    	System.out.println("498758");
		    	System.out.println("926478");
		    	System.out.println("102680");
		    	System.out.println("387478");
		    	System.out.println("397558");
		    	System.out.println("209867");
		    	System.out.println("149020");
		    	System.out.println("189563");
		    	System.out.println("294936");
		    }
		    	
		    if ( file.exists() )
		    {  
		    	Scanner inFile = new Scanner( file );
		    	inFile.useDelimiter("[;]");
		        while ( inFile.hasNext() )
		        {
		        	String line = inFile.next() ;
		            line = line.trim().replaceAll("\n", "");
		            line = line.trim().replaceAll("\t", "");
//		            line = line.trim().replaceAll(" ", "");
		            if ( line.length() > 0 ) {
		            	String delims = "[,]+";
		            	String[] tokens = line.split(delims);
		            	EmployeesDetails emp = new EmployeesDetails() ;
		            	emp.setEmpID(tokens[0]);		            	
		            	emp.setEmpFName(tokens[1]);
		            	emp.setEmpLName(tokens[2]);
		            	emp.setDOB(tokens[3]);
		            	emp.setSSN(tokens[4]);
		            	emp.setSalary(tokens[5]);
		            	emp.setPosition(tokens[6]);
		            	emp.setDays(tokens[7]);
		            	
		            	empList.add(emp) ;
		            }
		        }

		        inFile.close(); 
		        rV = 1;
		    }
			else {
				System.out.println( "File Not Found");
			}
		    for (EmployeesDetails employee : empList){
		    	
		    	if(employee.getEmpID().equals(id)) {
					System.out.println( "ID No. : " + employee.getEmpID());
					System.out.println( "First Name :" + employee.getEmpFName());
					System.out.println( "Last Name :" + employee.getEmpLName());
					System.out.println( "Date of Birth :" + employee.getDOB());
					System.out.println( "Social Security Number :" + employee.getSSN());
					System.out.println( "Salary :" + employee.getSalary());
					System.out.println( "Position :" + employee.getPosition());
					System.out.println( "Days Working :" + employee.getDays());
		    	}
			}
		}
		}
		catch ( FileNotFoundException e) {
			System.out.println( "File Not Found Exception");
		}
	
	}

}
	