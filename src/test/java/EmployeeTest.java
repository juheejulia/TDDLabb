import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest {

    Employee testObject;


    @Test
    public void testGetFirstName(){
        testObject = new Employee("Juhee");
        String actual = testObject.getFirstName();
        assertEquals("Juhee",actual);
    }

    @Test
    public void testGetLastName(){
        testObject = new Employee("Kang");
        String actual = testObject.getLastName();
    }
}
