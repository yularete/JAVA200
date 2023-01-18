package intermediate2;

import java.util.Iterator;
import java.util.Map;
/*
System.getProperty()는 시스템 변수를, System.getenv()는 프로그래밍 개발 환경변수를 반환한다.
System.getProperty()는 Properties를, System.getenv()는 Map을 반환한다.
Enumeration은 Iterator의 오래된 버전이다. 키를 얻어서 키에 대한 밸류를 얻을 수 있다.
* */
public class S72SystemPropertyTest {
    public static void main(String[] args) {
        long nanoTime = System.nanoTime(); //1970.1.1부터 현재까지 걸린 시간을 나소세컨드로 반환...
        for (int i = 0; i < 100000; i++) { //10만 번 출력을 반복
            System.out.print("");
        }
        long nanoTime2 = System.nanoTime(); //10^-9 nano java5 추가... 10만 번 반복 후 시간을 나노 세컨드로 반환.
        System.out.println((nanoTime2 - nanoTime)); //1/1000000000초// 연산 후에서 연산 전을 빼면 연산에 걸린 시간이다.
        System.out.println(System.getenv("JAVA_HOME")); //환경변수 키 "JAVA_HOME"에 대한 값을 반환.
        //모든 env 구하기
        Map<String, String> map = System.getenv(); //환경변수, 시스템 변수를 (key, value)로 저장한 맵을 반환한다.
        Iterator<String> iter = map.keySet().iterator(); //Map에서 키 얻기, (key, value)로 저장한 맵에서 모든 키만 얻는다.
        int j =0;
        while (iter.hasNext()){ //키가 있다면
            String keys = iter.next(); //키값을 얻고
            System.out.println((++j+" ")+keys+" : " + map.get(keys)); //키값에 대한 밸류를 얻는다.
        }
    }// main
}
