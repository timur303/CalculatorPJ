package Calculate1;

import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;

public class Converter {
    public static Number convertRomanToArab(String value) {

        Number convertResult;

        if (isArab(value)) {
            convertResult = new Number(Integer.parseInt(value), false);
        } else {

            String symbol = value.toUpperCase();

            int previousSymbol = 0;
            int currentSymbol;
            int result = 0;
            for (int i = 0; i < symbol.length(); i++) {

                try {
                    currentSymbol = RomanNumber.valueOf(String.valueOf(symbol.charAt(i))).getValue();
                } catch (IllegalArgumentException e) {
                    throw new IllegalArgumentException("Киргизилген белги '" + symbol + "' Рим саны эмес ");
                }
                if (previousSymbol < currentSymbol)
                    result += currentSymbol  - 2 * previousSymbol;

                else
                    result += currentSymbol;

                previousSymbol = currentSymbol;

            }
            convertResult = new Number(result, true);
        }


        return convertResult;
    }

    static String convertArabToRoman(int value) {

        if (value <= 0) {
            throw new NumberFormatException();
        }
        StringBuilder result = new StringBuilder();
        EnumSet<RomanNumber> romanNumbers = EnumSet.allOf(RomanNumber.class); //Енам аркылуу келген Рим сандарын алабыз
        List<RomanNumber> collect = romanNumbers.stream().sorted(Comparator.reverseOrder()).toList();
        for (RomanNumber romanNumber : collect) {
            while (value - romanNumber.getValue() >= 0) {
                result.append(romanNumber);
                value -= romanNumber.getValue();
            }
        }

        return result.toString();
    }

    static boolean isArab(String number) {

        try {
            Integer.parseInt(number);
            return true;
        } catch (NumberFormatException e) {

            return false;
        }
    }
}


