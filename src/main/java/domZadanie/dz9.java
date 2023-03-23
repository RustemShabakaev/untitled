package domZadanie;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.*;

//Написать программу, которая найдёт и выведет повторяющиеся имена с
//количеством повторений. Отсортировать по убыванию популярности.
public class dz9 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Иван Иванов");
        list.add("Светлана Петрова");
        list.add("Кристина Белова");
        list.add("Анна Мусина");
        list.add("Анна Крутова");
        list.add("Иван Юрин");
        list.add("Петр Лыков");
        list.add("Петр Чернышов");
        list.add("Павел Чернов");
        list.add("Мария Федорова");
        list.add("Марина Светлова");
        list.add("Мария Савина");
        list.add("Мария Рыкова");
        list.add("Марина Лугова");
        list.add("Анна Владимирова");
        list.add("Иван Мечников");
        list.add("Петр Петин");
        list.add("Иван Ежов");

        ArrayList<String> array = new ArrayList<>();
        Map<String, Integer> itog = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            String strMain = list.get(i);
            String[] arrSplit = strMain.split(" ");
            for (int j = 0; j < arrSplit.length; j++) {
                array.add(arrSplit[j]);
                break;
            }
        }
        Set<String> set = new LinkedHashSet<>(array);
        List<String> array1 = new ArrayList<>(set);
        int count = 0;
        for (int i = 0; i < array1.size(); i++) {
            for (int j = 0; j < array.size(); j++) {
                if (array1.get(i).equals(array.get(j))) {
                    count++;
                }
            }
            itog.put(array1.get(i), count);
            count = 0;
        }
        System.out.println(itog);
// Не знаю как отсартировать

    }

}
