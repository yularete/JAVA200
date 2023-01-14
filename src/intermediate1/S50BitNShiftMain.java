package intermediate1;

public class S50BitNShiftMain {

    public static String shifts(int a) {
        String s = "";
        for (int i = 0; i <= 31; i++) {
            int aa = a % 2;
            s = (aa >= 0) ? aa + s : (-aa) + s;
            a>>=1; //a=a/2와 동일.
        }
        return s;
    }

    public static void main(String[] args) {
        int intNums1 = 123;
        int intNums2 = -123;
        System.out.printf("%d : %s%n", intNums1, shifts(intNums1)); //%d = +-부호있는 정수, %s:문자열, %n:줄바꿈
        System.out.printf("%d : %s%n", intNums2, shifts(intNums2));
    }
}
