// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)


import java.util.Scanner;


public class hw_task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number  = ");
        int num = sc.nextInt();
        System.out.println("Choose a number of action: 1 - triangular number, 2 - factorial ");
        int action = sc.nextInt();
        sc.close();
        if (action == 1) {
            int sum = 0;
            for (int i = 1; sum < num; i++){
                sum += i;
            }
            System.out.println("The sum is" + sum);
            if (sum == num){
                System.out.print("The number " + num + " is a triangular number");
                }
            else {
                System.out.print("The number " + num + " is NOT a triangular number");
            } 
        }
        else {
            int fact = 1;
            for (int i = 1; fact < num; i++){
                fact *= i;
            }
            System.out.print("The factorial of " + num + " is " + fact);
        }    
    }
}
