package utilize.s087;

import java.io.BufferedReader;
import java.io.FileReader;
public class BillFileReader {
    public static void main(String[] args) {
        //try(BufferReader 생성) {} 구문은 자바7에서 추가된 구문으로 finally를 사용하지 않고 {}을 끝내면 자동으로 BufferedReader를 close한다. BufferedReader(FileReader)를 이용해 저장된 파일을 읽는다.
        //java, io가 Closable(AutoClosable) 인터페이스를 구현했기 때문에 try(IO 객체 생성)는 {}가 끝나면 자동으로 close()(autoclose())되어 finally 구문이 필요 없다. "billboard"디렉토리에 "bill.txt"파일을 읽는다.
        try (BufferedReader br = new BufferedReader(
                new FileReader("billboard\\bill.txt"))) {
            String msg = "";
            while ((msg = br.readLine()) != null) {
                System.out.println(msg);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
