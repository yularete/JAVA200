package utilize2.s107;
import utilize2.s103.Card;

//static 변수, 메서드 - 객체 생성 없이 사용 가능하다.
public class CardUtil {
    public static final int SUTDA =2;
    public static final String[] SUIT = {"H","C"};//static이므로 객체 생성 않고 사용 가능.SUIT.length= 2
    public static final String[] VALU = {"A","2","3","4","5","6","7","8","9","T"}; //A~T까지 선언한 배열 선언. VALU.length=10
    public static int toVal(Card c){//카드 값의 1번째 값을 정수값으로 변환한다.
        return toVal(c.getCardVal().charAt(1)); //"H6"에서 '6'
    }
    public static int toVal(Card c, int index){
        return toVal(c.getCardVal().charAt(index));
    }
    public static int toVal(char cc){
        int tot = 0;
        switch (cc){ //입력 받은 value값은 char타입. 'A'일 때 1, 정수는 2~9값을 반환한다.
            case 'A':tot=1;break;
            case 'T':tot=10;break;
            case 'J':tot=11;break;
            case 'Q':tot=12;break;
            case 'K':tot=13;break;
            default:tot=cc-'0';break;
        }
        return tot;
    }
}
/*
static은 객체를 생성하지 않고 사용하기 위해 만든 키워드이다.
static이 붙은 메서드나 변수는 메서드나 변수는 '클래스 이름.메서드', '클래스이름.변수'처럼 사용한다.
*/