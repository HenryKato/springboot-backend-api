package hk.springboot.backendapi.respository;

import hk.springboot.backendapi.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    //This means we have access to all Repository methods
}
