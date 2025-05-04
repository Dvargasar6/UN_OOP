public class Main{

    public static void main(String[] args){
        Account cuenta1 = new Account("Daniel","Vargas",1001477629,type.AHORROS);

        cuenta1.printAttributes();

        cuenta1.deposit(100000);
        cuenta1.deposit(50000);
        cuenta1.withdraw(100000);
        cuenta1.withdraw(100000);
    }
}