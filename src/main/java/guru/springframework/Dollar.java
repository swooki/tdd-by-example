package guru.springframework;

import java.util.Objects;

/**
 * Created by jt on 2018-10-04.
 */
public class Dollar {

    int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times( int multiplier) {
        return new Dollar (amount * multiplier);
    }

    @Override
    public boolean equals (Object o) {
        Dollar dollar = (Dollar) o;
        return amount == dollar.amount;
    }
}
