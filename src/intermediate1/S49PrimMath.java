package intermediate1;

public class S49PrimMath {
    public static boolean isPrime(int n) {
        boolean isS = true;
        for (int i = 2; i <= (int) Math.sqrt(n); i++) { //Math.sqrt(n)은 n의 제곱근을 구하는 메소드
            if (n % i == 0) {
                isS = false;
                break; //나누어 떨어지면 더 나누어 볼 필요가 없으므로 break를 사용해 반복문을 끝낸다.
            }
        }
        return isS;
    }

    public static void main(String[] args) {
        int number = 19;
        boolean ifPrime = isPrime(number);
        if (ifPrime) {
            System.out.printf("%d는 1과 자신으로만 나눠떨어지는 소수다.", number);
        } else {
            System.out.printf("%d은 소수가 아니다.", number);
        }
    }
}
