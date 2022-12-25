import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;


public class PhoneBook {
    public HashMap<String, String[]> book;
    public  PhoneBook(){
        book = new HashMap<String, String[]>();
    }
    public void AddContact(Scanner input){
        String name = this.checkInput("Input name of contact: ", "", input);
        String phones = this.checkInput("Enter phone numbers separated by spaces: ", "", input);
        String[] phoneNums = phones.split("\\s");
        this.book.put(name, phoneNums);
    }

    public String checkInput(String message, String badString, Scanner input){
        while (true){
            System.out.print(message);
            String in = input.nextLine();
            if (!in.equals(badString))
                return in;
            else
                System.out.printf("Bad input, line should not be <%s>\n", badString);
        }
    }

    public void PrintContacts(){
        for (String name : book.keySet()) {
            System.out.println("Name: " + name + " phones: " + Arrays.toString(book.get(name)));
        }
    }
}
