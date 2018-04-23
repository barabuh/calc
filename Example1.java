import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        /* line AB with 2 points:A(x1;y1) & B(x2;y2), for example A(200;20), B(300;30)
        y = kx + b
        k = (y1-y2)/(x1-y2) */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter x1 for point A");
        double x1 = scan.nextInt();
        System.out.println("Enter y1 for point A");
        double y1 = scan.nextInt();
        System.out.println("Enter x2 of point B");
        double x2 = scan.nextInt();
        System.out.println("Enter y2 of point B");
        double y2 = scan.nextInt();
        System.out.println("Enter any x of y=kx + b");
        double x = scan.nextInt();
        scan.close();
        double k = (y1 - y2) / (x1 - x2);
        double b = y2 - (k * x2);
        double y = k * x + b;
        System.out.print("k = " + k + " b = " + b + " ");
        System.out.print("y = " + Math.round(y));
    }
}