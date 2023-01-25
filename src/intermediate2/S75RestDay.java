package intermediate2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
/*
String, long(경과 시간 밀리세컨드), Date, Calendar 사이의 변환은 많이 사용되므로 잘 익혀 놓자.
1)  String과 Date 변환 : SimpleDateFormat 클래스를 이용한다.
    SimpleDateFormat("yyyy-MM-dd HH:mm:ss")에서 "yyyy" 년도, "MM" 월, "dd" 일, "HH" 24시간 단위 시간(hh 12시간 단위 시간), "mm" 분, "ss"초를 이용하여 원하는 변환 형태를 설정한다.
2)  long과 Date 변환 : Date 생성자(Date(long)) 또는 메서드(setTime(long))를 사용해 경과 시간을 대입하여 원하는 날짜로 변경한다.
3)  Date와 Calendar 변환 : setTime(java.util.Date)을 사용해 Date를 Calendar에 대입하여 원하는 날짜로 변경한다. getTime()으로 Date를 얻는다.
*/
public class S75RestDay {
    public static void main(String[] args) {
        String st ="2017-06-13"; // yyyy-MM-dd 형식에 맞는 문자열이므로 SimpleDateFormat을 이용하여 Calendar로 변환할 수 있다.
        Calendar d2 = todate(st);
        System.out.println(toYMD(d2));
        String st2=goGo(st,-7); // -7일 , 7일 전날의 정보를 문자열로 변환한다.
        System.out.println(st2);
        Calendar d3 = todate(st2); // 20열애서 얻은 날의 문자열을 Calendar로 변환한다.
        System.out.println(toYMD(d3)); // Calendar를 yyyy-MM-dd 형식에 맞는 문자열로 변환한다.

        TimeZone tz = TimeZone.getDefault(); //Asia/Seoul 현재 컴퓨터의 시간존을 반환한다.
        Calendar cal = Calendar.getInstance(tz); //타임존에 대한 Calendar를 사용한다.
        System.out.println(toYMD2(cal));

        //America/New_York,
        TimeZone tzNY = TimeZone.getTimeZone("America/New_York");
        Calendar calNY = Calendar.getInstance(tzNY);
        System.out.println(toYMD2(calNY));
    }
    public static Calendar todate(String ss){ // 입력받은 문자열을 Date로 변환하고, Calendar에서 얻은 Date를 대입시켜 날짜와 시간을 변경한다. 잘못된 날짜 형식이 입력되면 예외가 발생할 수 있기에 예외 처리한다.
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date dd = new Date();
        try{
            dd=sdf.parse(ss);
        } catch (ParseException e){
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(dd);
        return cal;
    }
    public static String toYMD(Calendar dd){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(dd.getTime());
    }
    public static String toYMD2(Calendar dd){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(dd.getTime());
    }
    public static String goGo(String ss, int day){ //day가 양수면 day일 후, 음수면 day일 전의 날짜로 바꾸고 yyyy-MM-dd 형식에 맞는 문자열로 변환한다.
        Calendar cal = todate(ss);
        //-7일 더하면 일주일 전
        cal.add(Calendar.DAY_OF_YEAR, day);
        //캘린더를 문자열로
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(cal.getTime());
    }
    public static String toWantedDay(String ss, int round){ return goGo(ss, -(round*7));}
}
