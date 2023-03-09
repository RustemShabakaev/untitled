package lesson1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);

        System.out.print("Enter a name");
        String name = in1.nextLine();
        System.out.print("Ваше имя: "+ name);
    }

}
