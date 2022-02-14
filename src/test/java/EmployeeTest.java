import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest {

    Employee testObject;


    @BeforeEach
    public void beforeEach(){
        testObject = new Employee("Juhee", "Kang", 38, 28000);
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
    }
}
