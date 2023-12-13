import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        // given
        double cashValue = 200;
        var rewVal = new RewardValue(cashValue);
        int expected = 57142;
        // when
        int actual = rewVal.getMilesValue();;
        // then
        assertEquals(expected, actual);
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 57000;
        var rewVal = new RewardValue(milesValue);
        double expected = 199.50;
        double actual = rewVal.getCashValue();
        assertEquals(expected, actual);
    }
}
