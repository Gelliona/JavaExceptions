import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String mydata = "";
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите Ваши данные (ФИО, дата рождения, телефон, пол: м/ж): ");
            mydata = scanner.nextLine();
        }
        CheckData ch = new CheckData(mydata);
        if (ch.getCorrect()) {
            File file = new File(ch.getSurname());
            try (FileWriter writer = new FileWriter(file, true);) {
                String data = ch.getSurname() + " " + ch.getName() + " " + ch.getSecondName() + " " + ch.getDate() + " "
                        + ch.getTelephone() + " " + ch.getGender() + " \n";
                writer.write(data);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}