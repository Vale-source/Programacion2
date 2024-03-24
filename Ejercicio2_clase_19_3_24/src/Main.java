import Clases.*;

public class Main {
    public static void main(String[] args) {
        // Creao una cuenta de ahorros con un saldo inicial de $15,000 y una tasa anual del 5%
        SavingAccount savingAccount = new SavingAccount(15000, 0.05f, true);

        // Deposito $2000 a la cuenta de ahorros
        savingAccount.consign(2000);

        // Retiro $500 de la cuenta de ahorros
        savingAccount.withdraw(500);

        // Realizo el extracto mensual de la cuenta de ahorros
        savingAccount.monthlyStatement();

        // Muestro la información de la cuenta de ahorros
        savingAccount.showSavingAccount();
    }
}
