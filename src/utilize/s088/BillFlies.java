package utilize.s088;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Date;
//파일
public class BillFlies {
    public static void main(String[] args) {
        File f = new File("billboard"); //"billboard"디렉토리에 대한 정보를 확인하기 위해 File 클래스를 생성.
        File[] fd = f.listFiles(); //"billboard"디렉토리 내부의 포함된 모든 파일을 배열로 반환한다.
        for(File ff : fd){ //향상된 for를 이용해 "billboard"디렉토리 내부에 포함된 모든 파일의 정보를 출력.
            String fname = ff.getName(); //파일명을 얻는다.
            //fname="bill.txt"파일에 대해 "."뒤의 "txt"를 얻는다.
            String post = fname.substring(fname.lastIndexOf(".")+1); //.이후를 잘라서 문자열을 얻는다.
            System.out.println(fname+" "+post); // 파일이름과 확장자를 얻는다.
            System.out.println(ff.getAbsolutePath());//전체 경로를 반환한다.
            System.out.println(new Date(ff.lastModified())); //수정된 시간(long)을 입력해 Date 수정 날짜 정보를 얻는다.
            try(BufferedReader br = new BufferedReader( //try() 구문에 전체 경로를 입력하여 해당 파일을 읽을 준비를 한다.
                    new FileReader(ff.getAbsolutePath()))){
                String msg = ""; // 파일에서 한 줄씩 빌보드 정보를 읽어서 출력한다.
                while((msg=br.readLine())!=null){
                    System.out.println(msg);
                }
            }catch (Exception e){
                System.out.println(e);
            }
            System.out.println("---------------------");
        }
    }
}
/*
java.io.File 클래스는 파일에 관련된 클래스와 정보를 제공한다. File 클래스에 입력된 이름이 디렉토리인지 확인하고, 디렉토리 안에 있는 파일을 찾을 수 있으며
파일 이름, 팡리 절대 경로 이름, 작성일 또는 수정일 등을 확인할 수 있다.
*/