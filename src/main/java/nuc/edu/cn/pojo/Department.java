package nuc.edu.cn.pojo;

import java.util.List;

public class Department {
    private int deptId;
    private String deptName;
    private List<Employee> emplyees;
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public List<Employee> getEmplyees() {
		return emplyees;
	}
	public void setEmplyees(List<Employee> emplyees) {
		this.emplyees = emplyees;
	} 
}
