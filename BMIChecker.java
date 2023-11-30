import java.util.Scanner;

public class BMIChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight (kg): ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height (cm): ");
        double height = scanner.nextDouble();

        double bmi = weight / ((height / 100) * (height / 100));

        String result;
        if (bmi < 18.5) {
            result = "Underweight";
        } else if (bmi < 25) {
            result = "Normal";
        } else if (bmi < 30) {
            result = "Overweight";
        } else {
            result = "Obese";
        }

        System.out.println("Your BMI is: " + bmi + " (" + result + ")");
    }
}
