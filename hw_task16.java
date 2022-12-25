//Реализовать алгоритм пирамидальной сортировки (HeapSort).
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;


public class hw_task16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a length of array  = ");
        int len = sc.nextInt();
        sc.close();
        int[] arr = new int[len];
        Random random = new Random();
        for (int i = 0; i < len; i++) {
            arr[i] = 0 + random.nextInt(100);
        }
        System.out.println("An array filled with random numbers: " + Arrays.toString(arr));

        HeapSort heap = new HeapSort();
        heap.sort(arr);
        System.out.println("An sorted array : " +Arrays.toString(arr));
    }
}
