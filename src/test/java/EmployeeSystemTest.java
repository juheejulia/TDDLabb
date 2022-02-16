import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmployeeSystemTest {

    EmployeeSystem employeeSystem;

    @BeforeEach
    public void beforeEach(){
        employeeSystem = new EmployeeSystem();
    }

    @Test
    public void testItWillAddAnEmployee(){
        Employee newEmployee = new Employee("Bob","Tester", 33, 40000);
        employeeSystem.addEmployee(newEmployee);
        Employee employeeFromSystem = employeeSystem.findEmployee(newEmployee.getId());
        assertEquals("Bob", employeeFromSystem.getFirstName());
    }


//findEmployee(by Id)

//addEmployee(all obligatorisk info)
//removeEmployee

//changeAge
//changeFirstName
//changeLastName
//increaseSalary


}
