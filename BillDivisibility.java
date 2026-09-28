import java.util.Scanner;

public class BillDivisibility {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your bill amount: ");
        int Bill = sc.nextInt();
        if (Bill % 5 == 0){
            System.out.println("Divisible by 5, Hence applicable for discount");
        } else {
            System.out.println("Not Divisible by 5, Not applicable for discount");
        }
    }
}
