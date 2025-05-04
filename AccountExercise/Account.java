public class Account{

    private String titularName;
    private String titularLastName;
    private int accountNumber;
    private type accountType;
    private int balance;

    public Account(String titularName, String titularLastName, int accountNumber, type accountType){
        this.titularName = titularName;
        this.titularLastName = titularLastName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = 0;
    }

    public void printAttributes(){
        System.err.println("Nombre del titular: "+titularName);
        System.err.println("Apellidos del titular: "+titularLastName);
        System.err.println("Numero de la cuenta: "+accountNumber);
        System.err.println("Tipo de cuenta: "+accountType);
        System.err.println("Saldo : $ "+balance + "\n");
    }


    public void printBalance(){
        System.err.println("Saldo : $ "+balance);
    }


    public void deposit(int value){
        balance += value;
        System.out.println("Se consigno: $ "+value+"\n");
        System.out.println("Nuevo saldo: $ "+balance+"\n");
    }


    public void withdraw(int value){
        if(value<=balance){
            balance -= value;
            System.out.println("Se retiro: $ "+value+"\n");
            System.out.println("Nuevo saldo: $ "+balance+"\n");
        }
        else{
            System.out.println("Saldo insuficiente. \n");
        }
    }

}