import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest {

    Employee testObject;
    Employee testObject2;


    @BeforeEach
    public void beforeEach(){
        testObject = new Employee("Juhee", "Kang", 38, 28000);
        testObject2 = new Employee("d", "s", 2,1);
    }

    @Test
    public void testGetFirstName(){
        String actual = testObject.getFirstName();
        assertEquals("Juhee",actual);
    }

    @Test
    public void testGetLastName(){
        String actual = testObject.getLastName();
        assertEquals("Kang",actual);
    }

    @Test
    public void testGetAge(){
        int actual = testObject.getAge();
        assertEquals(38,actual);
    }

    @Test
    public void testGetSalary(){
        double actual = testObject.getSalary();
        assertEquals(28000, actual);
    }

    @Test
    public void testGetID(){
        int actual = testObject.getId();
        assertEquals(1,actual);
    }

    @Test
    public void testIDIncrement(){
        int actual = testObject2.getId();
        assertEquals(2, actual);
        assertNotEquals(testObject.getId(),testObject2.getId());
    }
}
