import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char signal = sc.next().charAt(0);

        switch (Character.toUpperCase(signal)) {
            case 'R':
                System.out.println("Stop");
                break;

            case 'Y':
                System.out.println("Wait");
                break;

            case 'G':
                System.out.println("Go");
                break;

            default:
                System.out.println("Invalid signal");
        }

        sc.close();
    }
}
