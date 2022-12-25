// Калькулятор с памятью
import java.util.Scanner;
import java.util.Vector;


public class hw_task13 {
    public static void main(String[] args) {
        private Scanner userInput = new Scanner(System.in);
        private boolean keepOn = true;
        private String yesOrNo;
        public Vector<Double> calculations = new Vector<>();

        public String chooseOperator() {
        System.out.println("What to do?" +
                "\n + for add" +
                "\n - for minus" +
                "\n * for multiply" +
                "\n / for divide");
        String operator = userInput.next();
        return operator;
        }

        public double getFirstNumber() {
            System.out.println("Input the 1st number");
            return userInput.nextDouble();
        }

        public double getSecondNumber() {
            System.out.println("Input the 2nd number");
            return userInput.nextDouble();
        }

        public void addition(double a, double b){
            calculations.addElement(a + b);
            System.out.println("The Num is: " + (a + b));
        }

        public void sub(double a, double b){
            calculations.addElement(a - b);
            System.out.println("The Num is: " + (a - b));
        }
        
        public void division(double a, double b){
            calculations.addElement(a / b);
            System.out.println("The Num is: " + (a / b));
        }

        public void mult(double a, double b){
            calculations.addElement(a * b);
            System.out.println("The Num is: " + (a * b));
        }

        public void showMenu() {
            int z = 0;
            while (z != 1){ 
            System.out.println("Please press the corresponding number for the operation you wish to perform.");
            System.out.println("1. Another operation?");
            System.out.println("2. History?");
            System.out.println("3. Exit?");
            yesOrNo = userInput.next();
            if(yesOrNo.equals("1")) {
                z = 1;
                calculate();
            }
            else if (yesOrNo.equals("3")) {
                z = 1;
                keepOn = false;
                exitMessage();
            }
            else if (yesOrNo.equals("2")){
                loadHistory();
            }
            }
        }

        public void loadHistory() {
            System.out.println("Log : ");
            for (int i = 0; i < calculations.size(); i++){
            System.out.println(calculations.get(i));
            }
        }

        public void exitMessage() {
            System.out.println("The result : ");
            for (int i = 0; i < calculations.size(); i++){
            System.out.println(calculations.get(i));
            }
        }

        public void calculate() {
            int x = 0; 
            int y = 0; 
            String operation;
            while (x < 1) {
                operation = chooseOperator();
                if(operation.equals("+")){
                    double num1 = getFirstNumber();
                    double num2 = getSecondNumber();
                    addition(num1, num2);
                    x = 1;
                }
                else if (operation.equals("-")) {
                    double num1 = getFirstNumber();
                    double num2 = getSecondNumber();
                    sub(num1, num2);
                    x = 1;
                }
                else if (operation.equals("/")) {
                    double num1 = getFirstNumber();
                    double num2 = getSecondNumber();
                    division(num1, num2);
                    x = 1;
                }
                else if (operation.equals("*")) {
                double num1 = getFirstNumber();
                double num2 = getSecondNumber();
                mult(num1, num2);
                x = 1;
                }
            }
            if (x == 1) {
            showMenu();
            }
        } 
    }
}

