// Вывести все простые числа от 1 до 1000
import java.util.ArrayList;
import java.util.List;


public class hw_task2 {
    public static void main(String[] args) {
        List<Integer> listSimpNum = new ArrayList<>();
        for (int i = 2; i <= 1000; i++) {
            boolean isPrimeNumber = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
            if (isPrimeNumber) {
                listSimpNum.add(i);
            }
        }
        String allPrimeNumbers = listSimpNum.toString().replace("[", "").replace("]", "");
        System.out.println(allPrimeNumbers);
    }
}

