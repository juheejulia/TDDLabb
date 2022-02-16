import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest {

    Employee testObject;
    Employee testObject2;


    @BeforeEach
    public void beforeEach(){
        testObject = new Employee("Pippi", "Långstrump", 28, 30000);
        testObject2 = new Employee("Alfons", "Åberg", 21,28000);
    }


    @Test
    public void testSetFirstName(){
        String myFirstName = "Bamse";
        testObject.setFirstName(myFirstName);
        assertEquals(myFirstName, testObject.getFirstName());
    }


    @Test
    public void testGetFirstName(){
        String actual = testObject.getFirstName();
        assertEquals("Pippi",actual);
    }


    @Test
    public void testSetLastName(){
        String myLastName = "Sjöberg";
        testObject.setLastName(myLastName);
        assertEquals(myLastName, testObject.getLastName());
    }


    @Test
    public void testGetLastName(){
        String actual = testObject.getLastName();
        assertEquals("Långstrump",actual);
    }

    @Test
    public void testGetAge(){
        int actual = testObject.getAge();
        assertEquals(28,actual);
    }

    @Test
    public void testGetSalary(){
        double actual = testObject.getSalary();
        assertEquals(30000, actual);
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
