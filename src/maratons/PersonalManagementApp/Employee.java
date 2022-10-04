package maratons.PersonalManagementApp;

import java.io.Serializable;
import java.time.LocalDate;



public abstract class Employee implements Serializable  {	
	
	private static final long serialVersionUID = -1640781645510519584L;

	protected static int numOfEmployees = 0;
	
	private String idNumber;
	private Name name;
	private LocalDate startDate;
	private LocalDate endDate;
	
		
	public Employee(Name name, LocalDate startDate, LocalDate endDate) {
		super();
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		this.setIdNumber();
		}

	public String getIdNumber() {
		return idNumber;
	}
	
	private String setIdNumber() {
		String year = String.valueOf(this.getStartDate().getYear());		
		String personalNumber = String.format("%04d", ++Employee.numOfEmployees);		
		if (Employee.numOfEmployees == 10000) {
			Employee.numOfEmployees = 0;
			personalNumber = String.format("%04d", ++Employee.numOfEmployees);
		}
		return this.idNumber = (year + "/" + personalNumber);
	}

	public Name getName() {
		return name;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}
	
	

	@Override
	public String toString() {
		return "Employee [" + getIdNumber() + " " + name.getName() + " " + name.getSurname() +"]";
	}

	public String getFirstName() {
		// TODO Auto-generated method stub
		return name.getName();
	}			
		
}





	