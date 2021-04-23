package by.it.kaminskii.jd01_03.old;

import by.it.kaminskii.jd01_04.InOut;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        double[] array = InOut.getArray(str);

        double[][] arrayMatrix = new double[2][2];
        for (int i = 0; i < arrayMatrix.length; i++) {
            for (int j = 0; j < arrayMatrix.length; j++) {
                arrayMatrix[i][j] = scanner.nextDouble();

            }

        }


        InOut.printArray(array);
        InOut.printArray(array, "V", 3);
        Helper.findMin(array);
        Helper.findMax(array);
        Helper.sort(array);
        Helper.mul(arrayMatrix, array);
    }

}
