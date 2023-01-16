package intermediate2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class S59ForCondition3 {
    public static void main(String[] args) {
        List<Integer> ilist = new ArrayList<>();
        int s = 0;
        for(int i =1; i<=100; i++){
            ilist.add(i); //1과 100사이의 정수를 리스트에 저장하려면 .add()
        }
        //초기값 0.
        s= ilist.stream().reduce(0,Integer::sum);
        System.out.println("1~100의 합: "+s);

        s=0;
        //1~100사이의 홀수의 합
        //filter(수->홀수)형태. reduce(0, Integer::sum)은 초기값 0에 정수들의 합을 더한다는 의미.
        //filter(수->홀수).reduce(0, Integer:sum)은 리스트에 있는 홀수를 모두 더한다는 의미.
        s=ilist.stream().filter(i->i%2==1).reduce(0, Integer::sum);
        System.out.println("1~100 사이 홀수의 합: "+s);

        //1~100사이의 홀수의 합
        //두 수를 더하는 식으로 해당 정수들을 더한다는 말이 무엇임꽈..?
        s=ilist.stream().filter(i->i%2==1).reduce(0,(x,y)->x+y);
        System.out.println("1~100 사이 홀수의 합: "+s);

        //1~100사이의 홀수의 합
        //축약을 하면 21라인이고 21을 축약하면 22라인이 된다.
        s=ilist.stream().filter(i->i%2==1).reduce(0, new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer t, Integer u) {
                return t+u;
            }
        });
        System.out.println("1~100 사이 홀수의 합: "+s);
    }
}
/*
* Stream은 "순차적으로 나열된 데이터"이다. Stream은 Stream에 저장된 데이터를 쉽고 편하게 연산(filter, map, reduce) 할 수 있는 기능을 제공한다.
*
* List에 저장한 정수 중에서 홀수를 찾아 이들의 합을 이렇게 구해보자.
* 1) List에 저장된 데이터 중 조건에 맞는 것을 찾을 때(filter 조건에 맞는 수를 골라낸다)는 filter를 사용한다.
* 2) 합을 구할 때는 reduce를 이용해 간편하게 연산.
* 3) 리스트에 저장된 수 중에서 홀수를 찾으려면 list.stream().filter(i ->i%2==1)를 사용하고, filter를 이용해 찾은 수의 합을
*   reduce(초기값, Integer::sum)로 산출한다. 초기값이 0이면 0+1+3+・・・+99의 총합을 구한다.
* */

