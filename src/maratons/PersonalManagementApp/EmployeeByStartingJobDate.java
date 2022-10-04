package maratons.PersonalManagementApp;

import java.util.Comparator;

public class EmployeeByStartingJobDate implements Comparator<Employee> {
	
	public static final EmployeeByStartingJobDate BY_STARTINGJOB_DATE = new EmployeeByStartingJobDate();

	@Override
	public int compare(Employee first, Employee second) {
		if ((first.getStartDate().getYear() == second.getStartDate().getYear()) && (first.getStartDate().getMonthValue() == second.getStartDate().getMonthValue())) {
			return first.getFirstName().compareTo(second.getFirstName());
		}
		else {
			return first.getStartDate().compareTo(second.getStartDate());	
		}
	}			
}
