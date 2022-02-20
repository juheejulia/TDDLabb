import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class EmployeeSystemTest {

    EmployeeSystem employeeSystem;


    @BeforeEach
    public void beforeEach(){
        employeeSystem = new EmployeeSystem();
    }


    @Test
    public void testAddAnEmployee(){
        Employee newEmployee = new Employee("Bob","Tester", 33, 40000);
        employeeSystem.addEmployee(newEmployee);
        ArrayList<Employee> employeesFromSystem = employeeSystem.getListOfEmployees();
        assertEquals("Bob", employeesFromSystem.get(0).getFirstName());
        assertEquals("Tester", employeesFromSystem.get(0).getLastName());
        assertEquals(33, employeesFromSystem.get(0).getAge());
        assertEquals(40000.00, employeesFromSystem.get(0).getSalary());
    }


    @Test
    public void testRemoveAnEmployee(){
        Employee newEmployee1 = new Employee("Bob","Tester", 33, 40000);
        employeeSystem.addEmployee(newEmployee1);
        Employee newEmployee2 = new Employee("Harry","Porter", 40, 50000);
        employeeSystem.addEmployee(newEmployee2);
        ArrayList<Employee> employeesFromSystem = employeeSystem.getListOfEmployees();
        employeeSystem.removeEmployee(newEmployee1);
        assertEquals("Harry",employeesFromSystem.get(0).getFirstName());
    }

    @Test
    public void testIncreaseSalaryOfAllEmployeesByPercent(){
        Employee newEmployee1 = new Employee("Bob","Tester", 33, 40000);
        employeeSystem.addEmployee(newEmployee1);
        Employee newEmployee2 = new Employee("Harry","Porter", 40, 50000);
        employeeSystem.addEmployee(newEmployee2);
        employeeSystem.increaseSalaryOfAllEmployeesByPercent(10);
        assertEquals(44000,newEmployee1.getSalary());
        assertEquals(55000,newEmployee2.getSalary());

    }
}
