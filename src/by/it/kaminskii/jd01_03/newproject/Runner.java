package by.it.kaminskii.jd01_03.newproject;/* created by Kaminskii Ivan
 */

import by.it.kaminskii.jd01_03.old.Helper;
import by.it.kaminskii.jd01_04.InOut;

import java.util.Arrays;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        double[] array = by.it.kaminskii.jd01_04.InOut.getArray(str);

        double[][] arrayMatrix = new double[2][2];
        for (int i = 0; i < arrayMatrix.length; i++) {
            for (int j = 0; j < arrayMatrix.length; j++) {
                arrayMatrix[i][j] = scanner.nextDouble();

            }

        }


        by.it.kaminskii.jd01_04.InOut.printArray(array);
        InOut.printArray(array, "V", 3);
        by.it.kaminskii.jd01_03.old.Helper.findMin(array);
        by.it.kaminskii.jd01_03.old.Helper.findMax(array);
        by.it.kaminskii.jd01_03.old.Helper.sort(array);
        Helper.mul(arrayMatrix, array);
    }
}
