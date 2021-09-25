import java.time.LocalDate;

public class Meat extends Material implements Discount {
    private double weight;

    public Meat() {
    }

    public Meat(double weight) {
        this.weight = weight;
    }

    public Meat(String id, String name, LocalDate manufacturingDate, int cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getAmount() {
        return getCost() * weight;
    }

    @Override
    public LocalDate getExpiryDate() {
        return getManufacturingDate().plusDays(7);
    }

    @Override
    public double getRealMoney() {
        LocalDate currentDay = LocalDate.now();
        if ((getExpiryDate().equals(currentDay.plusDays(3))) || (getExpiryDate().isBefore(currentDay.plusDays(3)))) {
            return getCost() - (getCost() * 50 / 100);
        } else if ((getExpiryDate().equals(currentDay.plusDays(5))) || (getExpiryDate().isBefore(currentDay.plusDays(5)))) {
            return getCost() - (getCost() * 30 / 100);
        } else {
            return getCost();
        }
    }

    @Override
    public String toString() {
        return "Meat{" +
                super.toString() +
                ", price=" + getRealMoney() +
                ", weight=" + weight +
                '}';
    }
}
