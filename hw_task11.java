/*Пусть дан LinkedList с несколькими элементами. 
Реализуйте метод, который вернет “перевернутый” список.*/
import java.util.LinkedList;


public class hw_task11 {
    public static void main(String[] args) {
        String [] sourceArray = {"year","2023","New","Happy"};
        LinkedList<String> linkList = new LinkedList<>();
        for (String temp : sourceArray) {
            linkList.add(temp);
        }
        int temp = 0;
        while (temp != linkList.size() - 1) {
            linkList.add(linkList.size()-temp, linkList.getFirst());
            linkList.removeFirst();
            temp++;
        }
        System.out.println("Inverted Array = " + linkList);
    }
}
