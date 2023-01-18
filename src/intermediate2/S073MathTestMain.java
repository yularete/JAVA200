package intermediate2;
/*
Math 클래스는 수학 연산에 관련된 메서드를 제공한다. java.lang 패키지에서 Math 클래스의 메서드는 모두 static 메서드이다. static메서드는 객체 생성 없이 "클래스 이름.메서드()"형태로 사용한다.
*/
public class S073MathTestMain {
    public static void main(String[] args) {
        //constant
        System.out.println("Math.E : " + Math.E); //상수 자연로그 E, 원주율 PI
        System.out.println("Math.PI : "+Math.PI); // java.lang 패키지는 자동으로 import되며 static 메서드이므로 "Math클래스.메서드 이름()"으로 메서드를 호출한다.
        //method
        System.out.println("Math.abs(-5) 절대값 : "+Math.abs(-5)); //절대값(Absolute)을 구한다.
        System.out.println("Math.ceil(4.34) 올림  : "+Math.ceil(4.34));
        System.out.println("Math.round(4.5) 반올림 : "+Math.round(4.5)); //round의 리턴 타입은 int, 0.5부터 반올림이 됨
        System.out.println("Math.floor(4.34) 버림 : "+Math.floor(4.34));
        System.out.println("Math.rint(4.51) 반올림 : "+Math.rint(4.51));//rint의 리턴 타입은 double, 0.51처럼 0.5를 넘어야 반올림 됨.
        System.out.println("Math.max(45,78) : "+Math.max(45,78));
        System.out.println("Math.min(45,78) : "+Math.min(45,78));
        System.out.println("Math.Math.pow(2,4) : "+Math.pow(2,4)); //제곱수를 구한다. 2의4제곱, 2*2*2*2를 구한다.
        System.out.println("Math.Math.log(30) : "+Math.log(30)); //밑수가 Math.E인 로그이다.
        System.out.println("Math.exp(3) : "+Math.exp(3)); //exp(num)은 pow(Math.E, num)으로 자연 지수의 제곱수이다.
        System.out.println("Math.sqrt(10) : "+Math.sqrt(10)); //양의 제곱근을 구한다.
        // Random
        double dRan = Math.random();//임의의 수를 구한다. 범위는 0<=값<1 (0과 1 사이의 실수, 0은 포함, 1은 제외)이다.
        System.out.println("Math.random() => "+dRan);
    }
}
