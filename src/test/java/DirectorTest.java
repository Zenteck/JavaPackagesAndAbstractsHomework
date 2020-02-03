import org.junit.Before;
import org.junit.Test;
import staff.management.Director;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("Gene", "R0CK1NG", 21000.00, "Flight-Ops", 320000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Gene", director.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("R0CK1NG", director.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(21000.00, director.getSalary(), 0.01);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Flight-Ops", director.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(1);
        assertEquals(21210.00, director.getSalary(), 0.01);
    }

    @Test
    public void canGetBudget(){
        assertEquals(320000.00, director.getBudget(), 0.01);
    }

    @Test
    public void cannotRaiseSalaryNegative(){
        director.raiseSalary(-10);
        assertEquals(21000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canChangeName(){
        director.setName("Val");
        assertEquals("Val", director.getName());
    }

    @Test
    public void cannotSetNullName(){
        director.setName(null);
        assertEquals("Gene", director.getName());
    }



}
