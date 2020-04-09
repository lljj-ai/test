package nuc.edu.cn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import nuc.edu.cn.mapper.EmployeeMapper;
import nuc.edu.cn.pojo.Department;
import nuc.edu.cn.pojo.Employee;
@RestController
public class EmployeeController { 
    @Autowired 
	EmployeeMapper employeeMapper;
    @GetMapping("findEmployeeDeByDepartment")
    public List<Employee> findEmployeeByDepartment(@RequestParam("deptName") String deptName){
    	return employeeMapper.findEmployeeByDepartment(deptName);
    }
    @GetMapping("findEmployeeSaBySalary")
    public List<Employee> findEmployeeBySalary(@RequestParam("salary") int salary){
    	return employeeMapper.findEmployeeBySalary(salary);
    }
    @GetMapping("findDepartMent")
    public List<Department> findDepartment(@RequestParam("name") String name) {
    	return employeeMapper.findDepartment(name);
    }
    
    @GetMapping("findEmployeeById")
    public Employee findEmployeeById(@RequestParam("id") int id)
    {
    	return employeeMapper.findEmployeeById(id);
    }
    @GetMapping("insertEmployee")
    public Employee insertEmployee( Employee employee) {
    	   employeeMapper.insertEmployee(employee);
    	   return employee;
    }
    @GetMapping("deleteEmployee")
    public String deleteEmployee(@RequestParam("id") int id) {
    	employeeMapper.deleteEmployee(id);
    	return  "Success";
    }
    @GetMapping("updateEmployee")
    public Employee updateEmployee(Employee employee){
    	employeeMapper.updateEmployee(employee);
    	return employee;
    }
    
}
