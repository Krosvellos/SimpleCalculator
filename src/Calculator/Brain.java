package Calculator;

public class Brain {

UserInput input = new UserInput();
    public void calculate(){

        while (true) {
            input.inputNumbers();
            double result;

            switch (input.operator) {
                case '+':
                    result = input.a + input.b;
                    System.out.println("Result: "+ result);
                    break;

                case '-':
                    result = input.a - input.b;
                    System.out.println("Result: "+ result);
                    break;

                case '*':
                    result = input.a * input.b;
                    System.out.println("Result: "+ result);
                    break;

                case '/':
                    result = input.a / input.b;
                    System.out.println("Result: "+result);
                    break;
                default:
                    System.out.println("Invalid operator");
            }


        }

    }



}
