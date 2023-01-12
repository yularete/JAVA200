package intermediate1;

public class S40SwitchStringCondition {
    public static double toMoney(String c){
        double tot = 0.0;
        switch (c){                 //입력된 문자열에 따라 해당 case로 분기한다.
            case "USD":tot=1242.2;break;
            case "JPY":tot=95.2;break;
            case "GBP":tot=1515.2;break;
            default:tot=1;break;
        }
        return tot;
    }

    public static void main(String[] args) {
        String money="USD";
        double result = toMoney(money);
        System.out.printf("%s => %f\n",money,result); //%s는 문자열, %f는 실수를 대입
    }
}
