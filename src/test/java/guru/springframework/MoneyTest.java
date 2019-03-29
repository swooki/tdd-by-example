package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * Created by jt on 2018-10-04.
 */
public class MoneyTest {

    @Test
    void testMultiplicationDollar() {
        Money five = Money.dollar(5);
        assertEquals(Money.dollar (10), five.times(2));
        assertEquals(Money.dollar (15), five.times(3));
    }
    @Test
    void testMultiplicationFranc() {
        Money five = Money.franc(5);
        assertEquals (Money.franc(10), five.times(2));
        assertEquals (Money.franc(15), five.times(3));
    }

    @Test
    void testEqualityDollar() {
        assertEquals(Money.dollar(5), Money.dollar (5));
        assertNotEquals (Money.dollar(5), Money.dollar (8));
        assertNotEquals(Money.dollar (5), Money.franc ( 5));
    }
    @Test
    void testEqualityFranc() {
        assertEquals(Money.franc (5), Money.franc(5));
        assertNotEquals (Money.franc(5), Money.franc(8));
    }
}
