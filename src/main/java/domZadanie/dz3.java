package domZadanie;


import java.util.Arrays;

//Дан массив nums = [3,2,2,3] и число val = 3.
//Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
//Таким образом, первые несколько (или все) элементов массива должны быть
//отличны от заданного, а остальные - равны ему.
public class dz3 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int[] array = new int[nums.length];
        int count =0;
        int valcount= 0;
        System.out.println(Arrays.toString(nums));
        for (int i =0; i<nums.length; i++) {
            if (nums[i] != val) {
                array[count] = nums[i];
                count++;
            }
            else { valcount++;

            }
            for (int j= (array.length-valcount); j<array.length; j++){
                array[j]=val;
            }
        }
        System.out.println(Arrays.toString(array));
    } }
