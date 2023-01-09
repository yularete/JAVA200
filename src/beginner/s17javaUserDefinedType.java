package beginner;

class JLocation {
    // 기본적으로 한 클래스는 한 파일에 저장하며, 클래스와 파일의 이름이 동일해야 한다. 만약 한 파일에 클래스를 두 개 이상 선언할 때는 파일 이름과 동일한 클래스에만 public을 붙일 수 있다 !
    // 따라서 파일 이름과 클래스 이름이 다르기 때문에 public을 붙일 수 없다. 새로 JLocation.java 를 만들어서 public 붙여야 함.
    public double lat; //클래스 바로 아래에 선언한 변수, 멤버변수는 자동으로 각각 0.0으로 초기화된다.
    public double lng;
}

public class s17javaUserDefinedType {
    public static void main(String[] args) {

        //두 개의 기본 타입
        double latitude = 37.52127220511242;
        double longitude = 127.0074462890625;

        // 사용자 정의 객체를 생성
        JLocation jloc = new JLocation(); //사용자가 정의한 클래스를 new 예약어를 사용해 생성한다. JLocation 타입의 JLocation을 생성하고 jloc으로 참조(호출)할 수 있다.
        jloc.lat = latitude;
        jloc.lng = longitude;

        JLocation newLoc = jloc;//다른 객체에 레퍼런스(주소)를 알려서 사용할 수 있게 한다.
        System.out.println(newLoc.lat); //객체에 저장된 lat값을 출력. 참조 타입은 "레퍼런스."로 사용한다.
    }
}
