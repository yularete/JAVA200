package utilize;
import intermediate2.S75RestDay;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

public class S93RequestFromBillboardHot {
    ArrayList<String> htmls = new ArrayList<String>();
    ArrayList<S83Billboard> billboards = new ArrayList<S83Billboard>();
    boolean isConnection = false;

    public void RequestFromBillboardHot2() {
        htmls.clear();
        billboards.clear();
    }
    public ArrayList<S83Billboard> getBillboards() {
        return billboards;
    }
    public void getAllHtml(String newUrls) {
        htmls.clear();
        URL url = null;
        try {
            url = new URL(newUrls); //
            //주소지에 빨대 꽂기
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(url.openStream(), "euc-kr"), 8);
            String line = "";
            while ((line = reader.readLine()) != null) {
                if (!line.trim().equals("")) {
                    htmls.add(line.trim());
                }
            }
            isConnection = true;
        } catch (Exception e) {
            isConnection = false;
            System.out.println("Billboard Parsing error !!!");
        }
    }
    public String getTimeDate(String newUrls) {
        String s = "";
        URL url = null;
        try {
            url = new URL(newUrls);
            //주소지에 빨대 꽂기
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(url.openStream(), "euc-kr"), 8);
            String line = "";
            while ((line = reader.readLine()) != null) {
                if (line.trim().contains("<time datetime=")) {
                    s = line.trim();
                    s = s.substring(0, s.indexOf(">") - 1);
                    s = s.substring(s.indexOf("\"") + 1).trim();
                    break;
                }
            }
            isConnection = true;
        } catch (Exception e) {
            isConnection = false;
            System.out.println("Billboard Parsing error !!!");
        }
        return s;
    }
    public synchronized void getBillboardData(String msg){
        billboards.clear();
        for(int i=0; i<htmls.size();i++){
            String ss = htmls.get(i);
            if(ss.contains(msg)){
                String rank = ss.substring(ss.indexOf("chart-row--")+"chart-row--".length());

                rank = rank.substring(0, rank.indexOf("js")-1).trim();
                String song = ss.substring(ss.indexOf("Song Hover-")+"Song Hover-".length());
                song = song.substring(0,song.indexOf("\"")).trim();
                int j = 1;
                String imageurl = htmls.get(i+j);
                while(true){
                    if(imageurl.contains("images/pref_images")){
                        break;
                    }else{
                        j++;
                        imageurl=htmls.get(i+j);
                    }
                }
                imageurl = imageurl.substring(imageurl.indexOf("https://"));
                imageurl= imageurl.substring(0,imageurl.indexOf(".jpg")+".jpg".length());
                int k =1;
                String artisturl = htmls.get(i+j+k);
                while (true){
                    if(artisturl.contains("chart-row__artist")){
                        break;
                    } else {
                        j++;
                        artisturl =htmls.get(i+j+k);
                    }
                }
                artisturl = artisturl.substring(artisturl.indexOf("https://"));
                artisturl= artisturl.substring(0,artisturl.indexOf("\""));
                String artist = artisturl.substring(artisturl.lastIndexOf("/")+1);
                artist =toArtis(artist);
                int m = 1;
                String lastweek = htmls.get(i+j+k+m);
                while (true){
                    if(lastweek.contains("chart-row__last-week")){
                        break;
                    }else {
                        j++;
                        lastweek =htmls.get(i+j+k+m);
                    }
                }
                int n = 1;
                lastweek=htmls.get(i+j+k+m+n);
                while (true){
                    if(lastweek.contains("chart-row__value")){
                        break;
                    }else{
                        j++;
                        lastweek=htmls.get(i+j+k+m+n);
                    }
                }
                lastweek = lastweek.substring(lastweek.indexOf(">")+1);
                lastweek = lastweek.substring(0,lastweek.indexOf("<")).trim();
                //빌보드 객체에 정보를 저장한다.
                S83Billboard board = new S83Billboard(
                        toInt(rank), replace(song), //Integer는 기본 타입의 int에 대한 정보 저장, 변환을 위한 랩퍼 클래스이다.
                        toInt(__toStr(lastweek)),
                        imageurl, artisturl, artist);
                billboards.add(board); // 빌보드 차트 목록을 ArrayList에 저장한다.
            }
        }
    }
    public void printHtml(){
        for(String dto : htmls){
            System.out.println(dto);
        }
    }
    public void printBillboard(){
        for(S83Billboard dto : billboards){
            System.out.println(dto);
        }
    }
    public String replace(String msg){
        String ss = msg;
        ss=ss.replaceAll("&#039",""); //웹에서 사용하는 특수문자를 변경한다.
        ss=ss.replaceAll("&amp;","&");
        ss=ss.replaceAll("&quot;","\"");
        return ss.trim();
    }
    private String __toStr(String lastweek){ //지난 랭킹이 100위 밖이면 "--"로 표시되어 있다. "--"면 101로 변환한다.
        return lastweek.contains("--")?101+"":lastweek;
    }
    private String toInt(String msg){
        return msg.replaceAll("-"," ");
    }

    public static void main(String[] args){
        S93RequestFromBillboardHot rfw = new S93RequestFromBillboardHot();
        String a = "https://www.billboard.com/charts/hot-100/";
        String rs =rfw.getTimeDate(a);
        rs = S75RestDay.toWantedDay(rs, 1);
        System.out.println(rs);
        rfw.getAllHtml(a+rs);
        String str="<article class=\"chart-row";
        rfw.getBillboardData(str);
        rfw.printBillboard();
    }
    public String toArtis(String msg){
        return msg.replaceAll("-"," ");
    }
}
