package utilize3.s128;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ThirTeenFriday {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance(); //오늘을 기준으로 Calendar 객체 생성
        int currentyear = cal.get(Calendar.YEAR);
        int count = 0;
        for(int year = 2000; year <= currentyear; year++){
            for(int month=0; month<12; month++){
                cal.set(year,month,13);
                if(cal.get(Calendar.DAY_OF_WEEK)== Calendar.FRIDAY){ //금요일
                    System.out.println((++count)+"\t"+sdf.format(cal.getTime()));
                }
            }
        }
    }
}
