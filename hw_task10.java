import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*Каталог товаров книжного магазина сохранен в виде двумерного списка 
List<ArrayList<String>> так, что на 0й позиции каждого внутреннего списка 
содержится название жанра, а на остальных позициях - названия книг. 
Напишите метод для заполнения данной структуры. */

/*
 * 1) заполнить map как в 5 задаче
 * 2) из ключей сделать list
 * 
 */

public class hw_task10 {
	public static void main(String[] args) {
        String[] comedy =  new String[] {"Один дома", "Отель Гранд Будапешт", "Маска", "Всегда говори ДА"};
        String[] cortoon =  new String[] {"Душа", "Зверополис", "Король Лев", "Тайна Коко", "Головоломка", "Зверопой"};
        String[] melodrama =  new String[] {"Титаник", "Амели", "Отпуск по обмену", "Привидение"};
        String[] detectiv =  new String[] {"Достать ножи", "Шерлок", "Настоящий детектив"};
        String[] fantasy =  new String[] {"Пираты Карибского моря", "Властелин колец", "Игра престолов"};
        String[] drama =  new String[] {"1+1", "Зеленая миля", "Форест Гамп", "Джокер"};
		Map<String, String> mapFilm = new LinkedHashMap<>();
        mapFilm.put("Комедии", comedy);
        mapFilm.put("Мультфильмы", );
        mapFilm.put("Мелодрамы",);
        mapFilm.put("Детективы", );
        mapFilm.put("Фэнтези", );
        mapFilm.put("Драма", );
        
        // получаем ключи из map
        Set<String> keys = mapFilm.keySet();
        System.out.println("Ключи: " + keys);
        // переводим set в list
        int lenKeys = keys.size();
        Object n;
        List<String> listGenre = new ArrayList<String>();
        for (String genre : keys)
            listGenre.add(genre);
        Map<String, String> passportsAndNames;
        //получение значения по ключу и создание своего списка для каждого ключа
        String lidiaName = passportsAndNames.get(212133);
        System.out.println(lidiaName);
        ArrayList<String> values = new ArrayList<>(mapFilm.values());
        System.out.println("Значения: " + values);
	}
}
