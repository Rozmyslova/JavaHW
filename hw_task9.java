/*
 * Задан целочисленный список ArrayList. Найти минимальное, 
 * максимальное и среднее из этого списка. 
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;


public class hw_task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a length of array  = ");
        int len = sc.nextInt();
        sc.close();
        Random random = new Random();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < len; i++) {
            int num = random.nextInt(0, 100);
            arr.add(num);
        }
        System.out.println("An array filled with random numbers: " + arr);
        int maxVal = Collections.max(arr);
        int minVal = Collections.min(arr);
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        float average = (float)sum/arr.size();
        System.out.println("Max element of array: " + maxVal);
        System.out.println("Min element of array: " + minVal);
        System.out.println("Average element of array: " + average);
    }
}
