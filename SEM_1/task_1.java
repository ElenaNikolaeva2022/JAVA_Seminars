/**
 * Написать программу, которая запросит пользователя ввести
 * <Имя> в консоли.
 * Получит введенную строку и выведет в консоль сообщение 
 * "Привет, <Имя>!"
 */

// // Вариант 1

// package SEM_1;

// import java.util.Scanner;

// public class task_1 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         String name = scanner.next();
//         System.out.println("Hello, " + name + "!");

//     }
// }

// Вариант 2
package SEM_1;

import java.util.Scanner;

public class task_1 {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s\n", name);
        iScanner.close();
    }
}
