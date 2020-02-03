import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {


       DatabaseAdmin databaseAdmin;

        @Before
        public void before() {
            databaseAdmin = new DatabaseAdmin("Bob", "17U58177", 9500.00);
        }

        @Test
        public void hasName(){
            assertEquals("Bob", databaseAdmin.getName());
        }

        @Test
        public void hasNiNumber(){
            assertEquals("17U58177", databaseAdmin.getNiNumber());
        }

        @Test
        public void hasSalary(){
            assertEquals(9500.00, databaseAdmin.getSalary(), 0.01);
        }

        @Test
        public void canRaiseSalary(){
            databaseAdmin.raiseSalary(1);
            assertEquals(9595.00, databaseAdmin.getSalary(), 0.01);
        }
    }
