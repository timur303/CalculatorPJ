package Calculate1;

import static Calculate1.MyException.myExceptionNumber;

public class Calculator {

   public static Number calculate(Number first, Number second, char operation)  {

        Number result = null;

        if (first.getIsRoman() != second.getIsRoman()) {
            throw new IllegalArgumentException("���� ���� ����� ��� ����� ����� ������� �������! ");
        }
        try {
            myExceptionNumber(first.getNumber());//�������� 0 ��� 10 �����
            myExceptionNumber(second.getNumber());//�������� 0 ��� 10 �����
            switch (operation) {
                case '+' -> result = new Number(first.getNumber() + second.getNumber(), first.getIsRoman());
                case '-' -> result = new Number(first.getNumber() - second.getNumber(), first.getIsRoman());
                case '*' -> result = new Number(first.getNumber() * second.getNumber(), first.getIsRoman());
                case '/' -> result = new Number(first.getNumber() / second.getNumber(), first.getIsRoman());
                default -> throw new NumberFormatException("����� ���� ���������� �������� �������");
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
