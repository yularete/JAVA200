package utilize2.s104;
public class Card { //클래스 선언
    private String cardVal; //H6, H8・・・ 카드의 중요 데이터(멤버필드)로 카드밧을 문자열 타입으로 선언. 접근 제한자를 private로 선언해 데이터를 보호
    public String getCardVal(){ //카드값을 외부로 반환하는 메서드를 선언
        return cardVal;
    }
    //기본생성자를 선언
    public Card(){
        //0~3, SUIT배열은 static이므로 객체 생성 않고 사용 가능.CardUtil.SUIT.length는 2이므로 deck은 0~1 사이의 임의 정수를 반환
        int suit=(int)(Math.random()*CardUtil.SUIT.length);
        //0~12 VALU 배열은 static이므로 객체 생성 않고 사용 가능.CardUtil.VALU.length는 10이므로 deck은 0~9 사이의 임의 정수를 반환
        int valu=(int)(Math.random()*CardUtil.VALU.length);
        //임의의 카드값을 갖는다. H8, H6・・・
        //SUIT 배열에서 0 또는 1인 suit와 VALU 배열에서 0~9 사이의 값인 valu 값을 조합하여 카드값을 만든다.
        cardVal=CardUtil.SUIT[suit]+CardUtil.VALU[valu];
    }
    //테스트용
    public Card(String s){
        this.cardVal=s; //문자열은 값 복사
    }
    //복사 생성자
    public Card(Card c){//다른 카드의 카드값만 가져온다.
        this(c.getCardVal()); //문자열은 값 복사
        //this.cardVal=c.getCardVal();과 동일
    }
    //cardVal 내용
    @Override
    public String toString(){
        return "["+cardVal +"]";
    }
}//
