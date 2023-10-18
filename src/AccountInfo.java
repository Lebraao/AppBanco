import java.util.Random;

public class AccountInfo {

    PrincipalFunctions principalFunctions = new PrincipalFunctions();

    //Name and type of account.
    private String titularAccount;
    void setTitularAccount(){
        System.out.print("Digite seu nome: ");
        String name = PrincipalFunctions.sc.nextLine();
        this.titularAccount = name;
    }

    String typeOfAccount = "Corrente";

    //Setting the agency number
    String agency = "077";


    //Generate a random number between a interval.
    int accountGenerator(int max, int min) {
        Random random = new Random();
        return (random.nextInt(max - (min - 1)) + min);
    }

    //Generate a random number account between 9999999 and 999999999.
    int numberAccount = accountGenerator(99999999, 9999999);

    //Generate a random checker number.
    int checkerNumber = new Random().nextInt(9);

    //Generate a random amount for the funds.
    double accountFunds = numberGenerator(9999, 999);
    double initialAccountFunds = accountFunds;

    double numberGenerator(double max, double min) {
        Random random = new Random();
        return (random.nextDouble(max - (min - 1)) + min);
    }

    void showActualFunds() {
        System.out.printf("O saldo atual é R$%.2f ", this.accountFunds);
        if(this.accountFunds != this.initialAccountFunds){
            System.out.printf("Diferença de R$%.2f\n", (this.initialAccountFunds - this.accountFunds));
        }
    }

    //For add funds in account.
    void addFunds() {
        System.out.print("Quanto ira receber? R$ ");
        double funds = PrincipalFunctions.sc.nextDouble();
        this.accountFunds += funds;
        System.out.printf("Novo saldo = R$%.2f\n", this.accountFunds);
    }

    ;

    //For subtract funds in account.
    void withdrawFunds() {
        System.out.println("Quanto ira enviar? R$ ");
        double funds = PrincipalFunctions.sc.nextDouble();
        if (this.accountFunds > funds) {
            this.accountFunds -= funds;
            System.out.println("Realizado com sucesso!");
            System.out.printf("Novo saldo = R$%.2f\n", this.accountFunds);
            return;
        }
        System.out.println("Fundos insuficientes!");
        System.out.printf("Falta R$%.2f", (funds - this.accountFunds));
        return;
    }

    void getAccountInfo() {
        System.out.printf(PrincipalFunctions.getAccountInfo(), this.titularAccount, this.agency,
                this. numberAccount, this.checkerNumber, this.accountFunds, this.typeOfAccount);
    }
}