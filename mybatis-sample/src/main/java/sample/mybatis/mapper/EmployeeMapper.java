package sample.mybatis.mapper;

import java.util.List;

import sample.mybatis.domain.Employee;

public interface EmployeeMapper {

	// 根据id查询Employee
	Employee selectEmployeeById(Integer id);

	// 查询所有Employee
	List<Employee> selectAllEmployee();

	// 根据id删除Employee
	void deleteEmployeeById(Integer id);
}
