package intro.baitap;

import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vnd, usd;
        System.out.print("Enter USD: ");
        usd = scanner.nextDouble();
        vnd = usd*23000;
        System.out.println(usd + "USD" + " = "+ vnd +"VND");
    }
}
