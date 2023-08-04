package spring.security.jwt.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.security.jwt.entity.Employee;
import spring.security.jwt.entity.EmployeeRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(Integer id) {
        List<Employee> employees=findAll();
        int n=employees.size();
        if (id<=0||id>n) {
            throw new RuntimeException("Please enter a Valid Id");
        }
        Optional<Employee> result=employeeRepository.findById(id);
        return result.orElse(null);
    }
}
