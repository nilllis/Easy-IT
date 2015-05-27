package Lesson_04;

import java.util.Arrays;

/**
 * Created by пк on 27.05.2015.
 */
public class PrintAnyArray {

    public static void main(String[] args) {

        //двумерный массив
        int[][] arr2 = new int[5][2];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++)
                arr2[i][j] = (i * 10) + j;
        }
        System.out.println(Arrays.deepToString(arr2));

        //трехмерный массив
        int[][][] arr3 = new int[5][3][2];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                for (int n = 0; n < 2; n++)
                    arr3[i][j][n] = (i * 100) + (j * 10) + n;
            }
        }
        System.out.println(Arrays.deepToString(arr3));
    }
}
