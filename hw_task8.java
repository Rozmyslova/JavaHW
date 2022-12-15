//Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;


public class hw_task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a length of array  = ");
        int len = sc.nextInt();
        sc.close();
        Random random = new Random();
        ArrayList<Integer> sourceArray = new ArrayList<Integer>();
        for (int i = 0; i < len; i++) {
            int num = random.nextInt(-10, 10);
            sourceArray.add(num);
        }
        System.out.printf("An array filled with random numbers: %s\n", sourceArray);
        
        int i = 0;
        while (i < sourceArray.size()) {
            if (sourceArray.get(i) % 2 == 0) {
                sourceArray.remove(i);
            }
            else {
                i++;
            }
        }
        System.out.printf("A sorted array:  %s", sourceArray);
    }
}
