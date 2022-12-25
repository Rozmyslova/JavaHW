/*Написать программу, которая найдет и выведет 
повторяющиеся имена с количеством повторений. 
Отсортировать по убыванию популярности. */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


public class hw_task15_search {
    public static void main(String[] args){
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        HashMap<Integer, String> reverseMap = new HashMap<Integer, String>();
        ArrayList<Integer> ints = new ArrayList<>();
        String currentLine;
        String fileName = "/DASHA/Рабочая/Учеба Разработчик/JavaHW/JavaHW/list.txt";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            while ((currentLine = bufferedReader.readLine()) != null)
            {
               if (!map.containsKey(currentLine))
                   map.put(currentLine, 1);
               else
                   map.put(currentLine, map.get(currentLine) + 1);
            }
            for (String name : map.keySet()) {
                Integer buf = map.get(name);
                if (buf > 1){
                    ints.add(buf);
                    reverseMap.put(buf, name);
                }
            }
            ints.sort(Collections.reverseOrder());
            for (Integer id : ints){
                String bufName = reverseMap.get(id);
                System.out.printf("Name: %s number of repetitions: %s\n", bufName, id.toString());
            }
        } catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
