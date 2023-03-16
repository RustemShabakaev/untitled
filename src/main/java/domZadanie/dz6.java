package domZadanie;

import java.util.*;

//Реализовать консольное приложение, которое:
//        Принимает от пользователя и “запоминает” строки.
//        Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//        Если введено revert, удаляет предыдущую введенную строку из памяти.
public class dz6 {
    public static void main(String[] args) {
        boolean exit = false;
        ArrayList<String> list = new ArrayList<>();
        do {
            Scanner scan = new Scanner(System.in);
            System.out.print("Введите строку или exit для завершения: ");
            String text = scan.nextLine();
            System.out.println(text);
            if (text.equals("exit")) {
                exit = true;
                break;
            }

            if (text.equals("print")) {
                String str = list.get(0);
                String str1 = list.get(list.size() - 1);
                list.set(0, str1);
                list.set(list.size() - 1, str);
                System.out.println(list);
            }
            if (text.equals("revert")) {
                list.remove((list.size() - 1));
                System.out.println(list);

            } else {
                if (text.equals("print") | (text.equals("revert"))) {
                } else {
                    list.add(text);
                    System.out.println(list);
                }
            }
        } while (true);
    }
}
