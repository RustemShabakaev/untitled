package domZadanie;
// Написать метод, который определяет, является ли год високосным, и возвращает
// boolean (високосный - true, не високосный - false). Каждый 4-й год является
// високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

import java.util.Scanner;
public class dz2 {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        System.out.println("Введите год: ");
        int year = in1.nextInt();
        if (year%4==0 & year>100){
            if(year%100==0){
                if (year%100==0 & year%400==0){
                    boolean res= year%4==0;
                    System.out.println(res);

                }
                else{
                    boolean res= year%400==0;
                    System.out.println(res);
                }

            }
            else {
                boolean res= year%100==0;
                System.out.println(res);
            }

        }
        else {
            boolean res= year%4==0;
            System.out.println(res);
        }

    }
}
