package utilize.s092;
import intermediate2.S75RestDay;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
public class RequestFromBillboardHot {
    ArrayList<String> htmls = new ArrayList<String>(); //문자열만 저장할 수 있는 ArrayList 객체 생성, 빌보드 웹사이트에서 읽은 내용을 이 리스트에 저장
    boolean isConnection = false;

    public RequestFromBillboardHot() {
        htmls.clear(); //저장할 ArrayList를 청소한다.
    }
    public void getAllHtml(String newUrls) {
        htmls.clear();
        URL url = null;
        try { // 예외가 발생할 수 있으므로 try로 감싸고 catch로 예외 처리
            url = new URL(newUrls); //빌보드 웹사이트의 경로를 입력하고 URL 객체를 생성해서 주소를 찾는다.
            //주소지에 빨대 꽂기
            BufferedReader reader = new BufferedReader(//주소에서 빌보드 정보를 읽기 위해 BufferedReader객체를 생성
                    new InputStreamReader(url.openStream(), "euc-kr"), 8); //주소지에 연결하고 한글이 깨지지 않도록 euc-kr로 설정, 읽을 호스를 연결
            String line = "";
            while ((line = reader.readLine()) != null) {//연결된 호스에서 한 줄씩 문자열을 읽음.
                if (!line.trim().equals("")) { //읽을 문자열이 있다면 리스트에 저장
                    htmls.add(line.trim());
                }
            }
            isConnection = true;
        }catch (Exception e){
            isConnection = false;
            System.out.println("Billboard Parsing error !!!");
        }
    }
    public void printHtml(){
        for(String ss : htmls){ //리스트에 저장된 내용을 한 줄씩 출력한다.
            System.out.println(ss);
        }
    }
    public String getTimeDate(String newUrls){ //특정 문자열이 포함되어 있는지 확인, 있따면 datetime="연-월-일" 부분을 찾아  "연-월-일"을 얻는다.
        String s = "";
        URL url = null;
        try {
            url = new URL(newUrls); //주소 찾기
            //주소지에 빨대 꽂기
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(url.openStream(),"euc-kr"),8);
            String line = "";
            while ((line = reader.readLine())!=null){
                if(!line.trim().equals("")){
                    if(line.trim().contains("<time datetime=")){
                        //<time datetime="2023-01-25">January 25, 2023</time>
                        s=line.trim();
                        s=s.substring(0,s.indexOf(">")-1); //<time datetime="2023-01-25
                        s=s.substring(s.indexOf("\"")+1).trim();//2023-01-25
                        break;
                    }
                }
            }
            isConnection = true;
        }catch (Exception e){
            isConnection = false;
            System.out.println("Billboard Parsing error !!!");
        }
        return s;
    }
    public static void main(String[] args){
        RequestFromBillboardHot rfw = new RequestFromBillboardHot();
        String a="https://www.billboard.com/charts/hot-100/"; //빌보드 웹사이트 경로
        String rs=rfw.getTimeDate(a); //이번 주 날짜를 찾는다.
        System.out.println("이번 주"+rs);
        rs= S75RestDay.toWantedDay(rs,1); //1주 전 날짜를 찾는다.
        System.out.println("일주일 전"+rs);
        System.out.println(rs);
        rfw.getAllHtml(a+rs); // 해당 날짜의 빌보드 차트를 읽어 리스트에 저장한다..
        rfw.printHtml(); //리스트에 저장된 내용을 한 줄씩 모두 출력한다.
    }
}
/*
1. URL로 주소를 찾는다.
2. 찾은 주소에 연결하여 빨대(url.openStream())를 꽂는다.
3. 연결한 빨대에 호스를 연결(BufferedReader)한다.
4. 찾으려는 날짜를 얻고, 해당 날짜의 빌보드 차트를 요청한다.
5. 연결된 호스에서 한 줄씩 문자열을 읽는다.
6. 읽은 문자열을 리스트에 저장한다.
*/