/*Задано уравнение вида q + w = e, где q, w, e >= 0. 
Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. 
Требуется восстановить выражение до верного равенства. 
Предложить хотя бы одно решение или сообщить, что его нет.*/
public class hw_task4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            if ((2 * 10 + i + i * 10 + 5 == 69)) {
                System.out.print("? = " + i + " => 2" + i + " + " + i + "5 = 69");
            }
        }
    }
}