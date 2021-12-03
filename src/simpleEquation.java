import java.util.Scanner;

public class simpleEquation {
    public static void main(String[] args) {
        int a, b;
        System.out.println("ax + b = 0");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = scanner.nextInt();
        System.out.println("Enter b");
        b = scanner.nextInt();
        if (a == 0 && b == 0) {
            System.out.println("Equation with infinite solutions");
        } else if (a == 0) {
            System.out.println("Equation has no solution");
        }else {
            System.out.println("Equation that has a solution is: "+ (-b/a));
        }
    }
}
