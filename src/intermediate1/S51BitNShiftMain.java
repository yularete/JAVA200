package intermediate1;

public class S51BitNShiftMain {
    public static int BITMASK = 1;

    public static String shifts(int a) {
        int BITMASK = 1;
        String s = "";
        for (int i = 0; i <= 31; i++) {
            s = (a & BITMASK) + s; //1과 &연산을 하면 0또는 1만 얻는다.
            a>>=1; // a/=2;
        }
        return s;
    }

    public static void main(String[] args) {
        int intNum1=123;
        int intNum2=-123;
        System.out.printf("%d : %s%n",intNum1,shifts(intNum1));
        System.out.printf("%d : %s%n",intNum2,shifts(intNum2));
    }
}
/*
* 비트 연산자는 부호에 관계 없이 양수가 된다. &(비트) 연산자는 1&1일 때만 1이고, | 연산자는 0|0일 때만 0이다.
* ^는 1과 0 또는 0과 1일 때만 1이다.
* */
