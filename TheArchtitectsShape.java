import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String shape = sc.next();

        switch (shape.toLowerCase()) {

            case "circle":
                double radius = sc.nextDouble();
                double circleArea = Math.PI * radius * radius;

                System.out.println("Circle");
                System.out.println("Area = " + circleArea);
                break;

            case "rectangle":
                double length = sc.nextDouble();
                double width = sc.nextDouble();
                double rectangleArea = length * width;

                System.out.println("Rectangle");
                System.out.println("Area = " + rectangleArea);
                break;

            case "square":
                double side = sc.nextDouble();
                double squareArea = side * side;

                System.out.println("Square");
                System.out.println("Area = " + squareArea);
                break;

            case "triangle":
                double base = sc.nextDouble();
                double height = sc.nextDouble();
                double triangleArea = 0.5 * base * height;

                System.out.println("Right-Angle Triangle");
                System.out.println("Area = " + triangleArea);
                break;

            default:
                System.out.println("Invalid shape");
        }

        sc.close();
    }
}
