package nuc.edu.cn.pojo;

import java.util.List;

public class Salary {
    private int employeeId;
    private int salary;
    private List<Employee> employeess;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public List<Employee> getEmployeess() {
		return employeess;
	}
	public void setEmployeess(List<Employee> employeess) {
		this.employeess = employeess;
	}
       
}
