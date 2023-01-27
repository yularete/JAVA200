package utilize2.s106;

import utilize2.s106.Card;
import utilize2.s106.CardUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
public class CardCase {
    //aggregation : CardCase는 Card로 구성된다.
    private List<Card> cards = new ArrayList<>();
    public CardCase(){
        cards.clear();
    }
    //List 반환
    public List<Card> getCards(){
        return cards;
    }
    //List에 저장된 Card의 개수
    public int count(){
        return cards.size(); //저장된 Card 개수
    }
    //List의 index번째 Card
    public Card getCard(int index){
        return cards.get(index); //index번째 Card
    }
    // 서로 다른 카드 20장 만들기
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
}//
/*
ArrayList는 List를 Array로 구현한 클래스이다. add(객체) 메서드로 객체를 저장하면 입력받은 객체 순서대로 0부터 순서가 부여된다.
첫 번째로 add한 카드는 0, 두번째로 add한 카드는 1의 순서를 갖게 된다.
그래서 리스트.get(index)는 리스트에서 index번째 카드를 반환한다.
리스트.clear()는 리스트에 저장된 모든 객체를 제거한다.
리스트.contains(카드)는 입력받은 카드와 같은 카드가 있는지 확인한다.
"같은 값을 갖는 카드가 있따면 같은 객체다"라고 equlas() 오버라이딩했으므로 리스트.contains(카드)는 입력받은 카드가 리스트에 있다면 true를 반환한다.
*/