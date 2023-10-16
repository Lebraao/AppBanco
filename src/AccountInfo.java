import java.util.Random;

public class AccountInfo {

    //Name and type of account.
    String titularAccount;
    String typeOfAccount = "Corrente";

    //Setting the agency number
    String agency = "077" ;

    //Generate a random number to a account.
    int accountGenerator(int max, int min){
        Random random = new Random();
        return (random.nextInt(max - (min - 1)) + min);
    }

    //Generate a random number account between 9999999 and 999999999.
    int numberAccount = accountGenerator(99999999, 9999999);

    //Generate a random checker number.
    int checkerNumber = new Random().nextInt(9);

    //Generate a random amount for the funds.
    double accountFunds = numberGenerator(9999, 999);
    double numberGenerator(double max, double min){
        Random random = new Random();
        return (random.nextDouble(max - (min - 1)) + min);
    }

    //For add funds in account.
    public void addFunds(double funds){
        this.accountFunds += funds;
    };

    //For subtract funds in account.
    public boolean withdrawFunds(double funds){
      if(this.accountFunds >= funds){
          this.accountFunds -= funds;
          return true;
      }

      return false;
    };


}
