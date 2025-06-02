public class Money {
    private long dollars;
    private long cents;
    
    public Money(long dollars, long cents) {
        this.dollars = dollars;
        this.cents = cents;
        normalize();
    }
    
    public Money(double amount) {
        this.dollars = (long) amount;
        this.cents = Math.round((amount - this.dollars) * 100);
        normalize();
    }
    
    public Money(Money other) {
        this.dollars = other.dollars;
        this.cents = other.cents;
    }
    
    private void normalize() {
        if (cents >= 100) {
            dollars += cents / 100;
            cents %= 100;
        } else if (cents < 0) {
            dollars -= (Math.abs(cents) / 100) + 1;
            cents = 100 - (Math.abs(cents) % 100);
        }
    }
    
    public long getDollars() {
        return dollars;
    }
    
    public long getCents() {
        return cents;
    }
    
    public Money add(Money other) {
        long newDollars = this.dollars + other.dollars;
        long newCents = this.cents + other.cents;
        return new Money(newDollars, newCents);
    }
    
    public Money subtract(Money other) {
        double thisAmount = this.dollars + this.cents / 100.0;
        double otherAmount = other.dollars + other.cents / 100.0;
        double resultAmount = thisAmount - otherAmount;
        return new Money(resultAmount);
    }
    
    public boolean isGreaterThan(Money other) {
        if (this.dollars > other.dollars) {
            return true;
        } else if (this.dollars == other.dollars) {
            return this.cents > other.cents;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return String.format("$%d.%02d", dollars, cents);
    }
}
