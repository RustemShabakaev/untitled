//Дано четное число N (>0) и символы c1 и c2.
//        Написать метод, который вернет строку длины N,
//        которая состоит из чередующихся символов c1 и c2, начиная с c1
package lesson2;

import java.util.Scanner;
public class main01 {

    public static void main(String[] args) {
        System.out.println( build());
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
}