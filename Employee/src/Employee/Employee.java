package Employee;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Employee {
	private String name;
	private double salary;
	private int workHours;
	private int hireYear;
	private String employeeInfo;
	
	Employee(String name,double salary,int workHours,int hireYear){
		this.name=name;
		this.salary=salary;
		this.workHours=workHours;
		this.hireYear=hireYear;//
		employeeInfo="Name: "+name+"\nSalary: "+salary+"\nWork Hours: "+workHours+
				"\nHire Year : "+hireYear;
		raiseSalary();
	}
	private double tax() {
		double tax=0;
		if(salary>1000) {
			tax=salary*0.03;
		}
		
		
		employeeInfo+="\nTax :"+tax;
		return tax;

	}
	private double bonus() {
		
		double bonus=0;
		if(workHours>40) {
			bonus=(workHours-40)*30;
			
			
		}
		employeeInfo+="\nBonus :"+bonus;
		return bonus;
	}
	private void raiseSalary() {
		double tax=tax();
		double bonus=bonus();
		double totalSalary;
		double salaryWithTaxAndBonus=this.salary-tax+bonus;
		//this.salary=salaryWithTaxAndBonus;
		int year=2021-hireYear;
		double raiseSalary;
		if(year<10) {
			raiseSalary=salary*0.05;
			
		}
		else if(year>9 &&year<20) {
			raiseSalary=salary*0.1;
			
		}
		else {
			raiseSalary=salary*0.15;
		}
		salary+=raiseSalary;
		totalSalary=salary;
		employeeInfo+="\nRaise Salary: "+raiseSalary + "\nSalary With Tax And Bonus: "+salaryWithTaxAndBonus
				+"\nTotal Salary: "+totalSalary;
		
		
	}

	@Override
	public String  toString() {
		
		return employeeInfo;
	}

}

