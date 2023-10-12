import java.util.Locale;
import java.util.Scanner;

public class AppBanco {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Scanning user's information.

        System.out.print("Digite seu nome: ");
        //Logging the client's name.
        String clientName = sc.nextLine();

        System.out.print("Digite seu saldo bancario: ");
        //Logging the bank balance from the client.
        double bankBalance = sc.nextDouble();

        System.out.print("Qual tipo de conta bancaria deseja?: ");
        //Getting the type of bank account from the client.
        sc.nextLine();
        String typeOfAccount = sc.nextLine();

        //Making the message to show client's information.
        String clientResumeInformation = """
                
                **********************************
                Dados do cliente:
                Nome:            %s
                Saldo inical:    R$ %.2f
                Tipo de conta:   %s
                ***********************************
                """;

        //Making the principal menu options.
        String menuOptions = """
                Operaçoes:
                                
                1- Consultar saldos
                2- Receber valor
                3- Transferencia de valor
                4- Sair
                             
                Digite a opcão desejada:\s""";

        System.out.printf(clientResumeInformation, clientName, bankBalance, typeOfAccount);
        //Making the variable to the choose option from de menu.
        int chooseOption;
        //Variables to store the initial balance and the for the funds difference.
        double fundsDifference, initialBalance = bankBalance, differenceBalance;


        do {

            System.out.print("\n" + menuOptions);
            chooseOption = sc.nextInt();

            switch (chooseOption){
                //Case one is for get the available balance and if have a difference to the initial one show in console.
                case 1:
                    System.out.printf("Saldo disponivel: R$ %.2f\n", bankBalance);

                    if(bankBalance != initialBalance){
                        differenceBalance = bankBalance - initialBalance;
                        System.out.printf("Diferenca de: R$ %.2f para o valor inicial\n", differenceBalance);
                    }

                break;

                //Case two is for add funds to account.
                case 2:
                    System.out.print("Quanto ira receber?: R$ ");
                    fundsDifference = sc.nextDouble();
                    bankBalance += fundsDifference;
                    System.out.printf("Novo saldo: R$ %.2f\n", bankBalance);

                break;

                //Case three is for subtract funds from the account.
                case 3:
                    System.out.print("Quanto ira enviar?: ");
                    fundsDifference = sc.nextDouble();
                    bankBalance -= fundsDifference;
                    System.out.printf("Novo saldo: R$ %.2f\n", bankBalance);

                break;

                //Case four is for to show a message that the user is leaving.
                case 4:
                    System.out.println("\nVoce escolheu sair!");

                break;

                //Default message to show the user choose a invalid option.
                default:
                    System.out.println("OPCAO INVALIDA");
            }

        }while(chooseOption != 4);

        System.out.println("Resumo final: ");
        System.out.printf(clientResumeInformation, clientName, bankBalance, typeOfAccount);
    }
}
