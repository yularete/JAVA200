package utilize2.s103;
//객체 - 중요한 데이터를 저장
public class Card { //클래스를 선언한다 클래스는 설계도이다.
    // 데이터 보호-은닉화-접근 제한자 private
    private String cardVal;//H8,H6,・・・ 카드의 중요 데이터(멤버필드)로 카드값을 문자열 타입으로 선언한다. 접근 제한자를 private로 선언해 데이터를 보호
    //멤버 접근 메서드
    public String getCardVal(){ //카드값을 외부로 반환하는 메서드를 선언
        return cardVal;
    }
    //기본 생성자-멤버 초기화
    public Card(){ //기본 생성자를 선언
        this("H2"); //아래와 동일 //this("H2")는 16라인의 Card("H2")를 호출한다. 다른 생성자를 호출하면서 중요 데이터인 멤버필드를 H2로 초기화한다.
        //this.cardVal="H2";
    }
    //테스트용
    public Card(String s){//카드값을 입력받는 생성자를 선언. 이미 존재하는 생성자에 대해 아규먼트 개수나 타입이 다른 것을 생성자 오버로딩이라고 한다.
        this.cardVal=s; //문자열은 값 복사
    }
    //복사 생성자
    public Card(Card c) { //카드 생성자에 아규먼트로 카드 객체를 받는 것을 복사 생성자라고한다. 입력받은 다른 카드의 값만 받아 카드값을 초기화한다. 같은 값이지만 다른 객체를 만들 때 사용한다.
        this(c.getCardVal()); //문자열은 값 복사
        //this.cardVal=c.getCardVal(); //동일
    }
        // cardVal 내용 [H3
        @Override
        public String toString(){ //멤버필드의 값을 수정하지 않고 살펴볼 수 있는 toString()메서드를 오버라이딩한다.
            return "["+cardVal +"]";
    }//
}
/*
개발자가 만든 자바의 객체 타입은 다음과 같은 순서로 객체를 생성한다.
1. 클래스를 만든다. public class 클래스이름{}
2. 클래스 내부에 클래스의 중요 데이터를 타입과 함께 선언한다. 이때 선언한 데이터를 멤버필드라고한다.
    중요 데이터인 멤버필드를 보호하기 위하여 접근 제한자를 private로 선언한다.
3. 멤버필드를 가공하는 메서드인 멤버 메서드를 만든다. 멤버 메서드를 만든다.
    멤버 메서드를 직접 사용할 수 없게 private로 숨겨놨기 때문에 public 접근 제한자 메서드를 이용해 데이터를 수정하거나 삭제한다.
4. 이처럼 멤버필드를 숨겨서 데이터를 보호하는 것을 은닉화라고 한다.
5. new 키워드를 이용하여 객체를 생성한다.
 */