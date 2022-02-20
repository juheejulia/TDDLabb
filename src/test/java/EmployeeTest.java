import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest {

    Employee employee1;
    Employee employee2;


    @BeforeEach
    public void beforeEach(){
        employee1 = new Employee("Pippi", "Långstrump", 28, 30000);
        employee2 = new Employee("Alfons", "Åberg", 21,28000);
    }


    @Test
    public void testSetFirstName(){
        String myFirstName = "Bamse";
        employee1.setFirstName(myFirstName);
        assertEquals(myFirstName, employee1.getFirstName());
    }


    @Test
    public void testGetFirstName(){
        String actual = employee1.getFirstName();
        assertEquals("Pippi",actual);
    }


    @Test
    public void testSetLastName(){
        String myLastName = "Sjöberg";
        employee1.setLastName(myLastName);
        assertEquals(myLastName, employee1.getLastName());
    }


    @Test
    public void testGetLastName(){
        String actual = employee1.getLastName();
        assertEquals("Långstrump",actual);
    }

    @Test
    public void testSetAge(){
        int myAge = 30;
        employee1.setAge(myAge);
        assertEquals(myAge, employee1.getAge());
    }


    @Test
    public void testGetAge(){
        int actual = employee1.getAge();
        assertEquals(28,actual);
    }


    @Test
    public void testSetSalary(){
        int mySalary = 35000;
        employee1.setSalary(mySalary);
        assertEquals(mySalary, employee1.getSalary());
    }


    @Test
    public void testGetSalary(){
        double actual = employee1.getSalary();
        assertEquals(30000, actual);
    }


    @Test
    public void testGetID(){
        int actual = employee2.getId();
        int expected = employee1.getId()+1;
        assertEquals(expected,actual);
    }

}
