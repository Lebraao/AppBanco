import java.util.Locale;
import java.util.Scanner;

public class AppBanco {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        AccountInfo myAccount = new AccountInfo();

        //Scanning user's name.
        System.out.print("Digite seu nome: ");
        myAccount.titularAccount = sc.nextLine();



        //Making the message to show client's information.
        String clientResumeInformation = """
                
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
        String menuOptions = """
                Operaçoes:
                                
                1- Consultar saldos
                2- Receber valor
                3- Transferencia de valor
                4- Sair
                             
                Digite a opcão desejada:\s""";

        //printing users information on console.
        System.out.printf(clientResumeInformation, myAccount.titularAccount, myAccount.agency,
               myAccount.numberAccount, myAccount.checkerNumber, myAccount.accountFunds, myAccount.typeOfAccount);
        //Making the variable to the choose option from de menu.
        int chooseOption;
        //Variables to store the initial balance and the for the funds difference.
        double fundsDifference, initialBalance = myAccount.accountFunds, differenceBalance;


        do {

            System.out.print("\n" + menuOptions);
            chooseOption = sc.nextInt();

            switch (chooseOption){
                //Case one is for get the available balance and if have a difference to the initial one show in console.
                case 1:
                    System.out.printf("Saldo disponivel: R$ %.2f\n", myAccount.accountFunds);

                    if(myAccount.accountFunds != initialBalance){
                        differenceBalance = myAccount.accountFunds - initialBalance;
                        System.out.printf("Diferenca de: R$ %.2f para o valor inicial\n", differenceBalance);
                    }

                break;

                //Case two is for add funds to account.
                case 2:
                    System.out.print("Quanto ira receber?: R$ ");
                    fundsDifference = sc.nextDouble();
                    myAccount.accountFunds += fundsDifference;
                    System.out.printf("Novo saldo: R$ %.2f\n", myAccount.accountFunds);

                break;

                //Case three is for check if have sufficient funds and subtract funds from the account.
                case 3:
                    System.out.print("Quanto ira enviar?: ");
                    fundsDifference = sc.nextDouble();

                    if(fundsDifference < myAccount.accountFunds) {
                        myAccount.accountFunds -= fundsDifference;
                        System.out.printf("Novo saldo: R$ %.2f\n", myAccount.accountFunds);
                    }else{
                        System.out.println("Fundos insuficientes.");
                    }

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
        System.out.printf(clientResumeInformation, myAccount.titularAccount, myAccount.agency,
              myAccount.numberAccount, myAccount.checkerNumber, myAccount.accountFunds, myAccount.typeOfAccount);

    }
}
