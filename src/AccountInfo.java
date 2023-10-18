import java.util.Random;

public class AccountInfo {

    //Name and type of account.
    String titularAccount;
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

    double numberGenerator(double max, double min) {
        Random random = new Random();
        return (random.nextDouble(max - (min - 1)) + min);
    }

    //For add funds in account.
    public void addFunds(double funds) {
        this.accountFunds += funds;
    }

    ;

    //For subtract funds in account.
    public boolean withdrawFunds(double funds) {
        if (this.accountFunds > funds) {
            this.accountFunds -= funds;
            return true;
        }

        return false;
    }

    ;


    //Making the message to show client's information.
    private String clientResumeInformation = """
                            
            ***********************************
            Dados do cliente:
            Nome:            %s
            Agencia:         %s
            Numero de conta: %s-%s
            Saldo inical:    R$ %.2f
            Tipo de conta:   %s
            ***********************************
            """;

    //Making the principal menu options.
    private String menuOptions = """
            Operaçoes:
                            
            1- Consultar saldos
            2- Receber valor
            3- Transferencia de valor
            4- Sair
                         
            Digite a opcão desejada:\s""";

    void getMenuOptions() {
        System.out.print(menuOptions);
    }

    void getAccountInfo() {
        System.out.printf(clientResumeInformation, this.titularAccount, this.agency,
                this. numberAccount, this.checkerNumber, this.accountFunds, this.typeOfAccount);
    }
}