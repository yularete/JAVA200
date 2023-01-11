package intermediate1;

public class S37BioSwitch {

    public static final int PHYSICAL = 23;
    public static final int EMOTIONAL = 28;
    public static final int INTELLECTUAL = 33;

    public static String textInfor(int index, double value){
        String result = "";

        //입력된 정수가 해당 case의 상수값과 같을 때 result에 문자열을 대입하고 break를 만나 switch를 끝낸다.
        switch (index){
            case PHYSICAL:result = "신체 지수 : "; break;
            case EMOTIONAL:result = "감정 지수 : "; break;
            case INTELLECTUAL:result ="지성 지수 : "; break;

            //입력된 정수가 case의 상수값과 모두 일치하지 않으면 실행된다.
            default: result = "미결정 : "; break;
        }
        return result + (value*100);
    }

    public static void main(String[] args) {
        int index = PHYSICAL;
        double value = 0.86;
        String st = textInfor(index, value);
        System.out.println(st);
    }
}
