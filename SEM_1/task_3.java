/**
 * Во фразе "Добро пожаловать на курс по Java" 
 * переставить слова в обратном порядке.
 */

// // ВАРИАНТ 1.
// package SEM_1;

// public class task_3 {
//     public static void main(String[] args) {
//         System.setProperty("file.encoding", "UTF-8");
//         reverseAndPrint("Добро пожаловать на курс по Java");
//         System.out.println("I am like Java programs");
//     }

//     private static void reverseAndPrint(String str) {
//         String[] a = str.split(" ");
//         for (int i = a.length - 1; i >= 0; i--) {
//             // System.out.println(a[i]); // слова в столбик
//             System.out.printf("%s ", a[i]); // слова в строчку
//         }
//     }
// }

// ВАРИАНТ 2.
package SEM_1;

public class task_3 {
    public static void main(String[] args) {
        System.setProperty("file.encoding", "UTF-8");
        // System.out.println("Добро пожаловать на курс по Java");
        // System.out.println("I am like Java programs");

        reverseAndPrint("Добро пожаловать на курс по Java");
    }

    private static void reverseAndPrint(String str) {
        String[] words = str.split(" ");
        // for (int i = 0; i < words.length; i++) { // Добро пожаловать на курс по Java
        for (int i = words.length - 1; i >= 0; i--) { // Java по курс на пожаловать Добро

            // System.out.println(words[i]);    // (столбиком)
            System.out.printf(words[i] + " ");  // (строчкой)

        }
    }
}
