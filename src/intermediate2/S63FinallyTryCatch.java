package intermediate2;

public class S63FinallyTryCatch {
    public static void main(String[] args) {
        try{    //예외가 발생할 수 있는 연산이 있으므로 try로 감싼다.
            int x =5;
            int y=20/(5-x); //분모가 0이 되어 ArithmeticException이 발생
            System.out.println(y);
        } catch (ArithmeticException e) { //run time
            //ArithmeticException이 발생하는 예외를 출력한다. ArithmeticException은 RuntimeException의 자식클래스로 실행할 때 발생한다.
            System.out.println("==>0으로 나눈게 맞는지 확인해 보세요."); // e.printStackTrace();
        } finally { //예외가 발생하거나 발생하지 않아도 반드시 실행된다.
            System.out.println("저는 수행되어야만 합니다.");
        }
    }
}
/*
Exception을 사용하면 프로그래밍에서 발생하는 문제를 유연하게 처리할 수 있다. Exception은 RuntimeException과 그 외의 예외(CompiletimeException)로 나눠진다.
RuntimeException은 실행시에 발생하는 예외로 잘못된 대입, 범위를 벗어난 배열, 잘못된 입력 형식, 수학 관련(0으로 나누는 등) 사항으로 인해 프로그램이 정확하게 작동되지 않는 경우에 발생한다.

finally는 정상 처리나 예외에 상관 없이 반드시 실행되는 블록이다. catch는 여러 개 있을 수 있지만 finally는 하나만 있어야 한다.
catch와 finally 중 적어도 하나는 사용해야 하지만, 자바7 이상에서 try()가 추가되어 finally 기능을 사용하지 않는 방법도 있다. 이를 AutoClosable이라고 한다.
java.io, java.sql 등 예외처리를 필수적으로 사용하는 클래스에 AutoClosable이 추가되었다.
*/