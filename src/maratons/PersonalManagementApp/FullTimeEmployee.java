package maratons.PersonalManagementApp;

import java.time.LocalDate;

public class FullTimeEmployee extends Employee {
	
	private static final long serialVersionUID = -7710165050752780300L;
	
	private double netSalary;
	
		
		
	public FullTimeEmployee(Name name, LocalDate startDate, LocalDate endDate, double netSalary) {
		super(name, startDate, endDate);
		this.netSalary = netSalary;		
	}
	
	public double getNetSalary() {
		return netSalary;
	}
	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}

	public double getMonthlySalary() {
		return getNetSalary()*1.25;
	}
	
	
	
	
	
}
