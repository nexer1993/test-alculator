package by.nexer.calculator;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        String[] inputString = Validate.validateString(input);
        String result = Calculate.getResultCalculate(inputString);

        System.out.println(result);
        scan.close();
    }
}
