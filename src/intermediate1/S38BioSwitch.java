package intermediate1;

public class S38BioSwitch {
    /*
    enum은 정수값으로 변환될 수 없다. 만약 대응되는 정수값으로 변경하려면 생성자와 get 메서드를 만든다.
    enum은 상수를 묶은 클래스이다. 상수값에 따라 case로 분기하기에 enum도 가능하다.

    enum 생성자를 통한 초기화는 final static 값을 static 생성자에서 단 한 번 초기화할 수 있는 것과 동일하다.
    * */
    public static String textInfor(S38PEI index, double value){
        String result = "";
        switch (index){
            case PHYSICAL: result ="신체 지수: "; break;
            case EMOTIONAL: result ="감정 지수: "; break;
            case INTELLECTUAL: result ="지성 지수: "; break;
            default: result = "미결정: "; break;
        }
    return result + (value*100);
    }
    public static void main(String[] args) {
        S38PEI index = S38PEI.PHYSICAL;
        double value = 0.86;
        System.out.println("신체 지수 주기값: "+index.getPei()); //enum을 int로 변환, 해당 enum값을 출력
        String st = textInfor(index, value);
        System.out.println(st);
        System.out.println(index.ordinal()); //physical은 0번째다.
        System.out.println(index.name());   //enum 값의 이름을 출력한다.
        System.out.println(index);          //name이 자동으로 붙어서 이름이 출력된다.
        System.out.println(index.getPei());//문자열을 반환s
    }
}
