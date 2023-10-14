import java.util.Random;

public class AccountInfo {
    String agency = "077" ;
    int accountGenerator(int max, int min){
        Random random = new Random();
        return (random.nextInt(max - (min - 1)) + min);
    }
    int numberAccount = accountGenerator(99999999, 9999999);
    int checkerNumber = new Random().nextInt(9);
    double accountFunds = numberGenerator(9999, 999);
    double numberGenerator(double max, double min){
        Random random = new Random();
        return (random.nextDouble(max - (min - 1)) + min);
    }

    String titularAccount;
    String typeOfAccount = "Corrente";

    //Making the message to show client's information.
}
