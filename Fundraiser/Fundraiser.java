public class Fundraiser {
    private double target;
    private double total;
    private double count = 0;

    public Fundraiser(double amount) {
        total = amount;
    }

    public double averageDonation() {
        return (count == 0) ? 0.0 : total / count;
    }

    public void addDonation(double amount) {
        total += amount;
        count++;
    }

    public double distanceToTarget() {
        return (total >= target) ? 0.0 : target - total;
    }
}
