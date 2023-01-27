package utilize2.s105;
public class CardMain2 {
    public static void main(String[] args) {
        Card c1 =new Card("H4");
        Card c2 = new Card("H4");
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.getCardVal());
        System.out.println(c2.getCardVal());
        System.out.println(c1.equals(c2));
        //같은 값을 가질 때 같은 객체로 정의하고 싶다면 hashCode(), equals()를 오버라이딩하자.
    }
}
