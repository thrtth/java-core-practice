package ru.thrtth;

public class Main {
    public static void main(String[] args) {

        int a = 2;
        int b = 3;
        double c = 2.5;

//      Арифметические операции
        System.out.println(a + b);
        System.out.println(b - a);
        System.out.println(a * b);
        System.out.println(b / a);

        System.out.println(c + a);
        System.out.println(c * a);
        System.out.println(c / a);

//      Логические операции
        System.out.println( b > a ? "b" : "a");

        if (b > a) {
            System.out.println("b больше a");
        } else {
            System.out.println("a больше b");
        }

        if (b > a && b > c) {
            System.out.println(a + b + c);
        } else {
            System.out.println(a + b);
        }

//      Максимальные и минимальные значения
        System.out.println("Минимальное float: " + Float.MIN_VALUE);
        System.out.println("Максимальное float: " + Float.MAX_VALUE);

        System.out.println("Минимальное double: " + Double.MIN_VALUE);
        System.out.println("Максимальное double: " + Double.MAX_VALUE);

        System.out.println("Плюс бесконечность: " + Double.POSITIVE_INFINITY);
        System.out.println("Минус бесконечность: " + Double.NEGATIVE_INFINITY);

        System.out.println("byte:  " + Byte.MIN_VALUE + " " + Byte.MAX_VALUE);
        System.out.println("short: " + Short.MIN_VALUE + " " + Short.MAX_VALUE);
        System.out.println("int:   " + Integer.MIN_VALUE + " " + Integer.MAX_VALUE);
        System.out.println("long:  " + Long.MIN_VALUE + " " + Long.MAX_VALUE);

//      Переполнение
        System.out.println(Double.MAX_VALUE * 5);

    }
}
