package maratons.PersonalManagementApp;

import java.util.Comparator;

public class EmployeeById implements Comparator<Employee>{
	
	public static final EmployeeById BY_ID = new EmployeeById();

	@Override
	public int compare(Employee first, Employee second) {
		return first.getIdNumber().compareTo(second.getIdNumber());
	}
	

}
