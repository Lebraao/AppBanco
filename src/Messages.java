public class Messages {

    private String titularAccount;
    private String agency;
    private int numberAccount;
    private int checkerNumber;
    private double accountFunds;
    private String typeOfAccount;


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

    public String getMenuOptions(){
        return menuOptions;
    }

    public String getClientResumeInformation(){

        return clientResumeInformation;
    }


    public Messages(String titularAccount, String agency, int numberAccount, int checkerNumber, double accountFunds, String typeOfAccount){
        this.titularAccount = titularAccount;
        this.agency = agency;
        this.numberAccount = numberAccount;
        this.checkerNumber = checkerNumber;
        this.accountFunds = accountFunds;
        this.typeOfAccount = typeOfAccount;


    }

    public String toString(){
        return String.format(clientResumeInformation, titularAccount, agency,
                numberAccount, checkerNumber, accountFunds, typeOfAccount);
    }
};
