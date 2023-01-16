package intermediate2;

public class S62FormatTryCatch {
    public static void main(String[] args) {
        String sNum = "123";
        String nNum = "h";
        try {   // Integer,parseInt()는 정수 타입 문자열을 정수로 변환할 때 사용한다. 잘못된 타입을 변환하려고하면 NumberFormatException이 발생한다. 이를 대비하기 위해 try로 감싼다.
            int a = Integer.parseInt(nNum);
            System.out.println(a);
        } catch (NumberFormatException ee) { // NumberFormatException이 발생되면 예외를 처리한다.
            System.out.println("int가 맞는지 확인해 보세요."); //예외에 대한 내용을 출력한다.
            System.out.println(ee.getMessage());
        } catch (Exception ee) {
            //NumberFormatException 이외의 예외가 발생하면 예외를 처리한다. NumberFormatException 이외의 예외는 Exception이 모두 처리한다.
            //순서가 바뀌면 NumberFormatException까지 도달할 수 없어서 Unreachable Catch Block Error가 발생한다.
            System.out.println("다시 입력해보세요");
        } finally {        //예외가 발생하거나 발생하지 않아도 반드시 실행된다.
            System.out.println("저는 수행되고싶습니다.");
        }
    }
}
/*
문자열을 기본 타입으로 변환할 때는 랩퍼(Wrapper)클래스르 사용한다. "34"와 같은 정수형 문자열을 정수로 변환하려면 Integer.parseInt()를, "34.5"와 같은 실수형 문자열을 실수로 변환하려면 Double.parseDouble()을 사용한다.
이때 잘못된 변환을 사용하면 NumberFormatException이 발생한다. 예외가 발생할 수 있는 문장을 try{}에 넣고, 예외가 발생하면 catch(){}에서 처리하게 한다.
예외 처리는 예외를 안전하게 끝내는 것이 목적이므로 catch를 되도록 간단하게 작성한다.
*/