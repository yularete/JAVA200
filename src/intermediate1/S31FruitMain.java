package intermediate1;

public class S31FruitMain {
    public static void main(String[] args) {
        S31FRUIT pear = S31FRUIT.APPLE;
        S31FRUIT pear2 = S31FRUIT.MANGO;
        System.out.println(pear);
        System.out.println(pear.name());
        System.out.println(pear.ordinal()); //선언될 때 순서를 반환한다 =>0
        System.out.println(pear2.ordinal());
        S31FRUIT[] fruits=S31FRUIT.values(); //모든 enum 상수를 반환한다.
        System.out.println(fruits[0]);
    }
}
/*
- enum 상수는 static final을 사용하지 않고 대문자로 선언한다. 선언한 순서(ordinal)대로 0,1,2처럼 값이 자동으로 대입된다.
- 순서(ordinal)대로 APPLE, BANANA, MANGO의 ordinal은 0,1,2다.
- enum을 int로 변환하거나 대입할 수 없다. int a = FRUIT.APPLE; 형식은 예외가 발생한다. 꼭 변환해서 사용하고 싶다면 순서를 나타내는 ordinal()을 이용한다.
* */
