package maratons.PersonalManagementApp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;


public class PersonalManagement {
	
	public static void main(String[] args) {
		PersonalManagement pm = new PersonalManagement();
		pm.processMenu(1);
		pm.processMenu(2);
	}
	
	private List<Employee> employeeList;
	private List<Employee> updatedEmployeeList;


	public PersonalManagement() {
		this.employeeList = new ArrayList<>();		
		this.updatedEmployeeList = new ArrayList<>();
	}

	
	public void addEmployee(){
		
		Employee e1 = new FullTimeEmployee(new Name("Ali", "Veli"),LocalDate.of(2017, 8, 23), LocalDate.MAX, 15250);
		employeeList.add(e1);
		Employee e2 = new FullTimeEmployee(new Name("Ahmet", "Aksoy"),LocalDate.of(2009, 4, 15), LocalDate.of(2019, 5, 1), 3900);
		employeeList.add(e2);
		Employee e3 = new FullTimeEmployee(new Name("Hasan", "Basri"),LocalDate.of(2021, 12, 13), LocalDate.MAX, 11750);
		employeeList.add(e3);
		Employee e4 = new HourlyWageEmployee(new Name("Ulviye", "Dag"),LocalDate.of(1976, 9, 25), LocalDate.of(1999, 1, 1), 6);
		employeeList.add(e4);
		Employee e5 = new HourlyWageEmployee(new Name("Muruvvet", "Altindal"),LocalDate.of(1982, 9, 25), LocalDate.of(2020, 1, 1), 17);
		employeeList.add(e5);
		Employee e6 = new HourlyWageEmployee(new Name("Hasan", "Tahsin"),LocalDate.of(2012, 5, 10), LocalDate.MAX, 26);
		employeeList.add(e6);
		Employee e7 = new FullTimeEmployee(new Name("Aydin", "Orhan"),LocalDate.of(2021, 12, 1), LocalDate.MAX, 16500);
		employeeList.add(e7);
		
	}
	
	
	public HashMap<Integer, String> initMenu() {
		HashMap<Integer, String> menu = new HashMap<Integer, String>();
		
		menu.put(1, "CREATE PERSONAL LISTS");
		menu.put(2, "LIST PERSONALS BY PERSONAL NUMBER");
		menu.put(3, "LIST PERSONALS BY NAME");
		menu.put(4, "LIST PERSONALS BY STARTING JOB DATE");
		menu.put(5, "LIST MONTHLY PAYMENTS");
		menu.put(6, "EXIT");
		return menu;
	}
	
	public void processMenu(int selection) {
				
		switch (selection) {
			case 1:
				this.addEmployee();
				break;
			case 2:
				this.sortByPersonalNumber();
				break;
			case 3:
				this.sortByName();
				break;
			case 4:
				this.sortByStartingJobDate();
				break;
			case 5:
				 this.createUpdatedEmployeeList();
				 this.listUpdatedEmployess();
				 //this.listMonthlyPaymentsbyId();
				;
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + selection);
		}
		
	}

	private void sortByPersonalNumber() {
		for (Employee employee : employeeList) {
			System.out.println(employee);
			}		
	}


	private void createUpdatedEmployeeList() {
		for (Employee employee : employeeList) {
			if (employee.getEndDate().isAfter(LocalDate.now())) {
				updatedEmployeeList.add(employee);
			}			
		}		
	}
	
		
	private void listUpdatedEmployess() {
		for (Employee updatedEmployee : updatedEmployeeList) {
			System.out.println(updatedEmployee);
		}
	}
	
	private void sortByName() {
		Collections.sort(employeeList, EmployeeByFirstName.BY_FIRST_NAME);
		for (Employee employee : employeeList) {
			System.out.println(employee);
			}
		}
	
	private void sortByStartingJobDate() {
		Collections.sort(employeeList, EmployeeByStartingJobDate.BY_STARTINGJOB_DATE);
		for (Employee employee : employeeList) {
			System.out.println(employee);
			}		
	}


}
