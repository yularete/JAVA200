package utilize;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
public class S90BillboardArrayMain {
    public static void main(String[] args) {
        ArrayList<String> htmls = new ArrayList<>(); //문자열만 저장할 수 있는 ArrayList 객체를 생성.
        String newUrls="https://www.billboard.com/charts/hot-100";
        URL url = null; //웹사이트 경로를 찾는 URL 클래스를 선언한다.
        try {//예외가 발생할 수 있으므로 try로 감싸고 catch로 예외를 처리한다.
            url = new URL(newUrls); //빌보드 웹사이트의 경로를 입력하고, URL 객체를 생성해 주소를 찾는다.
            //주소지에 빨대 꽂기
            BufferedReader reader = new BufferedReader( //주소에서 빌보드 정보를 읽기 위해 BufferedReader 객체를 생성한다.
                    new InputStreamReader(url.openStream(),"euc-kr"),8); //주소지에 연결하고 한글이 있어도 깨지지 않도록 euc-kr로 설정하고 읽을 호스를 연결한다.
            String line = null;
            while ((line = reader.readLine())!=null){ //웹사이트에서 읽을 게 없을 때까지 한 줄씩 읽는다.
                if(!line.trim().equals("")){ //읽은 문자열이 공백 문자열이 아니면 읽은 문자열을 리스트에 저장한다.
                    htmls.add(line.trim());
                }
            }
        }catch (Exception e){
            System.out.println("Billboard Parsing error !!! ");
        }
        //ArrayList에 저장된 문자열을 출력
        for(String str : htmls){ //향상된 for를 이용해 리스트에 저장된 내용을 한 줄씩 출력한다.
            System.out.println(str);
        }
    }
}
/*
1. URL로 주소를 찾는다.
2. 찾은 주소에 연결하여 빨대(url.openStream())를 꽂는다.
3. 연결한 빨대에 호스를 연결(BufferedReader)한다.
4. 연결된 호스에서 한 줄씩 문자열을 읽는다.
5. 읽은 문자열이 공백 문자열이 아니라면 리스트에 저장한다.
*/