package utilize2.s103;
public class CardMain {
    public static void main(String[] args) {
        String csuit1 = "H", cvalu1 = "6"; //suit+value //카드의 그림을 나타나는 H와 값을 나타내는 6을 선언한다.
        String csuit2 = "H", cvalu2 = "3"; //suit+value //카드의 그림을 나타나는 H와 값을 나타내는 3을 선언한다.
        //객체 생성.."카드 레퍼런스=new Card();"형태로 객체를 생성한다. 앞의 카드는 클래스, 뒤의 카드는 힙 메모리에 생성된 객체, 카드()는 초기화하는 생성자. "카드 레퍼런스=new Card();"는 카드 타입의 객체를 생성하는 의미. H6 카드 값을 갖는 카드를 생성.
        Card c1 = new Card("H6");//생성자(String 아규먼트)H6 카드값을 갖는 카드를 생성한다. c1, c2 는 각 카드를 상요할 때 사용하는 이름과 같은 역할을 하는 레퍼런스이다. 생성된 객체는 c1.과 같이 .을 이용하여 사용한다.
        Card c2 = new Card(csuit1 + cvalu1);//생성자(String 아규먼트) H6
        Card c3 = new Card(); //기본 생성자로 카드를 생성한다. 카드값을 H2로 초기화한다.
        Card c4 = new Card(csuit2 + cvalu2); //생성자(String 아규먼트) H3 카드값을 갖는 카드를 생성한다.

        System.out.printf("%s,%s,%s,%s\n", c1, c2, c3, c4);
        System.out.println(c1.equals(c2)); //해시코드는 다름
        System.out.println(c1.getCardVal().equals(c2.getCardVal())); //값 동일
        //참조 타입은 equals()로 비교하세요.
    }
}
