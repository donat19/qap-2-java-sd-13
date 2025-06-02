public class CreditCard {
    private Person owner;
    private Money balance;
    private Money creditLimit;
    
    public CreditCard(Person owner, Money creditLimit) {
        this.owner = owner;
        this.balance = new Money(0, 0);
        this.creditLimit = new Money(creditLimit);
    }
    
    public Money getBalance() {
        return new Money(balance);
    }
    
    public Money getCreditLimit() {
        return new Money(creditLimit);
    }
    
    public Money getAvailableCredit() {
        return creditLimit.subtract(balance);
    }
    
    public String getPersonals() {
        return owner.toString();
    }
    
    public boolean charge(Money amount) {
        Money availableCredit = getAvailableCredit();
        if (amount.isGreaterThan(availableCredit)) {
            return false;
        }
        
        balance = balance.add(amount);
        return true;
    }
    
    public void payment(Money amount) {
        balance = balance.subtract(amount);
    }
    
    @Override
    public String toString() {
        return "Owner:\n" + owner + "\nBalance: " + balance + "\nCredit Limit: " + creditLimit;
    }
}
