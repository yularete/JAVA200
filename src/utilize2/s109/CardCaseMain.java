package utilize2.s109;import utilize2.s109.CardCase;

public class CardCaseMain {
    public static void main(String[] args) {
        CardCase cc = new CardCase();
        cc.make();
        cc.print();
        System.out.println("-------------------");
        cc.shuffle(); //카드 섞기
        cc.print();
        System.out.println("----------------------");
        cc.shuffle();
        cc.print();
        System.out.println("--------------------");
        cc.sort();
        cc.print();
        System.out.println("---------------------");
        cc.rsort();
        cc.print();
        System.out.println("---------------------");
        cc.lambdasort();
        cc.print();
        System.out.println("--------------------");
        cc.lambdarsort2();
        cc.print();
        System.out.println("--------------------");
        cc.lambdarsort3();
        cc.print();
    }
}
