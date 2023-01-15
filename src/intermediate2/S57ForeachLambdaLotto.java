package intermediate2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class S57ForeachLambdaLotto {
    public static void main(String[] args) {
        //여러 수를 List에 저장한다. List에 저장할 수가 int 타입일 때 랩퍼 클래스 Integer를 이용.
        List<Integer> mmlists = Arrays.asList(1, 6, 16, 22, 23, 33);

        //List에 저장된 정수를 한 개씩 출력하기 위해 List의 forEach 메서드를 이용한다.
        //List의 forEach는 향상된 for 처럼 index 없이 순서대로 한 개씩 작업할 수 있다.
        mmlists.forEach( // List<Integer>로 선언했으므로 mmlists에 저장되어 있는 int를 한 개씩 가져와 출력한다.
                // (m->{m출력}
                m -> {
                    System.out.printf(m + "\t");
                });

        System.out.println();

        Consumer<Integer> consume = (Integer m) -> {
            System.out.printf(m + "\t");
        };
        mmlists.forEach(consume);
    }
}
//향상된 for와 비슷한 형태로 인덱스 없이 순서대로 수를 가져온 다음, -> {} (람다) 형식을 이용해 그 수를 처리한다.
//향상된 for에서 순서대로 수를 가져와 출력하려면 forEach( m -> {m 출력}) 형식을 이용한다.
//List<Integer>로 선언했다면 m은 int(Integer)이다.

