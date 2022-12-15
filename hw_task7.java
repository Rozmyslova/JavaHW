//Реализовать алгоритм сортировки слиянием
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;


public class hw_task7 {
    public static void main(String[] args) {
        int[] sourseArray = getArray();
        int len = sourseArray.length;
        int[] resultArray = mergeSort(sourseArray, len);
        System.out.println("An result array: " + Arrays.toString(resultArray));
    }

    public static int[] getArray() {
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
        return arr;
    }

    public static int[] mergesortInner(int[] buffer1, int[] buffer2,
                int startIn, int endIn) {
        if (startIn >= endIn - 1) {
            return buffer1;
        }
        int mid = startIn + (endIn - startIn) / 2;
        int[] arr1 = mergesortInner(buffer1, buffer2, startIn, mid);
        int[] arr2 = mergesortInner(buffer1, buffer2, mid, endIn);
        int index1 = startIn;
        int index2 = mid;
        int destIndex = startIn;
        int[] result = arr1 == buffer1 ? buffer2 : buffer1;
        while (index1 < mid && index2 < endIn) {
            result[destIndex++] = arr1[index1] < arr2[index2]
                        ? arr1[index1++] : arr2[index2++];
        }
        while (index1 < mid) {
            result[destIndex++] = arr1[index1++];
        }
        while (index2 < endIn) {
            result[destIndex++] = arr2[index2++];
        }
        return result;
    }

    public static int[] mergeSort(int[] arr, int len) {
        int[] buffer1 = Arrays.copyOf(arr, len);
        int[] buffer2 = new int[len];
        int[] result = mergesortInner(buffer1, buffer2, 0, len);
        return result;
    }    

} 