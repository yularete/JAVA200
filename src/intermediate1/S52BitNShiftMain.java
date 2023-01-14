package intermediate1;

public class S52BitNShiftMain {
    public static int BITMASK = 1;

    //10진법수를 2진법 스트링으로 변환
    public static String shifts(int a) {
        int BITMASK = 1;
        String s = "";
        for (int i = 0; i <= 31; i++) {
            s = (a & BITMASK) + s;
            a>>=1; // a/=2
        }
        return s.substring(s.indexOf('1')); //1이 처음나오는 곳 까지의 0을 제거해주는 메소드
    }

    public static void main(String[] args) {
        int intNums1 = 123;
        int intNums2 = -123;
        System.out.printf("%d : %s%n",intNums1,shifts(intNums1));
        System.out.printf("%d : %s%n",intNums2,shifts(intNums2));
    }
}
