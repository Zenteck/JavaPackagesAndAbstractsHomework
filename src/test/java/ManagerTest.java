import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Jeb", "BA7700N", 8000.00, "Piloting");
    }

    @Test
    public void hasName(){
        assertEquals("Jeb", manager.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("BA7700N", manager.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(8000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus(){
        assertEquals(80.00, manager.payBonus(), 0.01);

    }

    @Test
    public void hasDeptName(){
        assertEquals("Piloting", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(1);
        assertEquals(8080.00, manager.getSalary(), 0.01);
    }






}
