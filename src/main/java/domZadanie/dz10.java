package domZadanie;
import java.util.ArrayList;
import java.util.Scanner;

public class dz10 {
    public static void main(String[] args) {
        ArrayList<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop("Lenovo", "3", "black", 8, 540.0));
        laptops.add(new Laptop("Asus", " 15", "grey", 16, 720.0));
        laptops.add(new Laptop("HP", "x360", "silver", 12, 630.0));
        laptops.add(new Laptop("Acer", "Swift 3", "blue", 8, 670.0));
        laptops.add(new Laptop("Dell", "13", "white", 16, 950.0));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите минимальный объем оперативной памяти (ГБ): ");
        int minMemory = scanner.nextInt();
        System.out.print("Введите цвет ноутбука: ");
        String color = scanner.next();

        System.out.println("Результаты поиска:");
        for (Laptop laptop : laptops) {
            if (laptop.getMemory() >= minMemory && laptop.getColor().equalsIgnoreCase(color)) {
                System.out.println(laptop.getBrand() + " " +
                        laptop.getModel() + " " +
                        laptop.getColor() + " " +
                        laptop.getMemory() + " ГБ " +
                        laptop.getPrice() + " $");
            }
        }
    }
}