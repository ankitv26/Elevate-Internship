import java.util.Scanner;


class Calculator {
    public double add(double num1, double num2) {

        return num1 + num2;

    }

    public double sub(double num1, double num2) {
        return num1 - num2;
    }

    public double mul(double num1, double num2) {
        return num1 * num2;

    }

    public double div(double num1, double num2) {
        if (num2 == 0)
            throw new ArithmeticException("division by zero");
        return num1 / num2;

    }
}

public class CalculatorApp {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        boolean cal = true;

        while (cal) {

            System.out.print("Enter num1 : ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter Operation ( + , - , * , / ) : ");
            char operation = scanner.next().charAt(0);
            System.out.print("Enter num2 : ");
            double num2 = scanner.nextDouble();

            try {

                double result;
                switch (operation) {

                    case '+':
                        result = calculator.add(num1, num2);
                        break;

                    case '-':
                        result = calculator.sub(num1, num2);
                        break;

                    case '*':
                        result = calculator.mul(num1, num2);
                        break;

                    case '/':
                        result = calculator.div(num1, num2);
                        break;

                    default:
                        System.out.println("Enter valid operation");
                        continue;
                }
                System.out.println("Result : " + result);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.print("Continue (yes/no) : ");
            String choice = scanner.next();
            if (!choice.equalsIgnoreCase("yes")) {
                cal = false;
            }
        }
        scanner.close();
        System.out.println("Thank you for using Calculator");

    }
}
