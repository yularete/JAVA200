package intermediate2;

public class S78StringArray {
    public static void main(String[] args) {
        String[] myNum = new String[]{"2016-07-14", "2016-08-14", "2016-09-14"}; //동적 배열을 생성하고 초기화한다.
        String[] myNum2 = {"2016-07-14", "2016-08-14", "2016-09-14"};//정적 배열을 생성하고 초기화한다.
        System.out.println(myNum2[0]); //myNum2의 0번째 문자열 "2016-07-14"을 출력한다.
        print(myNum); //향상된 for문을 이용하여 myNum의 모든 문자열을 출력한다.
        // myNum2={"2016-07-14", "2016-08-14", "2016-09-14"}; //정적 배열은 다시 초기화 불가
        myNum = new String[]{"2016-07-14", "2016-08-14", "2016-09-14", "2016-10-14"}; //동적 배열은 다시 초기화 할 수 있따. 새로운 문자열 배열을 생성하고 초기화한다.
        String[] tos = new String[myNum.length];//myNum의 배열 크기과 같은 문자열 배열을 선언, 생성한다. 참조 타입의 배열은 자동 초기화가 되지 않아서 tos의 요소들은 모두 null이다 !
        System.arraycopy(myNum, 0, tos, 0, myNum.length); //myNum의 문자열 배열 중에서 tos에 0번째부터 3번째까지 총 4개를 복사한다. myNum과 tos는 같은 배열값을 갖는 서로 다른 문자열 배열이 된다.
        print(tos);
    }

    public static void print(String[] tos) {
        for (String ss : tos) {//향상된 for는 0부터 개수만큼 순서대로 호출하며, 인덱스(위치) 없이 사용할 수 있는 for이다.
            System.out.printf(ss + "\t");
        }
        System.out.println();
    }
}
/*나와 관련된 날짜 문자를 저장하려면 문자열 배열을 사용한다.
모든 동적 배열은 다시 초기화가 가능하고, 정적 배열은 다시 초기화가 불가능하다.
배열에서 길이는 length, 복사는 System.arraycopy()를 이용한다.
*/