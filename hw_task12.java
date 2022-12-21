/* Реализуйте очередь с помощью LinkedList со следующими методами: 
 * enqueue() - помещает элемент в конец очереди, 
 * dequeue() - возвращает первый элемент из очереди и удаляет его, 
 * first() - возвращает первый элемент из очереди, не удаляя. */
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.LinkedList;



public class hw_task12 {
    public static void main(String[] args) {
        int[] sourseArray = getArr();
        LinkedList<Integer> linkList = new LinkedList<>();
        for (Integer temp : sourseArray) {
            linkList.add(temp);
        }
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a num to add in array  = ");
        int num = scan.nextInt();
        scan.close();
        enqueue(linkList, num);
        System.out.println("Added num to the end : " + linkList);

        System.out.print("Finf the first element = "); 
        System.out.println(dequeue(linkList));
        System.out.println("Delete the first element : " + linkList);

        System.out.print("Return the first element of new array = ");
        System.out.println(first(linkList));
    }

    public static int[] getArr(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a length of array  = ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        Random random = new Random();
        for (int i = 0; i < len; i++) {
            arr[i] = 0 + random.nextInt(100);
        }
        System.out.println("An array filled with random numbers: " + Arrays.toString(arr));
        return arr;
    }

    public static void enqueue(LinkedList<Integer> list, int num) {
        list.addLast(num);
    }

    public static int dequeue(LinkedList<Integer> list) {
        int num = 0;
        num = list.get(0);
        list.remove(0);
        return num;
    }

    public static int first(LinkedList<Integer> list) {
        int num = 0;
        num = list.get(0);
        return num;
    }
}
