package beginner;
//상수
public class s26BioCalendar {
    //상수, 상수값은 변경할 수 없다.
    public static final int PHYSICAL = 23; // public static final 예약어를 붙여 상수를 선언. 상수는 대문자를 사용.

    public static void main(String[] args) {
        System.out.println(PHYSICAL);
        int index = PHYSICAL; //상수를 변수에 대입할 수 있다.

        //Math.PI 3.14에서 정의되어 있는 상수
        double vals = 2*Math.PI/index; //Math.PI는 public static final double PI = 3.14; 형식으로 선언되어 있다.
        System.out.println(vals+"라디안");
    }
}
