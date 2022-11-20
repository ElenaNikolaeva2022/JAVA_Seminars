
// /**
//  * public String buildString(char c1, char c2, int n) { 
//  * 
//  * n - четное
//  * Создать строку, которая состоит из символов c1c2c1c2c1c2…c1c2,
//  * причем длина этой строки равна п return null;
//  * }
//  */

// // // ВАРИАНТ 1.
// // package SEM_2;

// // import java.util.Scanner;

// // public class task_1 {
// //     public static void main(String[] args) {
// //         Scanner iScanner = new Scanner(System.in);
// //         System.out.print("Insert char 1: ");
// //         char ch1 = iScanner.next().charAt(0);
// //         System.out.print("Insert char 2: ");
// //         char ch2 = iScanner.next().charAt(0);
// //         System.out.print("Insert number: ");
// //         int number = iScanner.nextInt();
// //         String ans = buildStr(ch1, ch2, number);
// //         System.out.println(ans);
// //         iScanner.close();
// //     }

// //     public static String buildStr(char c1, char c2, int n) {
// //         String ans = new String();
// //         if (n % 2 == 0 && n != 0) {
// //             for (int i = 0; i < n / 2; i++) {
// //                 ans = ans + c1 + c2;
// //             }
// //             return ans;
// //         } else {
// //             return null;
// //         }
// //     }
// // }

// /**
//  * в Терминале:
//  * Insert char 1: 2 (вводим цифру)
//  * Insert char 2: 3 (вводим цифру)
//  * Insert number: 8 (вводим цифру)
//  * 23232323         (Получаем ответ)
//  */

// // // ВАРИАНТ 2.
// // package SEM_2;

// // public class task_1 {
// //     public static void main(String[] args) {
// //         String string = buildString('a', 'b', 4);
// //         System.out.println(string);
// //     }

// //     public static String buildString(char c1, char c2, int n) {
// //         // n - четное
// //         // Создать строку, которая состоит из символов c1c2c1c2c1c2…c1c2,
// //         // причем длина этой строки равна п return null;
// //         return null;
// //     }

// // }
// // /**
// //  * в Терминале:
// //  * null
// //  */

// // // // ВАРИАНТ 3.
// // package SEM_2;

// // public class task_1 {
// //     public static void main(String[] args) {
// //         System.out.println(buildString('q', 'p', 20));
// //     }

// //     // n - четное
// //     // Создать строку, которая состоит из символов c1c2c1c2c1c2…c1c2,
// //     // причем длина этой строки равна п

// //     public static String buildString(char c1, char c2, int n) {
// //         StringBuilder builder = new StringBuilder();
// //         String res = "";
// //         for (int i = 0; i < n / 2; i++) {
// //             builder.append(c1).append(c2);
// //             res += c1 + "" + c2;
// //         }
// //         return builder.toString();
// //     }
// // }

// // /**
// //  * в Терминале:
// //  * qpqpqpqpqpqpqpqpqpqp
// //  */

// // // // ВАРИАНТ 4.
// // package SEM_2;

// // public class task_1 {
// //     System.out.println(buildString('q', 'p', 20));
// //     System.out.println(buildString('q', 'p', 19));
// //     System.out.println("End");
// // }
//     // п - четное
//     // Создать строку, которая состоит из символов c1c2c1c2c1c2…c1c2,
//     // причем длина этой строки равна п
//     public static String buildString(char c1, char c2, int n) {
//         if (n == 0 || n % 2 != 0) {
//             // return "";
//             // return null;
//             throw new IllegalArgumentException("Значение п " + n + " нехорректное");
//         }

//         StringBuilder builder = new StringBuilder();
//         // String res = "";
//         for (int i = 0; i < n / 2; i++) {
//             builder.append(c1).append(c2);
//             // res += c1 + "" + c2;
//         }

//         return builder.toString();
//     }
// }

