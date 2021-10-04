import java.util.Arrays;
import java.util.Scanner;

class Analyze {
    public void getSize(int[] array) {
        System.out.println("Размер введенного массива: " + array.length);
    }
    public void sumElements(int[] array) {
        int sum = 0;
        for (int i=0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Сумма элементов массива: " + Integer.toString(sum));
    }
    public void minElement(int[] array) {
        int min = array[0];
        for (int i=0; i < array.length; i++) {
            if (min > array[i]) min = array[i];
        }
        System.out.println("Минимальный элемент массива: " + Integer.toString(min));
    }
    public void maxElement(int[] array) {
        int max = array[0];
        for (int i=0; i < array.length;i++) {
            if (max < array[i]) max = array[i];
        }
        System.out.println("Максимальный элемент массива: " + Integer.toString(max));
    }
    public void getElementById(int[] array, int id) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите индекс элемента массива для поиска: ");
        int search = input.nextInt();
        if (id > (array.length-1)) System.out.println("Элемент с таким индексом не найден");
        else System.out.println("Найденный элемент: " + Integer.toString(array[search]));
        input.close();
    }
    public void sortToMax(int[] array) {
        for (int left = 0; left < array.length; left++) {
            int value = array[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < array[i]) array[i + 1] = array[i];
                else break;
            }
            array[i + 1] = value;
        }
        System.out.println("Массив, отсортированный по увеличению: " + Arrays.toString(array));
    }
    public void sortToMin(int[] array) {
        for (int left = 0; left < array.length; left++) {
            int value = array[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value > array[i]) array[i + 1] = array[i];
                else break;
            }
            array[i + 1] = value;
        }
        System.out.println("Массив, отсортированный по уменьшению: " + Arrays.toString(array));
    }
}
public class App {
    public static void main(String[] args) throws Exception {
    }
}
