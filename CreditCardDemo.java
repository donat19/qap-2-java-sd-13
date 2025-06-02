public class CreditCardDemo {
    public static void main(String[] args) {
        Address address = new Address("123 Main St", "Anytown", "CA", "12345");
        
        Person person = new Person("John", "Doe", address);
        
        Money creditLimit = new Money(1000, 0);
        
        CreditCard card = new CreditCard(person, creditLimit);
        
        System.out.println("Initial Credit Card Information:");
        System.out.println("Owner: " + card.getPersonals());
        System.out.println("Balance: " + card.getBalance());
        System.out.println("Credit Limit: " + card.getCreditLimit());
        System.out.println("Available Credit: " + card.getAvailableCredit());
        System.out.println();
        
        Money charge1 = new Money(200, 0);
        System.out.println("Attempt to charge " + charge1);
        if (card.charge(charge1)) {
            System.out.println("Charge approved");
        } else {
            System.out.println("Charge declined");
        }
        System.out.println("New Balance: " + card.getBalance());
        System.out.println("Available Credit: " + card.getAvailableCredit());
        System.out.println();
        
        Money charge2 = new Money(900, 0);
        System.out.println("Attempt to charge " + charge2);
        if (card.charge(charge2)) {
            System.out.println("Charge approved");
        } else {
            System.out.println("Charge declined");
        }
        System.out.println("Balance: " + card.getBalance());
        System.out.println();
        
        Money payment = new Money(50, 0);
        System.out.println("Making payment of " + payment);
        card.payment(payment);
        System.out.println("New Balance: " + card.getBalance());
        System.out.println("Available Credit: " + card.getAvailableCredit());
    }
}
