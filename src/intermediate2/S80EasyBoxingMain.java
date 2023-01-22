package intermediate2;
import java.util.ArrayList;
//Boxing / UnBoxing
public class S80EasyBoxingMain {
    public static void main(String[] args) {
        int intNm1 = 123; //기본 타입에 값을 대입한다.
        long longNum1 =345L;
        double doubleNum = 123.123;
        Integer intWrap1 = intNm1; // new Integer(intNm1); 기본 타입에 저장된 값을 랩퍼 클래스 타입의 객체에 저장(박싱)한다. 랩퍼 클래스 객체를 생성하는 것과 같다.
        Long longWrap1 = longNum1; // new Long(longNum1);
        Double doubleWrap1 = doubleNum; // new Double(longNum1);
        double dd = doubleWrap1; // 랩퍼 클래스를 기본 타입으로 저장(박싱)한다.
        //기본 타입<-->Wrapper는 캐스팅 없이 사용
        Integer intWrap2 =intNm1; //Boxing //기본 타입을 랩퍼 클래스에 저장(박싱)한다.
        intNm1 = intWrap2; //UnBoxing // 랩퍼 클래스에 기본 타입의 값을 저장(언박싱)한다.
        System.out.println(intNm1);

        ArrayList<Integer> ilists = new ArrayList<>(); //향상된 배열(List)에 기본 타입을 저장할 때 랩퍼 클래스 타입으로 박싱해야 한다.
        ilists.add(new Integer(3)); //3을 저장하는 것과 같다..
        ilists.add(5); // new Integer(5)를 저장하는 것과 같다.
        int a=ilists.get(0); //0번 값을 반환한다. ilist.get(0)은 3, ilist.get(1)은 5를 반환한다.
        System.out.println(a);

        int b = Integer.parseInt("123"); //숫자 타입 문자열 "123"을 123으로 변환한다.
        System.out.println(b);
    }
}
/*
기본 타입을 랩퍼 클래스로, 랩퍼 클래스를 기본 타입으로 자동 변환한다. int와 Integer는 서로 자동변홚 나다.
List<>의 제네릭은 "참조 타입만 사용할 수 있다."는 문법 때문에 List<int>대신 List<Integer>를 사용한다.
*/