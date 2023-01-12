package intermediate1;

public class S41JCalendar {
    public boolean isLeapYear(int year){
        boolean isS=false;
        if(((year%4==0)&&(year%100!=0))||(year%400==0)){
            isS=true;
        }
        return isS;
    }

    public static void main(String[] args) {
        S41JCalendar hc = new S41JCalendar();
        System.out.println(hc.isLeapYear(2023));
    }
}
