package utilize.s094;
import utilize.s083.Billboard;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
public class BillboardPrint {
    public static void printToCSV(List<Billboard> bblist, String fname){ // 빌보드 차트 객체를 저장한 리스트의 주소를 받아서 같이 입력받은 파일 이름으로 저장한다.
        try(PrintWriter pw = new PrintWriter(new FileWriter(fname,false),true)){ // try()에서 객체 생성한 PrintWriter는 try의 {}를 벗어나면 자동으로 close()한다.
            for(Billboard bb : bblist){ //리스트에 저장된 객체를 하나씩 파일로 저장한다. pw.println(bb.toString())처럼 toString()이 붙으면서 문자열로 바꾸어 파일로 저장한다.
                pw.println(bb);
            }
        }catch (IOException e){
        }
    }
}
/*
ArrayList에 저장된 Billboard 객체들의 정보를 PrintWriter를 이용해 CSV(Comma Separate Value)로 저장한다.
CSV는 [rank=1, song= ・・・ artist=yula]와 같이 ","를 이용하여 값 사이의 경계를 표시한다.
*/