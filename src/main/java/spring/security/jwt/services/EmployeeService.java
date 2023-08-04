package spring.security.jwt.services;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.security.jwt.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> findAll();
    public Employee findById(Integer id);
}
