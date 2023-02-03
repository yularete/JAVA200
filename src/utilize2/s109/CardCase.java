package utilize2.s109;
import utilize2.s109.Card;
import utilize2.s106.CardUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CardCase {
    private List<Card> cards = new ArrayList<>();
    //s106 CardCase에 추가
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
    //s107.CardCased에 수정 및 추가
    //CardComp 클래스가 없다.
    public void sort(){
        Comparator<Card> cmp = new Comparator<Card>() { //Card 객체의 대소 비교를 위한 기준이 필요하다. 원칙대로라면 Comparator 인터페이스를 구현한 클래스를 만든 다음 객체를 생성해서 사용해야 하지만, 클래스를 만들지 않고도 Comparator 인터페이스에 {}를 붙여서 COmparator 객체를 생성할 수 있다.
            @Override
            public int compare(Card c1, Card c2) {
                return c1.getCardVal().compareTo(c2.getCardVal());
            }
        };
        cards.sort(cmp); //정렬 기준 객체를 넣어서 카드 리스트를 정렬한다.
    }
    //CardRomp 클래스가 없다.
    public void rsort(){
        // 익명 - anonymous
        cards.sort(new Comparator<Card>() { // 이름(레퍼런스)없는 익명 내부 클래스를 만든다. Comparator 인터페이스의 compare() 메서드를 구현하면서 객체를 생성한다. 여기서 레퍼런스 없이 객체를 생성하는 익명 내부 클래스 형태를 취한다.
            @Override
            public int compare(Card c1, Card c2) {
                return -c1.getCardVal().compareTo(c2.getCardVal());
            }
        });
    }
//    //sort를 Lambda로 구현
//    public void lambdasort(){//리스트.sort()메서드는 Comp 인터페이스의 compare() 메서드를 구현한 클래스의 객체를 대입하면 대소 비교 기준이 생겨 정렬이 가능하다. 여기서 sort() 메서드는 Comp 인터페이스의 compare() 메서드를 사용한다는 점을 알고 있다면 클래스와 메서드 이름을 명시적으로 사용하지 않고 간략하게 사용할 수 있다.
//        cards.sort((c1,c2)->{return c1.getCardVal().compareTo(c2.getCardVal());});
//    }
//    //rsort를 Lambda로 구현
//    public void lambdarsort(){
//        cards.sort(
//                (c1,c2)->{return -c1.getCardVal().compareTo(c2.getCardVal());});
//    }
    //sort를 Lambda로 구현
    public void lambdasort(){
        cards.sort((c1, c2)->{return c1.getCardVal().compareTo(c2.getCardVal());});
    }
    public void lambdasort2(){
        cards.sort(Comparator.comparing(Card::getCardVal)); //comparing
    }
    public void lambdasort3(){
        cards.sort(Card::compareCard);//static
    }
    //rsort를 Lambda로 구현
    public void lambdarsort(){
        cards.sort(
                (c1, c2) ->{ return -c1.getCardVal().compareTo(c2.getCardVal());});
    }
    public void lambdarsort2(){
        Comparator<Card> mycard = (c1,c2)->{return c1.getCardVal().compareTo(c2.getCardVal());};
        cards.sort(mycard.reversed());
    }
    public void lambdarsort3(){
        cards.sort(Card::compareRCard); //static
    }
}
