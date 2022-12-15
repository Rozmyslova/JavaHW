/* Реализуйте алгоритм сортировки пузырьком числового массива, 
результат после каждой итерации запишите в лог-файл. */ 

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.*;


public class hw_task6 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        System.out.print("Enter a length of array  = ");
        int len = sc.nextInt();
        sc.close();
        int[] firstArray = new int[len];
        Random random = new Random();
        for (int i = 0; i < len; i++) {
            firstArray[i] = 0 + random.nextInt(10);
        }
        System.out.println("An array filled with random numbers: " + Arrays.toString(firstArray));

        int temp = 0;
        int[] sortedArray = firstArray;
        for (int i = len - 1; i > 0; i--) { 
            for (int j = 0; j < i; j++) { 
                if (sortedArray[j] > sortedArray[j + 1]) { 
                    temp = sortedArray[j]; 
                    sortedArray[j] = sortedArray[j + 1]; 
                    sortedArray[j + 1] = temp;
                }
            }
        }
        System.out.println("A sorted array: " + Arrays.toString(sortedArray));

        Logger logger = Logger.getLogger(hw_task3.class.getName());
        logger.setLevel(Level.INFO);
        ConsoleHandler ch = new ConsoleHandler();
        SimpleFormatter sFormat = new SimpleFormatter();
        ch.setFormatter(sFormat);
        logger.info("An array filled with random numbers: " + Arrays.toString(firstArray));
        logger.info("A sorted array: " + Arrays.toString(sortedArray));
	}
}
