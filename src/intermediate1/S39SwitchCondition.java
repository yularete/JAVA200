package intermediate1;

public class S39SwitchCondition {
    public static int toNum(char c) {
        int tot = 0; //'0'은 int로 48
        switch (c){
            case 'A':tot=1;break; //'A'는 65, 'a'는 97
            case 'T':tot=10;break;
            case 'J':tot=11;break;
            case 'Q':tot=12;break;
            case 'K':tot=13;break;
            default: tot=c-'0'; break; //57-48 = 9
        }
        return tot;
    }

    public static void main(String[] args) {
        char c='J';
        int result = toNum(c);
        System.out.printf("%c=>%d\n",c,result);
    }
}
