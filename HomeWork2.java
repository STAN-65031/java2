//  Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

package home_work_2;

import java.io.IOException;
import java.util.logging.*;

public class HomeWork2 {
    public static void main(String[] args) throws IOException {

        Logger logger = Logger.getLogger(HomeWork2.class.getName());
        FileHandler fh = new FileHandler("HW3.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        int[] arr = CreatesArray();
        ShowArray(arr);
        int[] res = Sorting(arr,logger);
        System.out.println();
        ShowArray(res);
    }

    public static int[] CreatesArray() {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0 + (int) (Math.random() * 100);
        }
        return arr;
    }

    public static int[] Sorting(int[] arr,Logger logger) {
        boolean isSorted = false;
        int buf = 0;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    isSorted = false;
                    logger.info("inter" + i);
                    buf = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = buf;
                }

            }
        }
        return arr;
    }

    public static void ShowArray(int[] arr) {
        for (int i : arr) {
            System.out.print(" " + i);
        }

    }
}