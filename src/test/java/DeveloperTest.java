import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

   Developer developer;

    @Before
    public void before() {
        developer = new Developer("Bill", "8085UCK5", 11000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Bill", developer.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("8085UCK5", developer.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(11000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(1);
        assertEquals(11110.00, developer.getSalary(), 0.01);
    }
}
