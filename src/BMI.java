import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.print("Enter Weight: ");
        weight = scanner.nextDouble();
        System.out.print("Enter Height: ");
        height = scanner.nextDouble();

        bmi = weight / (height*height);
        if (bmi<18){
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        }else if (bmi <25){
            System.out.printf("%-20.2f%s", bmi, "Normal");
        }else if (bmi<30){
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        }else {
            System.out.printf("%-20.2f%s", bmi, "Obese");
        }

    }
}
