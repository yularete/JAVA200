package utilize2.s110;
public class CardRuleMain {
    public static void main(String[] args) {
        CardCase cc = new CardCase(); //카드 저장
        cc.make();
        CardRule rule = new CardRule(); //족보
        for(int i=0; i<5; i++){
            System.out.println("-----------------");
            cc.shuffle();
            cc.print();
            int a = rule.rule(cc.getCard(0), cc.getCard(2));
            int b = rule.rule(cc.getCard(1),cc.getCard(3));
            System.out.println(cc.getCard(0)+" "+cc.getCard(2)+" "+a);
            System.out.println(cc.getCard(1)+ " "+cc.getCard(3)+" "+b);
        }
        System.out.println("------------------------");
    }
}
