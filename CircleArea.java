import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args){
        Scanner c = new Scanner(System.in);
        final double pi = 3.1416;
        double radius, area;

        System.out.print("Enter the radius of a circle: ");
        radius = c.nextDouble();

        area = pi * radius * radius;
        System.out.println("Area of a Circle = " + String.format("%.2f", area));
        c.close();

    }
}
