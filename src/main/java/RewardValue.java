public class RewardValue {
    int miles;
    double cash;
    public RewardValue(double cashValue) {
        this.cash = cashValue;
        miles = (int) (cashValue/0.0035);
    }

    public RewardValue(int milesValue) {
        this.miles = milesValue;
        cash = milesValue * 0.0035;
    }

    public double getCashValue() {
        return cash;
    }

    public int getMilesValue() {
        return miles;
    }
}
