package Lesson_08;

import java.util.Scanner;

/**
 * Created by пк on 07.06.2015.
 */
public class Temp_08 {
    public static void main(String[] args) {

        String line;
        User_08 user = new User_08();
        Scanner in = new Scanner(System.in);

        System.out.println("Регистрация нового пользователя:");

        do {
            System.out.print("\tВведите ваше имя: ");
            try {
                user.setName(in.nextLine().trim());
            } catch (NullPointerException obj) {
                System.out.println(obj.getMessage());
            } catch (NoValueException obj) {
                System.out.println(obj.getMessage());
            }
        } while (user.getName().length() == 0);


        do {
            System.out.print("\tВведите ваш возраст: ");
            try {
                user.setAge(in.nextLine().trim());
            } catch (NumberFormatException obj) {
                System.out.println(obj.getMessage());
            } catch (NullPointerException obj) {
                System.out.println(obj.getMessage());
            } catch (ArithmeticException obj) {
                System.out.println(obj.getMessage());
            }

        } while (user.getAge() == 0);


        System.out.println("Здравствуйте " + user.getName() + ", " + user.getAge());
    }
}