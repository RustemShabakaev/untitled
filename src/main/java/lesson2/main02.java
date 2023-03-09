//2. Напишите метод, который сжимает строку.
//        Пример: вход aaaabbbcdd.
package lesson2;

import java.util.Scanner;
public class main02 {

    public static void main(String[] args) {
        System.out.println(letterCount());
    }
    public static StringBuilder build(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        int limit  = in.nextInt();
        System.out.print("Введите первый элемент: ");
        String first = in.next();
        System.out.print("Введите второй элемент: ");
        String second = in.next();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < limit; i++) {
            sb.append((i % 2 == 0) ? first : second);
        }
        return sb;
    }
    public static StringBuilder letterCount(){
        StringBuilder sb = new StringBuilder();
        String str = "aaaabbbcddeee";
        int count = 1;
        for (int i = 0; i < str.length()- 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)){
                count++;
            }else {
                sb.append(str.charAt(i)).append(count);
                count = 1;
            }
        }
        sb.append(str.charAt(str.length()-1)).append(count);
        return  sb;
    }
}