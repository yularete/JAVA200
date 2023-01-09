package beginner;

public class s18javaTypeConversion {
    public static void main(String[] args) {
        String slat = "  37.52127220511242   ";

        // trim()으로 양쪽 공백 제거 후, Double 랩퍼 클래스를 이용해 double로 타입 변환
        double latitude = Double.parseDouble(slat.trim());
        System.out.println(latitude);
    }
}
