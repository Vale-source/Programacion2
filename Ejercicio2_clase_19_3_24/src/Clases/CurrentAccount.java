package Clases;

public class CurrentAccount extends Account {
    private float debitBalance = 0;

    public CurrentAccount(float balance, float annualRate) {
        super(balance, annualRate);
    }

    @Override
    public void withdraw(float amount){
        if (amount > balance) {
            debitBalance += amount - balance;
            balance = 0;
        } else {
            balance -= amount;
        }
        numberWithdrawals++;
    }

    @Override
    public void consign(float amount){
        super.consign(amount);
        if (debitBalance > 0) {
            if (amount >= debitBalance) {
                amount -= debitBalance;
                debitBalance = 0;
            } else {
                debitBalance -= amount;
                amount = 0;
            }
            super.consign(amount); // Consignar el resto después de reducir el sobregiro
        }
    }

    @Override
    public void monthlyStatement(){
        super.monthlyStatement();
    }

    public void showCurrentAccount() {
        System.out.println("Saldo: " + balance + "\n" +
                "Comision mensual: " + monthlyCommission + "\n" +
                "Transacciones realizadas: " + (numberWithdrawals + numberConsignments) + "\n" +
                "Valor de sobregiro: " + debitBalance);
    }
}

