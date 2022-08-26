package Calculate1;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("Калькулятор эки сан менен кошуу, кемитуу, кобойтуу жана болуу \n" +
                "амалдарын аткара алат: a+b, a-b, a*b, a/b. \n" +
                "Маалыматтар бир сапта берилиши керек! ");

        Scanner calcScanner = new Scanner(System.in);
        String input = calcScanner.nextLine();


        calc(input); //жооп резултат
    }

    public static void calc(String input) {

        String[] oper = input.split("\\W");
        String[] operator = input.split("\\w");
        Number firstNumber = Converter.convertRomanToArab(oper[0]);
        Number secondNumber = Converter.convertRomanToArab(oper[1]);
        char symbol = operator[operator.length - 1].charAt(0);
        try {
            Number result = Calculator.calculate(firstNumber, secondNumber, symbol);
            System.out.println(result.toString());

        } catch (NullPointerException e) {
            System.out.println("net otveta");
        }


    }
}

