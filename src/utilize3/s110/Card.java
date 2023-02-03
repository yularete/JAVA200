package utilize3.s110;
import utilize2.s107.CardUtil;
public class Card {
    private String cardVal; //H8
    public String getCardVal() {
        return cardVal;
    }
    public Card() {
        int deck=(int)(Math.random()*CardUtil.SUIT.length); // 0~1
        int suit=(int)(Math.random()*CardUtil.VALU.length); // 0~9
        //������ ī�� ���� ���´�. H6
        cardVal= CardUtil.SUIT[deck]+CardUtil.VALU[suit];
    }
    // �׽�Ʈ��
    public Card(String s) {
        this.cardVal=s;  // ���ڿ��� �� ����
    }
    // ���� ������
    public Card(Card c) {
        this(c.getCardVal());  // ���ڿ��� �� ����
        // this.cardVal=c.getCardVal(); //����
    }
    @Override
    public String toString() {
        return "[" + cardVal + "]";
    }
    // Eclipse-Source-Generate hashCode() and equals()�� �̿��Ͽ� �ڵ����� ������
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cardVal == null) ? 0 : cardVal.hashCode());
        return result;
    }
    // �ҽ��� �����ϸ�  ī�尪�� ī�尪�� �ϴ��Ϸ� ���Ѵ�.
    @Override
    public boolean equals(Object obj) {
        Card cb=(Card)obj;
        if(cardVal.equals(cb.getCardVal())){
            return true;
        }else{
            return false;
        }
    }
    // �߰��� static �� ���� �޼���
    public static int compareCard(Card c1, Card c2){
        return c1.getCardVal().compareTo(c2.getCardVal());
    }
    public static int compareRCard(Card c1, Card c2){
        return -c1.getCardVal().compareTo(c2.getCardVal());
    }
}