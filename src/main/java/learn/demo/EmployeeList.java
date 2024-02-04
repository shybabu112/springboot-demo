package learn.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EmployeeList {

    List<EmployeeModel> employeeList = new ArrayList<>();

    public EmployeeModel addEmp( EmployeeModel emp) {
        employeeList.add(emp);
        return emp;
    }

    public List<EmployeeModel> getEmployeeList() {
        return employeeList;
    }
}
