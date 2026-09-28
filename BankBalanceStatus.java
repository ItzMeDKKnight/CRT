import java.util.Scanner;

public class BankBalanceStatus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your account balance: ");

        int balance = sc.nextInt();

        if(balance > 0){
            System.out.println("Your account balance is positive");
        } else if (balance < 0) {
            System.out.println("Your account balance is negative");
        }
        else
            System.out.println("Zero");
    }
}
