package intermediate1;

public class S34EvenOddTriCondition {
    public static void main(String[] args) {
        int temp = 99;
        temp = (temp % 2 == 1) ? temp * 3 + 1 : temp / 2;

        System.out.printf("계산 후=%d\n", temp);
    }
}

// if(a) { d=b
// }else{d=c}는
// d=a?b:c와 같다.
// b, c, d의 타입이 동일해야 하고, 연산 결과는 d에 대입한다/