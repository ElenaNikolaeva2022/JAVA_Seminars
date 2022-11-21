
package SEM_1_HW;

public class task_1 {

    /**
     * 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n),
     * n! (произведение чисел от 1 до n)
     */
    public static void main(String[] args) {
        int n = 4;
        int triangleN = 0;
        int factorialN = 1;
        for (int i = 1; i <= n; i++) {
            triangleN += i;
            factorialN *= i;
        }
        System.out.println(triangleN);
        System.out.println(factorialN);
    }
}

//     /**
//      * 2. Написать метод, принимающий на вход два целых числа и проверяющий,
//      * что их сумма лежит в пределах от 10 до 20 (включительно),
//      * если да – вернуть true, в противном случае – false.
//      */

//     // 2.1.
//     public static boolean expressionCheck(int a, int b) {
//         return a >= 10 && b <= 20;
//     }

//     // 2.2.
// public static void main(String[] args) {
// int x = 8;
// int y = 10;

// if ((x + y) >= 10 && (x + y) <= 20) {
// System.out.println("true");
// } else {
// System.err.println("false");
// }
// }


//     /**
//      * 3. Написать метод, которому в качестве параметра передается целое число,
//      * метод должен напечатать в консоль, положительное ли число передали или
//      * отрицательное.
//      * Замечание: ноль считаем положительным числом.
//      */

//     // 3.1.

// public static void checkPositiveNegative(int a) {

// System.out.println(a >= 0 ? "Positive/n" : "Negative/n");
// }

//     // 3.2.

//     static void printPositiveOrNegative(int num) {
//         String word = "Положительное";
//         if (num < 0)
//             word = "Отрицательное";

//         System.out.println(word);
//     }

//     /**
//      * 4. Написать метод, которому в качестве параметра передается целое число.
//      * Метод должен вернуть true, если число отрицательное,
//      * и вернуть false если положительное.
//      */

//     public static boolean checkNegative(int a) {

//         return a < 0;
//     }

//     /**
//      * 5. Написать метод, которому в качестве аргументов передается строка
//      * и число, метод должен отпечатать в консоль указанную строку,
//      * указанное количество раз;
//      */

//     public static void printWordNTimes(String str, int n) {
//         for (int i = 1; i <= n; i++) {
//             System.out.println("[" + i + "]" + str);
//         }
//     }

//     /**
//      * 6. Написать метод, который определяет, является ли год високосным,
//      * и возвращает boolean (високосный - true, не високосный - false).
//      * Каждый 4-й год является високосным, кроме каждого 100-го,
//      * при этом каждый 400-й – високосный.
//      */

//     public static boolean checkLeapYear(int year) {
//         if (year % 400 == 0) {
//             return true;
//         } else if (year % 100 == 0) {
//             return false;
//         } else {
//             return year % 4 == 0;
//         }
//     }
// }
