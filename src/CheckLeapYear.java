import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int years;
        System.out.print("Enter Years");
        years = scanner.nextInt();
        if(years % 4 == 0){
            if(years % 100 == 0){
                if(years % 400 == 0){
                    System.out.printf("%d is a leap year", years);
                } else {
                    System.out.printf("%d is NOT a leap year", years);
                }
            } else {
                System.out.printf("%d is a leap year", years);
            }
        } else {
            System.out.printf("%d is NOT a leap year", years);
        }
    }
}
