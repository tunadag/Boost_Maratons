package maratons.PersonalManagementApp;

import java.time.LocalDate;

public class HourlyWageEmployee extends Employee {
	
	private static final long serialVersionUID = -3248668162212500295L;
	private double hourlyRate; 
	private int monthlyWorkingHours;
		

	public HourlyWageEmployee(Name name, LocalDate startDate, LocalDate endDate, double hourlyRate) {
		super(name, startDate, endDate);
		this.hourlyRate = hourlyRate;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public int getMonthlyWorkingHours() {
		return monthlyWorkingHours;
	}

	public void setMonthlyWorkingHours(int monthlyWorkingHours) {
		this.monthlyWorkingHours = monthlyWorkingHours;
	}
	
	public double getMonthlySalary() {
		return getHourlyRate()*getMonthlyWorkingHours()*1.08;
	}	

}
