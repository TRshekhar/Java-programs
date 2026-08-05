import java.util.HashMap;

class Account{
    private static long next_acc_number = 1001;
    private static HashMap<Long, Account> accounts = new HashMap<>();
    private static int total_number_of_acc = 0;

    private final long acc_number;
    private final String acc_created_at;
    private String acc_holder_name;
    private int balance;

    Account(String acc_holder, int balance){
        this.acc_holder_name = acc_holder;
        this.balance = balance;
        this.acc_number = next_acc_number++;
        this.acc_created_at = java.time.LocalDate.now().toString();
        total_number_of_acc++;
    }

    void balance(){
        System.out.println("Current balance: " + balance);
    }

    void deposite(int b){
        balance += b;
        System.out.println(b+" diposited");
        System.out.println("New balance: "+ balance);
    }
    
    void withdrawal(int w){
        balance -= w;
        System.out.println("Withdrawal successfull");
        System.out.println("remaining balance: "+ balance);
    }

    void get_acc_details(){
        System.out.println("Account number: "+acc_number);
        System.out.println("Account holder name: "+acc_holder_name);
        System.out.println("Account created at: "+acc_created_at);
        System.out.println("Current balance: "+balance);
    }

    static void getDetails(long acc_number){
        Account acc = accounts.get(acc_number);

        if(acc != null){
            System.out.println("Account number: "+ acc.acc_number);
            System.out.println("Account holder name: "+ acc.acc_holder_name);
            System.out.println("Account creatd at: "+ acc.acc_created_at);
            System.out.println("Balance: "+ acc.balance);
        }else{
            System.out.println("Account not found!");
        }
    }
}

public class Bank{
    public static void main(String[] args) {
        Account a1 = new Account("Om Prakash", 20000);
        Account a2 = new Account("Daksh", 10000);
        Account a3 = new Account("Madhukar", 2000000);

        a1.get_acc_details();
        System.out.println();
        a2.get_acc_details();
        System.out.println();
        a3.get_acc_details();
        System.out.println();

        Account.getDetails(1002);
        System.out.println();
        Account.getDetails(1004);

    }
}