package utilize3.s132;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FilesCopys {
    public static void copyUsingFiles(File source, File target){
        try{
            Files.copy(source.toPath(), target.toPath());
        } catch (IOException e){
            System.out.println(e);
        }
    }
    public static void main(String[] args){
        File ff = new File("upload");
        File[] ffs = ff.listFiles();
        //2017-05-03 01:23
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        SimpleDateFormat fds = new SimpleDateFormat("yyyyMMdd");
        for(File fff: ffs){
            String absfile = fff.getAbsolutePath();
            if(fff.isFile()) {
                //파일 이름 23424123123.txt
                String f = (absfile).substring(absfile.lastIndexOf("\\")+1);
                String fre = "";
                if(f.indexOf('.')>=0){
                    fre = f.substring(0,f.indexOf('.'));
                }
                Date longDay = new Date(Long.parseLong(fre));
                String fname = sdf.format(longDay);
                String newFname= fds.format(longDay);
                System.out.println(fname+"\t\t"+newFname);
                File newFile = new File("upload\\"+newFname);
                File toFile = new File("upload\\"+newFname+"\\"+f);
                if(!newFile.exists()){
                    boolean iss = newFile.mkdirs();
                    if(iss){
                        copyUsingFiles(fff,toFile);
                    }
                }else {
                    copyUsingFiles(fff, toFile);
                }
            }
        }
    }
}
