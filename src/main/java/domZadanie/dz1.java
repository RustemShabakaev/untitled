//Задать одномерный массив и найти в нем минимальный и максимальный элементы
package domZadanie;

public class dz1 {
    public static void main(String[] args) {
        int[] arr = {11,221,33,3,5};
        int min = arr[0];
        int max = arr[0];
        for (int num: arr) {
            if (num<min){
                min=num;
            }
            if (num>max){
                max=num;
            }
        }
        System.out.printf("Минимальное значение = %d", min);
        System.out.printf("\nМаксимальное число = %d", max);

    }
}