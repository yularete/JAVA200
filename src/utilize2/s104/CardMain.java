package utilize2.s104;

public class CardMain {
    public static void main(String[] args) {
        Card c1 = new Card("H4"); //H4 값을 갖는 카드 생성
        Card c2 = new Card("H4");//H4 값을 갖는 카드 생성
        Card c3 = new Card(c1);//H4 값을 갖는 카드를 생성하면서 c1과는 다른 카드 생성..
        System.out.println(c1.hashCode()); //c1의 해시코드를 출력, new로 생성한 객체는 해시코드가 같을 수 없다.
        System.out.println(c2.hashCode());
        System.out.println(c1.getCardVal());//카드값 문자열 "H4"를 반환.
        System.out.println(c2.getCardVal());
        System.out.println(c1.equals(c2));//new로 생성한 객체는 해시코드가 같을 수 없다.
        System.out.println(c2.equals(c3)); //복사 생성자는 카드값이 같지만 해시코드가 다른 객체를 생성한다.
        //2x10 =20개의 카드 객체를 생성하여 카드값을 출력한다. New로 생성했으므로 모든 카드의 해시코드가 다르다.
        //즉 서로 다른 객체 20개를 생성했다. 단 카드값은 중복될 수 있다.
        for (int i = 0; i < CardUtil.SUIT.length; i++) {
            for (int j = 0; j < CardUtil.VALU.length; j++) {
                //값은 같을 수 있지만, 해시코드는 고유하다.
                Card c = new Card(); //카드를 생성
                System.out.printf("%s\t", c); //카드값을 출력
            }
            System.out.println();
        }
    }
}
