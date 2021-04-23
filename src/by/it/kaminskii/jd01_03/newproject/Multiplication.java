package by.it.kaminskii.jd01_03.newproject;/* created by Kaminskii Ivan
 */

public class Multiplication {

    static double[] mul(double[][] matrix, double[] vector) {
        if (matrix[0].length == vector.length) {
            double[] res = new double[matrix.length];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < vector.length; j++) {
                    res[i] += matrix[i][j] * vector[j];
                }
            }
            return res;
        }
        throw new RuntimeException("Error: Длинна массивов не совпадает");
    }

    static double[][] mul(double[][] matrixLeft, double[][] matrixRight) {
        if (matrixLeft.length == matrixRight[0].length) {
            double[][] res = new double[matrixLeft.length][matrixRight[0].length];
            for (int i = 0; i < matrixLeft.length; i++) {
                for (int j = 0; j < matrixRight[0].length; j++) {
                    for (int k = 0; k < matrixRight.length; k++) {
                        res[i][j] += matrixLeft[i][k] * matrixRight[k][j];
                    }
                }
            }
            return res;
        }
        throw new RuntimeException("Error: Длинна матриц не совпадает");
    }
}
