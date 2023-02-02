package utilize2.s108;
import utilize2.s105.Card;
import utilize2.s106.CardUtil;
import utilize2.s107.CardComp;
import utilize2.s107.CardRomp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class CardCase {
    private List<utilize2.s105.Card> cards = new ArrayList<>();
    //s106 CardCase에 추가
    public void shuffle(){
        Collections.shuffle(cards);
    }
    public void print(){
        int valu = CardUtil.VALU.length;
        for(int i = 0; i<cards.size();i++){
            utilize2.s105.Card c = cards.get(i);
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
            utilize2.s105.Card c = new Card();
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
    //sort를 Lambda로 구현
    public void lambdasort(){//리스트.sort()메서드는 Comp 인터페이스의 compare() 메서드를 구현한 클래스의 객체를 대입하면 대소 비교 기준이 생겨 정렬이 가능하다. 여기서 sort() 메서드는 Comp 인터페이스의 compare() 메서드를 사용한다는 점을 알고 있다면 클래스와 메서드 이름을 명시적으로 사용하지 않고 간략하게 사용할 수 있다.
        cards.sort((c1,c2)->{return c1.getCardVal().compareTo(c2.getCardVal());});
    }
    //rsort를 Lambda로 구현
    public void lambdarsort(){
        cards.sort(
                (c1,c2)->{return -c1.getCardVal().compareTo(c2.getCardVal());});
    }
}
//java.util.Comparator 인터페이스를 구현한 객체는 비교할 수 있는데, Comparator 인터페이의 compare() 메서드를 구현하면 객체의 대소 비교 기준이 제공되므로 비교가 가능하다.
//그러나 Comparator 인처페이스를 구현한 클래스를 만들어야 하는 복잡한 일이 발생한다.
//해당 클래스에 메서드가 한 개만 있따면 함수 형식(클래스와 메서드 없이 사용, 식별자 없이)을 이용하여 간략한 방식으로 클래스 없이 비교 기준을 제공하는 람다 표현 방법을 사용할 수 있다.
//다음의 단계별 설명을 통해 람다 표현 방식을 이해하자.

//1) Comparator 인터페이스를 구현한 객체를 정렬 기준으로 사용한다.

/*public class CardComp implements Comparator<Card>{
    @Override
    public int compare(Card c1, Card c2){
        //문자열 compareTo() -사전식 비교
        return c1.getCardVal().compareTo(c2.getCardVal());
    }
}
cards.sort(new CardComp());*/

//2) Comparator 인터페이스를 구현하면서 객체를 생성한다.
/*  new Comparator<Card>(){ compare(Card c1, Card c2)){}} , "new 인터페이스(){메서드 구현()}" 처럼 인터페이스의 메서드를 구현하면서 생성할 수 있다.

    Comparator<Card> cmp = new Comparator<Card>() {
    @Override
    public int compare(Card o1, Card o2) {
        return o1.getCardVal().compareTo(o2.getCardVal());
    }
};
    cards.sort(cmp);

//3) new Comparator<Card>() { compare(Card c1, Card c2)){}}를 레퍼런스 대신 대입한다. 레퍼런스없는(이름 없는 ) 익명 클래스를 만든다.
    cards.sort( new Comparator<Card>(){
        @Override
        public int compare(Card c1, Card c2){
            return c1.getCardVal().compareTo(c2.getCardVal());
        }
    });

//4) 해당 클래스에 메서드가 한 개라면 함수 형식(클래스와 메서드 없이 사용, 식별자 없이)을 이용하여 간략화해도 어떤 객체의 어떤 메서드가 호출되었는지 알 수 있다.
    이 방법을 이용하는 것이 람다 표현식이다. 클래스와 메서드를 삭제(식별자 삭제)하고 메서드의 () 이후 부분을 남기면 (){}이 된다.
    ()와 {}사이에 클래스, 메서드가 삭제된 것을 표시하기 위해서 ->를 넣으면 ()->{}가 완성된다.
    cards.sort(
        (Card c1, Card c2) ->{return c1.getCardVal().compareTo(c2.getCardVal());}
            );

//5) 람다 표현에서 타입이 없어도 알 수 있으므로 타입을 제거할 수 있다.
    cards.sort((c1,c2)->{return c1.getCardVal().compareTo(c2.getCardVal());}}); */
