package utilize2.s107;

import utilize2.s105.Card;
import utilize2.s105.CardUtil;

import java.util.Comparator;

public class CardRomp implements Comparator<Card> {
    @Override
    public int compare(Card c1, Card c2){
        //문자열 compareTo() -사전식 비교
        if(c1.getCardVal().charAt(0)>c2.getCardVal().charAt(0)){
            return -1;
        } else if(c1.getCardVal().charAt(0)<c2.getCardVal().charAt(0)){
            return 1;
        } else {
            if(CardUtil.toVal(c1.getCardVal().charAt(1))>CardUtil.toVal(c2.getCardVal().charAt(1))){
                return -1;
            }else if (CardUtil.toVal(c1.getCardVal().charAt(1))<CardUtil.toVal(c2.getCardVal().charAt(1))){
                return 1;
            }else return 0;
        }
    }
}
//CardComp와 거의 동일하나 값을 CardComp의 역순으로 정렬한다.