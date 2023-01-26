package utilize.s089;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class BillboardMain3 {
    public static void main(String[] args) {
        String newUrls="https://www.billboard.com/charts/hot-100";
        URL url = null; //웹사이트 경로를 찾는 URL 클래스를 선언한다.
        try{//예외가 발생할 수 있으므로 try로 감싸고 catch로 예외를 처리한다.
            url = new URL(newUrls); // 빌보드 웹사이트의 경로를 입력하고 URL 객체를 생성해서 주소를 찾는다.
        //주소지에 빨대 꽂기
            BufferedReader reader = new BufferedReader( //주소에서 빌보드 정보를 읽기 위해 BufferedReader 객체를 생성한다.
                    new InputStreamReader(url.openStream(),"euc-kr"), 8); //주소지에 연결하고 한글이 있어도 깨지지 않도록 "euc-kr"로 설정하고 읽을 호스를 연결한다.
                    String line = null;
                    while ((line = reader.readLine())!=null){//한줄씩 읽는다 웹사이트에서 더 이상 읽을 것이 없을 때까지..
                        if(!line.trim().equals("")){ //읽은 문자열이 공백 문자열이 아니면 읽은 문자열을 출력한다...
                            System.out.println(line.trim());
                        }
        }
    } catch (Exception e){
            System.out.println("Billboard Parsing error !!!");
        }
}
}