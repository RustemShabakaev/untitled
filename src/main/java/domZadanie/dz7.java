package domZadanie;
import java.util.*;
//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
public class dz7 {
    public static void main(String[] args) {
        LinkedList<String> list= new LinkedList<String>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        for (int i=0; i<list.size()/2; i++){
            String str = list.get(i);
            String str1 = list.get(list.size() - 1-i);
            list.set(i, str1);
            list.set(list.size() - 1-i, str);
        }
        System.out.println(list);

    }
}