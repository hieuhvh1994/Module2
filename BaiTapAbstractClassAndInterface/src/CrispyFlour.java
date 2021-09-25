import java.time.LocalDate;


public class CrispyFlour extends Material implements Discount {
    private int quantity;

    public CrispyFlour() {
    }

    public CrispyFlour(int quantity) {
        this.quantity = quantity;
    }

    public CrispyFlour(String id, String name, LocalDate manufacturingDate, int cost, int quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public double getAmount() {
        return quantity * getCost();
    }

    @Override
    public LocalDate getExpiryDate() {
        return getManufacturingDate().plusYears(1);
    }

    @Override
    public double getRealMoney() {
        LocalDate currentDay = LocalDate.now();
        if ((getExpiryDate().equals(currentDay.plusMonths(2))) || (getExpiryDate().isBefore(currentDay.plusMonths(2)))) {
            return getCost() - (getCost() * 40 / 100);
        } else if ((getExpiryDate().equals(currentDay.plusMonths(4))) || (getExpiryDate().isBefore(currentDay.plusMonths(4)))) {
            return getCost() - (getCost() * 20 / 100);
        } else {
            return getCost();
        }
    }

    @Override
    public String toString() {
        return "CrispyFlour{" +
                super.toString() +
                ", price=" + getRealMoney() +
                ", quantity=" + quantity +
                '}';
    }
}
