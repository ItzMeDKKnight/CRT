import java.util.Scanner;

public class ProfitLoss {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost price: ");
        int cp = sc.nextInt();
        System.out.println("Enter the selling price");
        int sp = sc.nextInt();
        if (cp > sp){
            System.out.println("Loss");
        } else if (sp > cp) {
            System.out.println("Profit");
        } else
            System.out.println("No Profit No Loss");
    }
}
