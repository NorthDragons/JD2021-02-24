package by.it.kishkar.jd01_01;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод (это вы вводите с клавиатуры):
34 26

Вывод (это должно появиться в консоли, обратите внимание на пробелы и слово Sum:
Sum = 60

*/
class TaskC1 {
    public static void main (String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Введите цифру");
        int a=in.nextInt();
        int b=in.nextInt();
        int result= a+b;
        System.out.println("Sum = " + result);

    }



}
