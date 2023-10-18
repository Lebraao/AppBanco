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

        //printing users information on console.
        myAccount.getAccountInfo();

        //Making the variable to the choose option from de menu.
        int chooseOption;

        //Variables to store the initial balance and the for the funds difference.
        double fundsDifference, initialBalance = myAccount.accountFunds, differenceBalance;


        do {

            myAccount.getMenuOptions();
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
                    myAccount.addFunds(fundsDifference);

                break;

                //Case three is for check if have sufficient funds and subtract funds from the account.
                case 3:
                    System.out.print("Quanto ira enviar?: ");
                    fundsDifference = sc.nextDouble();

                    if(myAccount.withdrawFunds(fundsDifference)) {
                        System.out.println("Realizado com sucesso!");
                        }else {
                        System.out.println("Fundos insuficientes!");
                    }

                break;

                //Case four is for to show a message that the user is leaving.
                case 4:
                    System.out.println("Voce escolheu sair!");

                break;

                //Default message to show the user choose a invalid option.
                default:
                    System.out.println("OPCAO INVALIDA");
            }

        }while(chooseOption != 4);

        System.out.println("\nResumo final: ");
        myAccount.getAccountInfo();

    }
}
