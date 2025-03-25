package bai3;

import java.util.Scanner;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên a: ");
        int a = sc.nextInt();
        System.out.print("Nhập số nguyên b: ");
        int b = sc.nextInt();

        BiFunction<Integer, Integer, Integer> addition = MathOperations::add;
        BiFunction<Integer, Integer, Integer> subtraction = MathOperations::subtract;
        BiFunction<Integer, Integer, Integer> multiplication = MathOperations::multiply;
        BiFunction<Integer, Integer, Double> division = MathOperations::divide;

        System.out.println(a + " + " + b + " = " + addition.apply(a, b));
        System.out.println(a + " - " + b + " = " + subtraction.apply(a, b));
        System.out.println(a + " x " + b + " = " + multiplication.apply(a, b));
        System.out.println(a + " / " + b + " = " + division.apply(a, b));

        sc.close();
    }
}
