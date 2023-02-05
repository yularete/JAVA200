package utilize3.s124;
public class MoneyDeposit {
    //적금
    public static double saveUs(int money, int month, double ratio){
        double tot = 0.0;
        double r = ratio/100/12;//월 복리를 만든다. 1.5%는 0.015이므로 %를 100으로 나누고, 연 복리를 월 복리로 변경시키기 위해 12로 나눈다.
        double a = money;
        for(int i = 0; i<month; i++){ //원리합계를 구한다.
            a=a*(1+r); // 원리합계의 총합을 구한다.
            tot+=a;
        }
        return tot;
    }
    public static void main(String[] args) {
        double tot = MoneyDeposit.saveUs(800000,36,1.5);
        System.out.printf("적금 : %.0f\n", tot);
    }
}