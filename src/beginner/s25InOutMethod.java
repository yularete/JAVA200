package beginner;

import java.util.Scanner;

public class s25InOutMethod {
    public static void main(String[] args) {
        //간단한 데이터를 키보드로 입력받을 때 Scanner 사용. 기본 메서드는 nextXXX()형태를 취한다. 입력받으려는 타입과 next 타입()이 맞지 않으면 "NumberFormatException"이 발생.
        //대량의 데이터를 다룰 때는 Java.io(IO)를 사용.

        //Scanner는 java.util 패키지에 있는 클래스이다. 키보드를 통해 입력받기 위해 Scanner 객체 생성
        Scanner scann = new Scanner(System.in);

        System.out.println("정수를 입력하세요.");
        int choice = scann.nextInt(); //키보드로 콘솔에 정수 입력
        System.out.println(choice);

        System.out.println("실수를 입력하세요.");
        double rchoice = scann.nextDouble();
        System.out.println(rchoice);

        System.out.println("문자열을 입력하세요");
        String schoice = scann.next();
        System.out.println(schoice);
    }
    // 연산은 기본적으로 왼쪽에서 오른쪽으로 실행되며, -9와 같은 부호 연산자가 가장 먼저 연산된다. 명확하지 않은 경우에는 ()를 이용해 우선순위를 명확하게 한다.
    /*
    ~연산순위~
    1. 문자는 ''로, 문자열은 ""로 표현. 문자의 배열을 이용해 문자열을 만들기 때문에 문자와 문자열의 변환 관계는 매 우 중 요.
    2.  - length(): 문자열의 길이를 반환한다.
        - indexOf(): 해당 문자나 문자열이 있는 위치(index)를 반환한다.
        - charAt(index) : index 위치의 문자를 반환한다.
    3.  - *,/,%는 연산순위가 동일하다.
        - -, + 는 연산순위가 동일하다.
        - *,/,%는 -, + 보다 연산순위가 높아 먼저 연산한다.
     */
}
