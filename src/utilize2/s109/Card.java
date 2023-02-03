package utilize2.s109;

import utilize2.s104.CardUtil;

public class Card {
    private String cardVal;//H8
    public String getCardVal(){
        return cardVal;
    }
    public Card(){
        int deck = (int)(Math.random()* CardUtil.SUIT.length);
        int suit = (int)(Math.random()*CardUtil.VALU.length);
        //임의의 카드값을 갖는다 H6
        cardVal = CardUtil.SUIT[deck]+CardUtil.VALU[suit];
    }
    //테스트용
    public Card(String s){
        this.cardVal=s; //문자열 값 복사
    }
    //복사 생성자
    public Card(Card c){
        this(c.getCardVal());//문자열 값 복사
        //this.cardVal=c.getCardVal(); //동일
    }
    @Override
    public String toString(){
        return "["+cardVal +"]";
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result =1;
        result = prime * result + ((cardVal == null)? 0 : cardVal.hashCode());
        return result;
    }
    //소스를 정리하면 카드값과 카드값을 일대일로 비교한다.
    @Override
    public boolean equals(Object obj){
        Card cb = (Card)obj;
        if(cardVal.equals(cb.getCardVal())){
            return true;
        } else {
            return false;
        }
    }
    //추가된 static 비교 기준 메서드.
    public static int compareCard(Card c1, Card c2){
        return c1.getCardVal().compareTo(c2.getCardVal());
    }
    /*static 비교 메서드. c.getCardVal()은 카드값(카드 문자열)을 반환한다. compareTo()메서드는 두 카드값을 사전식으로 비교하여 양수이면 순서를 바꾸고, 음수이면 순서를 바꾸지 않는다.
    */
    public static int compareRCard(Card c1, Card c2){
        return -c1.getCardVal().compareTo(c2.getCardVal());
    }
}//
/*
new로 생성한 객체는 해시코드가 모드 다르기 때문에 같을 수 없다. 같은 값을 갖는 카드끼리도 카드1.equlas(카드2)는 false가 된다.
그래서 같은 값을 가지면 같은 객체로 만들어야 할 때 equals() 오버라이딩을 한다. 그리고 hashcode()도 오버라이딩해야한다.
 */
