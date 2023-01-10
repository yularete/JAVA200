package intermediate1;
// non static 메서드 (멤버 메서드)
public class S30BioCalendar {
    public static final int PHYSICAL = 23;
    public double getBioRhythm(long days, int index, int max){
        return max*Math.sin((days%index)*2*Math.PI/index);
    }

    public static void main(String[] args) {
        int days = 1200;
        S30BioCalendar bio = new S30BioCalendar(); // 객체생성 해서 getBioRhythm 멤버 메소드 사용 가능

        double phyval = bio.getBioRhythm(days, PHYSICAL, 100);
        System.out.printf("나의 신체지수는 %1$.2f입니다.", phyval);
    }
/*
메서드 앞에 static이 붙으면 static 메서드 / 클래스 메서드 라 하고
                안 붙으면 non-static 메서드 / 멤버 메서드라고 한다. 멤버 메서드는 new 예약어를 이용해 클래스의 객체를 생성해야 한다.
* */
}
