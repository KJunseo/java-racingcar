package calculator;

import java.util.Scanner;

public class StringCalculatorApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        StringCalculator.splitAndSum(input);
        scanner.close();
    }
}