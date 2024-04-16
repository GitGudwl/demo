package com.calculator;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input operand pertama
        System.out.print("Masukkan operand pertama: ");
        int operand1 = scanner.nextInt();

        // Input operator
        System.out.print("Masukkan operator (+, -, *, /): ");
        String operator = scanner.next();

        // Input operand kedua
        System.out.print("Masukkan operand kedua: ");
        int operand2 = scanner.nextInt();

        // Validasi dan hitung
        Calculator calculator = new Calculator();
        int result = calculator.compute(operand1, operand2, operator);

        // Menampilkan hasil
        System.out.println("Hasil: " + result);

        scanner.close();
    }
}
