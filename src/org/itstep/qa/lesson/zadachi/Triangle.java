package org.itstep.qa.lesson.zadachi;
//Решить задачу об определении площади треугольника по трем сторонам. Длины сторон вводить с клавиатуры.
// Проверку корректности ввода реализовать через обработку исключений.
// Проверку корректности длин сторон организовать через обработку исключений. (Выбросить собственное исключение).
import java.util.Scanner;
import java.util.InputMismatchException;
public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        try {
            System.out.println("Введите  первую сторону: ");
            a = scanner.nextInt();
            System.out.println("Введите  вторую сторону: ");
            b = scanner.nextInt();
            System.out.println("Введите  третью сторону: ");
            c = scanner.nextInt();
        }catch (InputMismatchException ex){
            ex.printStackTrace();
        }
        int p = (a+b+c)/2;
        int s = (int) Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("Площадь треугольника равна: " + s);
    }
}
//дальше не успела