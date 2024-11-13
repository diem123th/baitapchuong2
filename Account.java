public class Account {
    int id;
    Customer2 customer2;
    double balance = 0.0;

    Account(int id, Customer2 customer2, double balance) {
        this.id = id;
        this.customer2 = customer2;
        this.balance = balance;
    }

    Account(int id, Customer2 customer2) {
        this.id = id;
        this.customer2 = customer2;
    }

    int getId() {
        return this.id;
    }

    Customer2 getCustomer2() {
        return this.customer2;
    }

    double getBalance() {
        return this.balance;
    }

    void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString() {
        return String.format("balance=$%.2f", balance);
    }

    String getCustomer2Name() {
        return customer2.getName();
    }

    Account deposit(double amount) {
        this.balance += amount;
        return this;
    }

    public Account withdraw(double amount) {
        if (balance >= amount) {
            this.balance -= amount;
        } else {
            System.out.println("Amount withdrawn exceeds the current balance!");
        }

        return this;
    }
}


