/*Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, 
используя StringBuilder. Данные для фильтрации приведены ниже в виде json строки.
Если значение null, то параметр не должен попадать в запрос.
Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"} */

import java.util.LinkedHashMap;
import java.util.Map;


public class hw_task5 {
    public static String formRequest(Map < String, String > params) {
        StringBuilder result = new StringBuilder();
        if (params == null || params.isEmpty())
            return result.toString();
        for (Map.Entry < String, String > pair : params.entrySet()) {
            if (pair.getKey() == null || pair.getValue() == null)
                continue;
            result.append(pair.getKey()).append(" is ").append(pair.getValue()).append(" in ");
        }
        if (result.length() > 4)
            result.delete(result.length() - 4, result.length());
        return result.toString();
    }
      
    
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("Name","Ivanov");
        map.put("country","Russia");
        map.put("city","Moscow");
        map.put("age",null);
        System.out.println(formRequest(map));
    }
}