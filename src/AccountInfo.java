import java.util.Random;

public class AccountInfo {
    //Agency number.
    String agency = "077" ;

    //Generate a random number to a account.
    int accountGenerator(int max, int min){
        Random random = new Random();
        return (random.nextInt(max - (min - 1)) + min);
    }
    int numberAccount = accountGenerator(99999999, 9999999);
    int checkerNumber = new Random().nextInt(9);

    //Generate a random number for funds.
    double accountFunds = numberGenerator(9999, 999);
    double numberGenerator(double max, double min){
        Random random = new Random();
        return (random.nextDouble(max - (min - 1)) + min);
    }

    //String for storage the account titular name.
    String titularAccount;
    String typeOfAccount = "Corrente";

    //Making the message to show client's information.
}
