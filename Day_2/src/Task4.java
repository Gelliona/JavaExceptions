// Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        userInput();
    }
    public static void userInput(){
        Scanner iScanner = new Scanner(System.in);
        try {
            System.out.println("Введите что-нибудь: ");
            String input = iScanner.nextLine();
            input = input.trim();
            if (input.isEmpty()) {
                throw new Exception();
            }
            System.out.println("Сообщение принято.");
        } catch (Exception e){
            System.out.println("Пустая строка недопустима!");
            userInput();
        }
    }

}
