// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное
// значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно
// запросить у пользователя ввод данных.

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        view();
    }

    public static void view() {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите десятичное число: ");
        try {
            float num = iScanner.nextFloat();
            System.out.println("Вы ввели " + num);
        } catch (Exception e) {
            System.out.println("Неверный ввод!");
            view();
        }
    }
}