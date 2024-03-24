package Clases;

public class SavingAccount extends Account {
    protected boolean active;

    public SavingAccount(float balance, float annualRate, boolean active) {
        super(balance, annualRate);
        this.active = active;
    }

    @Override
    public void consign(float amount) {
        if (active) {
            super.consign(amount);
        } else {
            System.out.println("Active su cuenta, para esto, debe tener $10,000 o más en su cuenta");
        }
    }

    @Override
    public void withdraw(float amount) {
        if (active) {
            super.withdraw(amount);
        } else {
            System.out.println("Active su cuenta por favor");
        }
    }

    @Override
    public void monthlyStatement() {
        if (numberWithdrawals > 4) {
            monthlyCommission = 1000;
        } else {
            monthlyCommission = 0;
        }
        balance -= monthlyCommission;

        if (balance >= 10000) {
            active = true;
        } else {
            active = false;
        }

        calculateInterest();
    }

    public void showSavingAccount() {
        System.out.println("Saldo: " + balance + "\n" +
                "Comision mensual: " + monthlyCommission + "\n" +
                "Transacciones realizadas: " + (numberWithdrawals + numberConsignments) + "\n" +
                "Estado de la cuenta: " + (active ? "Activa" : "Inactiva"));
    }
}

