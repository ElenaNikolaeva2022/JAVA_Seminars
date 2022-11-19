// /**
//  * Дан массив двоичных чисел, например [1,1,0,1,1,1], 
//  * вывести максимальное количество подряд идущих 1.
//  */

// // ВАРИАНТ 1.
// package SEM_1;

// public class task_2 {
//     public static void main(String[] args) {
//         int[] array = { 1, 1, 0, 1, 1, 1 };
//         int result = method(array);
//         System.out.println(result);
//     }

//     private static int method(int[] array) {
//         int counter = 0; // 1
//         int bestCounter = 0; // 2
//         for (int i = 0; i < array.length; i++) {
//             if (array[i] == 1) {
//                 counter++;
//             } else {
//                 if (counter > bestCounter) {
//                     bestCounter = counter;
//                 }
//                 counter = 0;
//             }
//         }

//         if (counter > bestCounter) {
//             bestCounter = counter;
//         }

//         return bestCounter;
//     }
// }

// ВАРИАНТ 2.

package SEM_1;

public class task_2 {
    public static void main(String[] args) {
        int[] array = { 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1 };
        int result = method(array);
        System.out.println(result);
    }

    private static int method(int[] array) {
        int counter = 0; // 4
        int bestCounter = 0; // 2
        for (int x : array) {
            if (x == 1) {
                counter++;
            } else {
                if (counter > bestCounter) {
                    bestCounter = counter;
                }
                counter = 0;
            }
        }

        if (counter > bestCounter) {
            bestCounter = counter;
        }

        return bestCounter;
    }
}
