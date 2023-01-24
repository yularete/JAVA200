package utilize;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
public class S91BillboardTimeMain {
    public static void main(String[] args) {
        String newUrls="https://www.billboard.com/charts/hot-100";
        String s="";
        URL url = null;
        try{
            url = new URL(newUrls); //주소 찾기
            //주소지에 빨대 꽂기
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(url.openStream(),"euc-kr"),8);
            String line = "";
            while ((line = reader.readLine())!=null){ //웹사이트에서 더 이상 읽을 것이 없을 때가지 한 줄씩 읽어들인다.
                if(!line.trim().equals("")){ //읽어들인 문자열이 있다면
                    //<time datetim="2018-08-14">Audust 14, 2018</time>
                    if(line.trim().contains("<time datetime=")){ //특정 문자열을 찾는다.
                        s=line.trim(); //특정 문자열을 포함하고 있는 문자열을 얻는다.
                        s=s.substring(0,s.indexOf(">")-1); //<time datetime= "2018-08-14 , 첫번째 > 를 찾아 > 뒤쪽을 버린다.
                        s=s.substring(s.indexOf("\"")+1).trim();//2018-8-15 , 연원일 앞에 있는 문자열을 제거한다...
                        break;
                    }
                }
            }
        }catch (Exception e){
            System.out.println("Billboard Parsing error!!!");
        }
        System.out.println("이번 빌보드 차트 날짜 : "+s);
    }
}
