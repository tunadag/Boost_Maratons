package maratons.PersonalManagementApp;

import java.util.Comparator;


public class EmployeeByFirstName implements Comparator<Employee> {
	public static final EmployeeByFirstName BY_FIRST_NAME = new EmployeeByFirstName();

	@Override
	public int compare(Employee first, Employee second) {
		if (first.getFirstName().equals(second.getFirstName())) {
			return first.getIdNumber().compareTo(second.getIdNumber());
			}
		else {
			return first.getFirstName().compareTo(second.getFirstName());
			}
		}
}
