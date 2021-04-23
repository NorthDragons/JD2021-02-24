package by.it.kaminskii.jd01_03.newproject;/* created by Kaminskii Ivan
 */

import java.util.Arrays;

public class InOut {

    static double[] getArray(String line) {
        line = line.trim();
        String[] stringsArray = line.split(" ");
        double[] doubleArray = new double[stringsArray.length];
        for (int i = 0; i < stringsArray.length; i++) {
            doubleArray[i] = Double.parseDouble(stringsArray[i]);
        }
        return doubleArray;
    }


    static void printArray(double[ ] arr){
        System.out.print(Arrays.toString(arr)+'\n');
    }

    static void printArray(double[ ] arr, String name, int columnCount){
        int col = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%s[%d]=%-7.4f",name,i,arr[i]);
            col++;
            if(col== columnCount){
                System.out.println();
            }
        }
    }

}
