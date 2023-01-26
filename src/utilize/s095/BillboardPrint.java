package utilize.s095;
import utilize.s083.Billboard;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
public class BillboardPrint {
    public static void printToJSON(List<Billboard> bblist, String fname){ //빌보드 차트 객체를 저장한 리스트의 주소를 받아서 같이 입력 받은 파일 이름으로 저장한다.
        try(PrintWriter pw = new PrintWriter(new FileWriter(fname,false),true)){ //try()에서 객체 생성한 printWritersms try{}를 벗어나면 자동으로 클로즈.
            pw.println("{\"billboard\":[");//키 "billboard"에 대한 값으로 배열을 표현하기 위해 [로 시작한다.
            for(int i = 0; i<bblist.size()-1;i++){ //리스트에 저장된 객체를 하나씩 파일로 저장한다. 키:값 형식의 문자열로 바꾸면서 파일로 저장한다.
                Billboard bb = bblist.get(i);
                pw.println(pair(bb)+",");
            }
            pw.println(pair(bblist.get(bblist.size()-1)));
            pw.println("]}");
        }catch (IOException e){

        }
    }
    private static String pair(Billboard bb){
        String rank = pair("rank",bb.getRank()+""); //pair() 메서드를 이용해 "키":"값" 형식으로 만든다.
        String song = pair("song",bb.getSong()+"");
        String lastweek = pair("lastweek",bb.getLastweek()+"");
        String imagesrc = pair("imagesrc",bb.getImagesrc()+"");
        String artist = pair("artist",bb.getArtist()+"");
        return String.format("{%s,%s,%s,%s,%s}",rank,song,lastweek,imagesrc,artist);
    }
    //"key":"value"
    private static String pair(String key, String value){
        String ss = String.format("\"%s\":\"%s\"", key,value);
        return ss;
    }
    //{"key":"value"}
    private static String pairs(String key, String value){
        String ss=String.format("{\"%s\":\"%s\"}", key, value);
        return ss;
    }
}
//ArrayList에 저장된 BIllboard 객체 정보를 PrintWriter를 이용하여 JSON(Java Script Object Notation)으로 저장한다.
//JSON은 {"키":"값"}을 이용하여 정보를 표시하고, []으로 배열을 표현한다.
//"billboard" 키값은 []배열이며 []안에 빌보드 차트 정보를 넣는다...
