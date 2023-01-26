package utilize.s086;

import utilize.s083.Billboard;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
public class BillFileWriter {
    public static void main(String[] args) {
        Billboard b1 = new Billboard(1, //Billboard 객체에 1~3등 정보를 저장한다.
                "Cateen", 1, "https://www.billboard.com/images/pref_images/q61808osztw.jpg", "yula");
        Billboard b2 = new Billboard(2,
                "My", 2, "https://www.billboard.com/images/pref_images/q61808osztr.jpg", "yula");
        Billboard b3 = new Billboard(3,
                "Love", 3, "https://www.billboard.com/images/pref_images/q61808qsztr.jpg", "yula");
        ArrayList<Billboard> bblist = new ArrayList<>(); // ArrayList를 생성하고 Billboard객체만 저장하기 위해 제네릭으로 제한한다.
        bblist.add(b1); // ArrayList에 빌보드 차트 정보를 저장한 billboard 객체를 저장한다.
        bblist.add(b2);
        bblist.add(b3);
        File f = new File("billboard"); //"billboard" 디렉토리가 존재하지 않으면 (!exists()) "billboard" 디렉토리를 만든다. (mkdirs()).
        if(!f.exists()){f.mkdirs();}
        //try(IO 객체 생성)는 {}가 끝나면 자동으로 close()(autoclose())가 된다. finally 구문이 필요없는 편리한 예외처리이다. "billboard"디렉토리에 "bill.txt"파일 이름으로 저장한다.
        //"bill.txt"가 이미 있다면 내용을 지우고 새로(false) 저장한다.
        try(PrintWriter pw = new PrintWriter(new FileWriter("billboard\\bill.txt",false),true)){

            //리스트에 저장된 Billboard 객체들을 향상된 for문을 이용해 index 없이 0부터 순서대로 파일로 저장한다. 이때 한 줄 저장하고 자동으로 파일로 확실하게 저장하도록 (flush true) 한다.
            for(Billboard bb : bblist){
                pw.println(bb);
            }
        } catch (IOException e){
            System.out.println(e);
        }
    }
}