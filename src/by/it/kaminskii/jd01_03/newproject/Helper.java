package by.it.kaminskii.jd01_03.newproject;/* created by Kaminskii Ivan
 */

public class Helper {
    static double findMin(double[] arr) {
        double min = arr[0];
        for (double v : arr) {
            if (v < min) {
                min = v;
            }
        }
        return min;
    }

    static double findMax(double[] arr) {
        double max = arr[0];
        for (double v : arr) {
            if (v > max) {
                max = v;
            }
        }
        return max;
    }

    static void sort(double[] arr) {
        boolean stop;
        do {
            stop = false;
            for (int i = 0; i < arr.length; i++) {

                if (i != arr.length - 1 && arr[i] > arr[i + 1]) {
                    double reverse = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = reverse;
                    stop = true;
                }
            }
        } while (stop);
    }

    static double[] mul(double[][] matrix, double[] vector){
       return Multiplication.mul(matrix,vector);
    }

    static double[][] mul(double[][] matrixLeft, double[][] matrixRight){
        return Multiplication.mul(matrixLeft, matrixRight);
    }

}
