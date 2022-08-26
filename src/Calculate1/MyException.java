package Calculate1;

public class MyException extends Exception{
     public static void myExceptionNumber(int number) throws RuntimeException {
        if (number > 10 | number < 0) {
            throw new IllegalArgumentException ("Êèğèçèëãåí ñàí 0 äîí æîãîğó  æàíà 10 äîí êè÷èíå áîëóóøó çàğûë " + number);
                }
            }
}
