import java.util.Scanner;

public class PrincipalFunctions {
    static Scanner sc = new Scanner(System.in);
    static AccountInfo myAccount = new AccountInfo();
    static int chooseOption;

     static void chooseMenu() {
        do {

            getMenuOptions();
            chooseOption = PrincipalFunctions.sc.nextInt();

            switch (chooseOption) {
                //Case one is for get the available balance and if have a difference to the initial one show in console.
                case 1:
                    PrincipalFunctions.myAccount.showActualFunds();

                    break;

                //Case two is for add funds to account.
                case 2:
                    PrincipalFunctions.myAccount.addFunds();

                    break;

                //Case three is for check if have sufficient funds and subtract funds from the account.
                case 3:
                    PrincipalFunctions.myAccount.withdrawFunds();

                    break;

                //Case four is for to show a message that the user is leaving.
                case 4:
                    System.out.println("Voce escolheu sair!");
                    System.out.println("\nResumo final: ");

                    break;

                //Default message to show the user choose a invalid option.
                default:
                    System.out.println("OPCAO INVALIDA");
            }

        } while (chooseOption != 4);
     }

    //Making the message to show client's information.
    static private String clientResumeInformation = """
                            
            ***********************************
            Dados do cliente:
            Nome:            %s
            Agencia:         %s
            Numero de conta: %s-%s
            Saldo inical:    R$ %.2f
            Tipo de conta:   %s
            ***********************************""";

    //Making the principal menu options.
    static private String menuOptions = """
           \n 
           Operaçoes:                 
           1- Consultar saldos
           2- Receber valor
           3- Transferencia de valor
           4- Sair
                         
           Digite a opcão desejada:\s""";

     static void getMenuOptions() {
         System.out.print(menuOptions);
    }
    static String getAccountInfo() {
        return clientResumeInformation;
    }

}
