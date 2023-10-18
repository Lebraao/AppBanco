import java.util.Locale;
import java.util.Scanner;

public class AppBanco {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        AccountInfo myAccount = new AccountInfo();

        //Scanning user's name.
        myAccount.setTitularAccount();

        //printing users information on console.
        myAccount.getAccountInfo();

        //Making the variable to the choose option from de menu.
        int chooseOption;

        do {

            myAccount.getMenuOptions();
            chooseOption = sc.nextInt();

            switch (chooseOption){
                //Case one is for get the available balance and if have a difference to the initial one show in console.
                case 1:
                    myAccount.showActualFunds();

                break;

                //Case two is for add funds to account.
                case 2:
                    myAccount.addFunds();

                break;

                //Case three is for check if have sufficient funds and subtract funds from the account.
                case 3:
                    myAccount.withdrawFunds();

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
