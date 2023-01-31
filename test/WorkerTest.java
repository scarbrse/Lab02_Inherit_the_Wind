import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {

    Worker w1, w2, w3;

    @BeforeEach
    void setUp() {

        w1 = new Worker("00000A", "Bob", "Tester1", "Mr.", 1955, 12.50);
        w2 = new Worker("00000A", "Sally", "Tester2", "Mrs.", 1975, 11.75);
        w3 = new Worker("00000A", "John", "Tester3", "Esq.", 1960, 21.50);

    }

    @Test
    void calculateWeeklyPay() {
        assertEquals(125.0, w1.calculateWeeklyPay(10.0));
    }

    @Test
    void displayWeeklyPay() {
        assertEquals("500.00", w1.displayWeeklyPay(40));
    }
}