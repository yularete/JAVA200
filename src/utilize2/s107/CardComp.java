package utilize2.s107;
import utilize2.s105.Card;
import utilize2.s105.CardUtil;
import java.util.Comparator;
public class CardComp implements Comparator<Card> {
    @Override
    public int compare(Card c1, Card c2){
        //문자열 compareTo() - 사전식 비교
        if(c1.getCardVal().charAt(0)>c2.getCardVal().charAt(0)){
            return 1;
        } else if (c1.getCardVal().charAt(0)<c2.getCardVal().charAt(0)) {
            return -1;
        } else{
            if(CardUtil.toVal(c1.getCardVal().charAt(1))>CardUtil.toVal(c2.getCardVal().charAt(1))){
                return -1;
            } else return 0;
        }
    }
}
/*
기본 타입은 대소 비교를 할 수 있지만 객체는 원래 대소를 비교할 수 없다.
정수에 대해 3<4는 참이나, Card 객체1이 Card 객체2보다 작은지 큰지 판단할 수 없다.
그러나 java.util.Comparator 인터페이스를 구현한 객체는 비교할 수 있는데,
Comparator 인터페이스의 compare() 메서드를 구현하면 객체의 대소 기준이 제공되므로 비교가 가능하다.
*/