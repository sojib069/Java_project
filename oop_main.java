abstract class Calculator {
    protected double result;

    public abstract void add(double a, double b);
    public abstract void subtract(double a, double b);
    public abstract void multiply(double a, double b);
    public abstract void divide(double a, double b) throws ArithmeticException; 

    public double getResult() {
        return result;
    }
}

class StandardCalculator extends Calculator {
    @Override
    public void add(double a, double b) {
        result = a + b;
    }

    @Override
    public void subtract(double a, double b) {
        result = a - b;
    }

    @Override
    public void multiply(double a, double b) {
        result = a * b;
    }

    @Override
    public void divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        result = a / b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new StandardCalculator();

        calculator.add(5, 3);
        System.out.println("Addition: " + calculator.getResult());

        calculator.subtract(10, 4);
        System.out.println("Subtraction: " + calculator.getResult());

        calculator.multiply(2, 6);
        System.out.println("Multiplication: " + calculator.getResult());

        try {
            calculator.divide(15, 3);
            System.out.println("Division: " + calculator.getResult());
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
          }
