package intermediate2;

import java.util.ArrayList;
import java.util.List;

public class S58ForCondition2 {
    public static void main(String[] args) {
        List<Integer> ilist = new ArrayList<>();
        int s = 0;
        for(int i=1; i<=10; i++){
            ilist.add(i);
        }
        for(int m: ilist){
            if(m%2==1){
                s+=m*m;
                System.out.printf("%d\t",m*m);
            }
        }
        System.out.println();
        System.out.println("1~10 사이의 홀수에 대한 제곱합: "+s);
    }
}
//배열보다 편리하고 강력한 List에 정수를 저장한다. 저장한 정수 중에서 홀수를 찾아 이에 대한 제곱의 합을 구한다.
//List<>의 <>에는 int가 아닌 integer를 사용한다.

//정수는 List에 저장한다. <Integer>를 이용애헛 정수로 한정한다. List에 저장할 수가 int 타입이므로
//랩퍼 클래스 Integer를 사용하여 List<Integer>로 선언하고 생성한다.
