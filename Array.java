package project;

import java.util.Arrays;
import java.util.Scanner;

class Analyze {
    private int[] analyzeArray;
    Analyze(int[] array) {
        this.analyzeArray = array;
    }
    public int getSize() {
        return analyzeArray.length;
    }
    public int sumElements() {
        int sum = 0;
        for (int i=0; i < analyzeArray.length; i++) {
            sum += analyzeArray[i];
        }
        return sum;
    }
    public int minElement() {
        int min = analyzeArray[0];
        for (int i=0; i < analyzeArray.length; i++) {
            if (min > analyzeArray[i]) min = analyzeArray[i];
        }
        return min;
    }
    public int maxElement() {
        int max = analyzeArray[0];
        for (int i=0; i < analyzeArray.length;i++) {
            if (max < analyzeArray[i]) max = analyzeArray[i];
        }
        return max;
    }
    public String getElementById(int id) {
        if (id > (analyzeArray.length-1)) return "Элемент с таким индексом не найден";
        else return Integer.toString(analyzeArray[id]);
    }
    public String sortToMax() {
        for (int left = 0; left < analyzeArray.length; left++) {
            int value = analyzeArray[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < analyzeArray[i]) analyzeArray[i + 1] = analyzeArray[i];
                else break;
            }
            analyzeArray[i + 1] = value;
        }
        return Arrays.toString(analyzeArray);
    }
    public String sortToMin() {
        for (int left = 0; left < analyzeArray.length; left++) {
            int value = analyzeArray[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value > analyzeArray[i]) analyzeArray[i + 1] = analyzeArray[i];
                else break;
            }
            analyzeArray[i + 1] = value;
        }
        return Arrays.toString(analyzeArray);
    }
}

public class Array {
    public static void main(String args[]) {
        System.out.print("Введите размер массива: ");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        System.out.print("Введите элементы массива: ");
        int[] array = new int[size];
        for (int i=0; i<size; i++) {
            array[i] = input.nextInt();
        }
        Analyze obj = new Analyze(array);
        System.out.println("Введенный массив: " + Arrays.toString(array));
        System.out.println("Размер введенного массива: " + obj.getSize());
        System.out.println("Сумма элементов массива: " + obj.sumElements());
        System.out.println("Минимальный элемент массива: " + obj.minElement());
        System.out.println("Максимальный элемент массива: " + obj.maxElement());
        System.out.print("Введите индекс элемента массива для поиска: ");
        int search = input.nextInt();
        System.out.println("Найденный элемент: " + obj.getElementById(search));
        System.out.println("Массив, отсортированный по увеличению: " + obj.sortToMax());
        System.out.println("Массив, отсортированный по уменьшению: " + obj.sortToMin());
        input.close();
    }
}