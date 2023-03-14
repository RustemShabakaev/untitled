package domZadanie;
import java.util.Scanner;
//Напишите метод, который принимает на вход строку (String) и определяет
// является ли строка палиндромом (возвращает boolean значение).
public class dz4 {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String word= in1.next();
        int a = 0;
        for (int i=0; i<word.length()/2; i++){
            if(word.charAt(i) == word.charAt(word.length()-i-1)){
                a=0;
            }
            else {
                a=1;
                break;
            }
        }
        boolean b= a<1;
        System.out.println(b);
    }
}
