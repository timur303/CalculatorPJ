package Calculate1;

import static Calculate1.MyException.myExceptionNumber;

public class Calculator {

   public static Number calculate(Number first, Number second, char operation)  {

        Number result = null;

        if (first.getIsRoman() != second.getIsRoman()) {
            throw new IllegalArgumentException("Араб саны менен рим санын бирге жазууга болбойт! ");
        }
        try {
            myExceptionNumber(first.getNumber());//текшерет 0 дон 10 чейин
            myExceptionNumber(second.getNumber());//текшерет 0 дон 10 чейин
            switch (operation) {
                case '+' -> result = new Number(first.getNumber() + second.getNumber(), first.getIsRoman());
                case '-' -> result = new Number(first.getNumber() - second.getNumber(), first.getIsRoman());
                case '*' -> result = new Number(first.getNumber() * second.getNumber(), first.getIsRoman());
                case '/' -> result = new Number(first.getNumber() / second.getNumber(), first.getIsRoman());
                default -> throw new NumberFormatException("Туура эмес корсотулду берилген амалдар");
            }
        }catch (NumberFormatException e){
            System.out.println("Not");
        }catch (IllegalArgumentException | ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }



        return result;
    }
}
