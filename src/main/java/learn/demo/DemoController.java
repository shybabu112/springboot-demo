package learn.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoController {
    @Value("${api.message:Hello exception}")
    private String message;
    @GetMapping("/hello")
    public String Hello() {
        return message;
    }

    @Autowired
    EmployeeList employeeList;

    @Autowired
    UserRepository repository;
    @PostMapping("/add")
    public EmployeeModel addEmp( @RequestBody EmployeeModel emp) {
        repository.save(emp);
        return emp;
    }

    @GetMapping("/get")
    public List<EmployeeModel> getEmployee() {
        return repository.findAll();
    }

}
