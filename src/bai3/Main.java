package bai3;

import java.util.Scanner;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so a: ");
        int n = sc.nextInt();
        System.out.println("Nhap so b: ");
        int m = sc.nextInt();
        Operation add = MathOperations::add;
        Operation subtract = MathOperations::subtract;
        Operation multiply = MathOperations::multiply;
        Operation divide = MathOperations::divide;
        System.out.println("Tong: "+add.apply(n, m));
        System.out.println("Hieu: "+subtract.apply(n, m));
        System.out.println("Tich: "+multiply.apply(n, m));
        System.out.println("Thuong: "+divide.apply(n, m));
    }
}
