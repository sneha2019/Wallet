//Implemented a simple wallet
public class TestMain {

    public static void main(String[] args) {


        //System.out.println("Hello World!");

        Wallet wallet1 = new SavingsWallet();

        wallet1.addMoney(2345);
        System.out.println ( "AccountBalance: " + wallet1.getBalance());

        int balance = (int) wallet1.removeMoney(450);

        if (balance == 0)
            System.out.println ("Amount withdrawn with overdue in wallet ");

        if (balance == -1)
            System.out.println ("Amount cannot be withdrawn even with overdue in wallet ");

        System.out.println("AccountBalance: " + wallet1.getBalance());


    }
}

