import java.util.Scanner;

public class HigherScore {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the scores of the participants: ");
        int p1 = sc.nextInt();
        int p2 = sc.nextInt();

        if (p1 > p2){
            System.out.println("Friend 1");
        } else if (p2 > p1) {
            System.out.println("Friend 2");
        } else
            System.out.println("Tie");
    }
}
