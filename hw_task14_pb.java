/*Реализуйте структуру телефонной книги 
с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.*/
import java.util.Scanner;


public class hw_task14_pb {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();
        while (true) {
            System.out.print("Input command (available - [ADD, PRINT, EXIT]): ");
            String command = input.nextLine();
            switch (command){
                case "ADD":
                    phoneBook.AddContact(input);
                    break;
                case "PRINT":
                    phoneBook.PrintContacts();
                    break;
                case "EXIT":
                    return;
                default:
                    System.out.println("Invalid command");
                    break;
            }
        }
    }
}
