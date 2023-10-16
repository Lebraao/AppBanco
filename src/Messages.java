public class Messages {

    AccountInfo accountInfo = new AccountInfo();

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
};
