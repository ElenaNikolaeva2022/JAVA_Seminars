/**
 * Задан массив, например, nums = [1,7,3,6,5,6].
 * Написать программу, которая найдет индекс і для этого массива такой, 
 * что сумма элементов с индексами < і равна сумме элементов с индексами > і.
 */

// // ВАРИАНТ 1.
// package SEM_1;

// public class task_4 {
//     public static void main(String[] args) {
//         int[] numbers = { 1, 7, 3, 6, 5, 6 };
//         int median = findMedian(numbers);
//         System.out.println(median);
//     }

//     private static int findMedian(int[] numbers) {
//         // [al, a2, a3, a4, a5, a6, a7]

//         for (int i = 1; i < numbers.length - 1; i++) {
//             int left = 0;
//             int right = 0;

//             // 0, 1, 2, … i-1
//             for (int j = 0; j < i; j++) {
//                 left += numbers[j];
//             }

//             // i + 1, i + 2, … number.length - 1
//             for (int j = i + 1; j < numbers.length; j++) {
//                 right += numbers[j];
//             }

//             if (left == right) {
//                 return i;
//             }
//         }

//         return -1;
//     }
// }

// // ВАРИАНТ 2. Алгоритм, который работает быстрее

package SEM_1;

public class task_4 {
    public static void main(String[] args) {
        int[] numbers = { 1, 7, 3, 6, 5, 6 };
        int median = findMedian(numbers);
        System.out.println(median);
    }

    private static int findMedian(int[] numbers) {
        // [a1, a2, a3, a4, a5, a6, a7]

        int left = 0; // a1 + a2 + a3
        for (int i = 1; i < numbers.length - 1; i++) {
            left += numbers[i - 1];

            int right = 0; // a5 + a6 + a7
            // i + 1, i + 2, … number.length - 1
            for (int j = i + 1; j < numbers.length; j++) {
                right += numbers[j];
            }

            if (left == right) {
                return i;
            }
        }

        return -1;
    }
}
