import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();
        double value = sc.nextDouble();

        switch (choice) {

            case 1:
                
                double fahrenheit = (value * 9 / 5) + 32;
                System.out.println(fahrenheit + " F");
                break;

            case 2:
                
                double celsius = (value - 32) * 5 / 9;
                System.out.println(celsius + " C");
                break;

            case 3:
                
                double meters = value * 1000;
                System.out.println(meters + " m");
                break;

            case 4:
                
                double kilometers = value / 1000;
                System.out.println(kilometers + " km");
                break;

            default:
                System.out.println("Invalid conversion choice");
        }

        sc.close();
    }
}
