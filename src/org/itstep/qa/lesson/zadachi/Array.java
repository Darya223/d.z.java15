package org.itstep.qa.lesson.zadachi;
//Организовать ввод с клавиатуры массива элементов заданного типа (целых чисел). Проверку корректности ввода реализовать
// через обработку исключений. (Можно отслеживать InputMismatchException).
// В случае если пользователь ввел некорректное значение, заполнять соответствующую ячейку массива значением по умолчанию
import java.util.Arrays;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Array {
    public static void main(String[] args) {
        int[] array =  new int[6];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите массив целых чисел");
        for (int i = 0; i < array.length; i++) {
            try {
                array[i] = scanner.nextInt();

            } catch ( InputMismatchException ex) {
                scanner.nextLine();
            }
        }
        System.out.println(Arrays.toString(array));
    }
}


