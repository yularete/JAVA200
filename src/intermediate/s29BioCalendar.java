package intermediate;

public class s29BioCalendar {

    public static final int PHYSICAL = 29; //개발자 정의의 상수

    public static double getBioRhythm(long days, int index, int max){ //반환 타입 double, 메서드 이름은 gBR, 아규먼트(인자)는 long타입 days, int타입 index, max.
        return max*Math.sin((days % index) * 2 * Math.PI/index);
    }

    public static void main(String[] args) {
        int days = 1200;

        //static 메서드는 객체 생성 없이 호출 할 수 있다.
        double phyval = getBioRhythm(days, PHYSICAL, 100); //Math.sin이기에 -100~100 사이의 신체 지수값을 구한다.
        System.out.printf("나의 신체 지수는 %1$.2f입니다.", phyval);
    }
}
