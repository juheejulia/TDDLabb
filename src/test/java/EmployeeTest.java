import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest {

    Employee testObject;

    @BeforeEach
    public void beforeEach() {
        testObject = new Employee();
    }

    @Test
    public void testGetName(){
        String actual = testObject.getFirstName();
        assertEquals("Juhee",actual);
    }
}
