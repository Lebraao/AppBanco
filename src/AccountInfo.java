import java.util.Random;
import java.util.Scanner;

public class AccountInfo {

    Scanner sc = new Scanner(System.in);

    //Name and type of account.
    private String titularAccount;
    void setTitularAccount(){
        System.out.print("Digite seu nome: ");
        String name = sc.nextLine();
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
        System.out.println("O saldo atual é R$ " + this.accountFunds);
        if(this.accountFunds != this.initialAccountFunds){
            System.out.printf("Diferença de R$ ", (this.initialAccountFunds - this.accountFunds));
        }
    }

    //For add funds in account.
    void addFunds() {
        System.out.print("Quanto ira receber? R$ ");
        double funds = sc.nextDouble();
        this.accountFunds += funds;
        System.out.println("Novo saldo = R$ " + this.accountFunds);
    }

    ;

    //For subtract funds in account.
    void withdrawFunds() {
        System.out.println("Quanto ira enviar? R$ ");
        double funds = sc.nextDouble();
        if (this.accountFunds > funds) {
            this.accountFunds -= funds;
            System.out.println("Realizado com sucesso!");
            System.out.println("Novo saldo = R$ " + this.accountFunds);
            return;
        }
        System.out.println("Fundos insuficientes!");
        System.out.println("Falta R$" + (funds - this.accountFunds));
        return;
    }


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