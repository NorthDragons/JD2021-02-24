package by.it.kaminskii.jd01_03.old;


public class InOut {
    static double[] getArray(String line) {
        line = line.trim();
        String[] stringArray = line.split(" ");
        double[] returnArray = new double[stringArray.length];
        for (int i = 0; i < returnArray.length; i++) {
            returnArray[i] = Double.parseDouble(stringArray[i]);
        }
        return returnArray;
    }

    static void printArray(double[] array) {
        for (double value : array) {
            System.out.print(value + " ");

        }
        System.out.println();
    }

    static void printArray(double[] array, String name, int columnCount) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%s[% -3d]=%-10.4f ", name, i, array[i]);
            if ((i + 1) % columnCount == 0 || i == array.length - 1) {
                System.out.println();
            }
        }
    }
}
