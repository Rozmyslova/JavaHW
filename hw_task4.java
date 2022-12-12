/*Задано уравнение вида q + w = e, где q, w, e >= 0. 
Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. 
Требуется восстановить выражение до верного равенства. 
Предложить хотя бы одно решение или сообщить, что его нет.*/


import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


/* Вариант решения для примера: 2? + ?5 = 69
public class hw_task4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            if ((2 * 10 + i + i * 10 + 5 == 69)) {
                System.out.print("? = " + i + " => 2" + i + " + " + i + "5 = 69");
            }
        }
    }
}*/


// Обобщенное решение для нахождения суммы чисел
public class hw_task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a equation in the form  2? + ?5 = 69 (this is example) = ");
        String equation = sc.nextLine();
        sc.close();
        int k = 0;
        for (int i = 1; i <=9; i++) {
            char b = (char)(i + '0');
            String eq = equation.replace('?', b);
            String[] nums = eq.split(" ");
            List<String> listElements = new ArrayList<>();
            for (String num : nums) {
                if (!(num.equals("+") | num.equals("="))) {
                    listElements.add(num);
                }
            }
            String[] array = new String[listElements.size()];
            listElements.toArray(array);
            int num1 = Integer.parseInt (array[0]);
            int num2 = Integer.parseInt (array[1]);
            int result = Integer.parseInt (array[2]);
            if (num1 + num2 == result) {
                k++;
                System.out.print("If ? = " + i + " the equation " + equation + " is solved");
            }
        }
        if (k == 0) {
            System.out.print("The equation " + equation + " isn`t solved");
        }
    
    }
}

