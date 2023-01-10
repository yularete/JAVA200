package intermediate1;

public class S28Biocalendar {

    public static final int PHYSICAL = 23;

    public static void main(String[] args) {
        int index = PHYSICAL;
        int days = 1200;
        double phyval = 100*Math.sin((days % index)*2*Math.PI/index);
        System.out.printf("나의 신체 지수 %1$.2f입니다.\n",phyval);
        // 문자열포맷 출력                 %1$= 1번째 인자를 , /.2f 2번째 소수점까지 출력하겠다.
    }
/*
1.  Math 클래스는 java.util 패키지에 있고, 이 클래스의 메서드는 대부분 static으로 객체 생성 없이 Math.메서드() 형식으로 사용한다. 대표적인 상수로 Math.PI(파이, 3.14), Math.E(지연지수, 2.718)가 있다.
    라디안을 각도로 변경하는 toDegrees(), 0과 1사이의 임의의 실수(0포함, 1미포함)를 만드는 random()도 Math 클래스에 속한다.
 */
}
