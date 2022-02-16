import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
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
        assertEquals(40000, employeesFromSystem.get(0).getSalary());
        //System.out.println(newEmployee.getFirstName());
        //employeesFromSystem.forEach(value -> System.out.println(value.getSalary()));
    }


    @Test
    public void testRemoveAnEmployee(){
        Employee newEmployee1 = new Employee("Bob","Tester", 33, 40000);
        employeeSystem.addEmployee(newEmployee1);
        Employee newEmployee2 = new Employee("Harry","Porter", 40, 50000);
        employeeSystem.addEmployee(newEmployee2);
        ArrayList<Employee> employeesFromSystem = employeeSystem.getListOfEmployees();
        //employeesFromSystem.forEach(value -> System.out.println(value.getFirstName()));
        //System.out.println(" ");
        employeeSystem.removeEmployee(newEmployee1);
        assertEquals("Harry",employeesFromSystem.get(0).getFirstName());
        //employeesFromSystem.forEach(value -> System.out.println(value.getFirstName()));
    }

}
