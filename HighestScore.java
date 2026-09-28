import java.util.Scanner;

public class HighestScore {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first score");
        int p1 = sc.nextInt();
        System.out.println("Enter second score");
        int p2 = sc.nextInt();
        System.out.println("Enter third score");
        int p3 = sc.nextInt();
        if (p1 > p2 && p1 > p3){
            System.out.println("Player 1 is the highest scorer");
        } else if (p2 > p1 && p2 > p3) {
            System.out.println("Player 2 is the highest scorer");
        } else if (p3 > p1 && p3 > p2) {
            System.out.println("Player 3 is the highest scorer");
        } else
            System.out.println("Equal Scores");
    }
}
