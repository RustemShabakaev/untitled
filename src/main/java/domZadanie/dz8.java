package domZadanie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
public class dz8 {
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> phonebook= new  HashMap<>();
        phonebook.put("Sidorov", new ArrayList<>(Arrays.asList(98322654, 987325231,31631361)));
        phonebook.put("Petrov", new ArrayList<>(Arrays.asList(9874354, 9831231,3167261)));
        phonebook.put("Fazilov", new ArrayList<>(Arrays.asList(982327654, 98765231,313372361)));
        phonebook.put("Ivamov", new ArrayList<>(Arrays.asList(977654, 98312231,3168361)));

        for (String key : phonebook.keySet()) {
            System.out.println(key + ": "+ phonebook.get(key));
            System.out.println();
        }
    }}
