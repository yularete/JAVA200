package intermediate2;

import java.util.Date;
import java.util.Enumeration;
import java.util.Properties;
/* System.currentTimeMills()는 1970.1.1부터 현재까지 걸린 시간을 밀리세컨드 단위로 반환한다.
하루는 24*60*60*1000 = 86,400,000밀리세컨드이다. Int 범위를 벗어날 수 있으므로 long 타입을 사용한다.
System.getProperties()는 시스템 환경변수를 반환한다. 시스템 환경변수는 OS 관련 정보를 제공한다.
자바 VM version, 파일 분리자 ("\" or "/")외에 많은 변수가 포함된다. */
public class S71SystemTest {
    public static void main(String[] args) {
        long ltime = System.currentTimeMillis();
        System.out.println((ltime)); //1970.1.1부터 현재까지 걸린 시간을 밀리세컨드로 반환한다. 하루는 24*60*60*1000 = 86,400,000 밀리세컨드이다.
        for (int i = 0; i < 100000; i++) { //10만 번 출력을 반복한다.
            System.out.print("");
        }
        long ltime2 = System.currentTimeMillis(); //milli 1/1000초, 10만 번 반복한 후 시간을 밀리세컨드로 반환한다. 연산 후에서 연산 전을 빼면 연산에 걸린 시간이다.
        System.out.println((ltime2 - ltime));
        System.out.println(ltime2 / 1000 / 60 / 60 / 24 / 365 + "년");
        Properties pro = System.getProperties(); //시스템 변수를 (key, value)로 저장한 맵 계열 Properties로 반환한다.
        //원하는 System property
        System.out.println(pro.getProperty("java.vm.version")); //key "java.vm.version"에 대한 값을 반환
        System.out.println(pro.getProperty("file.separator")); //key "file.separator"에 대한 값을 반환

        System.out.println(new Date(System.currentTimeMillis())); //오늘에 대한 정보를 얻을 수 있다, Date에 현재까지의 경과 시간을 입력하면
        //--------------java.util.*에서--------------//
        //모든 System property
        Enumeration<Object> en = pro.keys(); //(key, value)로 저장한 맵 계열 Properties에서 모든 키만을 얻는다.
        int i = 0;
        while (en.hasMoreElements()) { //키가 있다면 키값을 얻고, 키값에 대한 밸류를 얻는다.
            String keys = (String) en.nextElement();
            System.out.println((++i + " ") + keys + " : " + pro.getProperty(keys));
        }
    } //main
}
