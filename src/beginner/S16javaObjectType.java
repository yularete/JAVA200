package beginner;

import java.util.Calendar;
import java.util.Date;

public class S16javaObjectType {
    public static void main(String[] args) {
        //기본 타입의 배열은 참조 타입
        int[] m = {1,2,3}; // 기본 타입의 묶음인 배열도 참조 타입이다. 배열은 같은 타입의 나열이다.
        int[] n = new int[] {1,2,3}; // 배열도 String과 같이 new로 생성할 수 있고, new 없이도 생성할 수 있다.

        //참조 타입 - 객체 타입
        String card = "H8"; //문자열은 여러 문자(char)를 이용해 만든 참조 타입이다.
        Date d = new Date(); //오늘. 1970.1.1부터 현재까지 경과 시간을 long 타입으로 표현하는 참조 타입
        Calendar cal = Calendar.getInstance(); //오늘. 연월일을 정수로 입력할 수 잇는 참조 타입. 내부적으로 Calender cal = new Gregorian Calendar();처럼 생성됨

        //참조 타입의 레퍼런스를 출력할 때 자동으로 toString()이 붙어서 내부 정보(데이터)를 살펴볼 수 있다 !
        System.out.println(card); //card.toString()
        System.out.println(d);  //d.toString()
        System.out.println(cal); // cal.toString()
    }
}
