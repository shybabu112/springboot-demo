package learn.demo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

@Service
public interface UserRepository extends MongoRepository<EmployeeModel, Integer> {

}
