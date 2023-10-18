import java.util.Locale;
public class AppBanco {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        //Scanning user's name.
        PrincipalFunctions.myAccount.setTitularAccount();

        //printing users information on console.
        PrincipalFunctions.myAccount.getAccountInfo();

        //Switch case for options.
        PrincipalFunctions.chooseMenu();

        //Printing user's final's information.
        PrincipalFunctions.myAccount.getAccountInfo();

    }
}
