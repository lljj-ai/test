package nuc.edu.cn.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import nuc.edu.cn.pojo.Department;
import nuc.edu.cn.pojo.Employee;
@Mapper
public interface EmployeeMapper {
    public List<Employee> findEmployeeByDepartment(String deptName);
    public List<Employee> findEmployeeBySalary(int Salary);
    public List<Department> findDepartment(String name);
    //@Select("select * from employee where id=#{id}")
   	public Employee findEmployeeById(int id);
   	//@Insert("insert into employee(sex,name) values(#{sex},#{name})")
   	public int insertEmployee(Employee employee);
   	//@Delete("delete from employee where id=#{id}")
   	public int deleteEmployee(int id);
   	//@Update("update employee set name=#{name} where sex=#{sex}")
   	public int updateEmployee(Employee employee);
}
