package Calculator;

public class Main {
    public static void main(String[] args) {
        System.out.println("This is a new calculator!");

            Brain calculator = new Brain();
        try {
            calculator.calculate();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

