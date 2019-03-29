package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * Created by jt on 2018-10-04.
 */
public class MoneyTest {

    @Test
    void testMultiplication() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2 );
        assertEquals (10, product.amount);

        product = five.times(3);
        assertEquals(15, product.amount);
    }

    @Test
    void testEquality () {
        assertEquals(new Dollar(5), new Dollar(5));
        assertNotEquals (new Dollar(5), new Dollar(8));
    }
}
