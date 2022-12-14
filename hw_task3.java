// Реализовать простой калькулятор

import java.util.logging.*;
import java.util.Scanner;
import java.io.*;


public class hw_task3 {
    /**
     * @param args
     */
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first number (by commas for float)  = ");
        Float num1 = sc.nextFloat();
        sc.nextLine();
        System.out.print("Choose an action (+ or - or * or /) ");
        String action = sc.nextLine();
        System.out.print("Enter a second number (by commas for float)  = ");
        Float num2 = sc.nextFloat();
        sc.close();
        float result = 0;
        if (action.equals("+")) {
            result = num1 + num2;
        }
        else if (action.equals("-")) {
            result = num1 - num2;
        }
        else if (action.equals("*")) {
            result = num1 * num2;
        }
        else if (action.equals("/")) {
            result = num1 / num2;
        }
        else {
            System.out.println("The action isn`t available");
        }
        System.out.println("The result " + num1 + " " + action + " " + num2 + " is " + result);  
                
        Logger logger;
        FileInputStream ins = new FileInputStream("log.config");
        LogManager.getLogManager().readConfiguration(ins);
        logger = Logger.getLogger("CalcLog");
        logger.log(Level.INFO,"The result " + num1 + " " + action + " " + num2 + " is " + result);
    }
} 
    

