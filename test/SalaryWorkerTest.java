import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryWorkerTest {

    SalaryWorker sw1, sw2;

    @BeforeEach
    void setUp() {

        sw1 = new SalaryWorker("00000A", "Bob", "Tester1", "Mr.", 1955, 12.50, 26000);
        sw2 = new SalaryWorker("00000A", "Sally", "Tester2", "Mrs.", 1975, 11.75, 24440.0);

    }

    @Test
    void calculateWeeklyPay() {
        assertEquals(470.0, sw2.calculateWeeklyPay(40));
    }

    @Test
    void displayWeeklyPay() {
        assertEquals("500.00", sw1.displayWeeklyPay(50));
    }
}