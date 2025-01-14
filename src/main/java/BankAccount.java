public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        this.amount += sum;
    }

    public void withDraw(int sum) throws LimitException {
        if (this.amount < sum){
            throw new LimitException("Запрашиваемая сумма выше остатка на счете. Остаток: " + this.amount, this.amount);
        }
        this.amount -= sum;
    }
}
