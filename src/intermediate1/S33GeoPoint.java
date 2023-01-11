package intermediate1;

public class S33GeoPoint {
    public static void main(String[] args) {
        // 실수 변수
        double latitude1 = 37.52127220511242;
        double longitude1 = 127.0074462890625;
        double latitude2 = 35.137879119634185;
        double longitude2 = 129.04541015625;

        S33Geo geo1 = new S33Geo();// S33Geo 객체를 생성한다. new 예약어는 클래스에서 선언한 대로(설계도대로) Heap(힙) 메모리에 올려 사용할 수 있는 객체를 생성한다.
        geo1.latitude = latitude1;//생성된 객체(인스턴스)에 위도와 경도를 대입
        geo1.longitude = longitude1;
        System.out.println(geo1.latitude + "\t" + geo1.longitude);

        S33Geo geo2 = new S33Geo();
        geo2.latitude = latitude2;
        geo2.longitude = longitude2;

        S33Geo geo = geo1; //객체의 주소값을 전달, 대입한다.
        System.out.println(geo.latitude + "\t" + geo.longitude);
    }
}
