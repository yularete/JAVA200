package utilize2.s107;

import utilize2.s105.Card;
import utilize2.s106.CardUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardCase {
    private List<Card> cards = new ArrayList<>();
    //s106 CardCase에 추가
    public void sort(){
        cards.sort(new CardComp());
        //Collections.sort(cards,new CardComp());
    }
    public void rsort(){
        cards.sort(new CardRomp());
        ///Collections.sort(cards,new CardRomp());
    }
    public void shuffle(){
        Collections.shuffle(cards);
    }
    public void print(){
        int valu = CardUtil.VALU.length;
        for(int i = 0; i<cards.size();i++){
            Card c = cards.get(i);
            System.out.printf("%s",c.toString());
            if((i+1)%valu==0){
                System.out.println();
            }
        }
    }
    public void make(){
        cards.clear();
        int suit = CardUtil.SUIT.length;
        int valu = CardUtil.VALU.length;
        int count = 0;
        //서로 다른 20개의 카드를 만든다.
        while(count!=valu*suit){
            Card c = new Card();
            if(!cards.contains(c)){
                cards.add(c);
                count++;
            }
        }
    }
}
