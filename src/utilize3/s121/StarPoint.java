package utilize3.s121;
public class StarPoint {
    public static void printStarDecrease(int n) { //층수(n줄) n을 입력받는다.
        //바깥 for문. n줄에 대하여 내부 for를 실행한다.
        //i가 0일 때, 안쪽 for의 변수 j는 j<0이 되므로 공백이 없다. 그래고 k<2*(5-0)이 되어 1,2,3,4,5,6,7,8,9일 때를 만족하므로 *를 9번 출력한다.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) { //ㅂㅏ깥 for에 대하여 안쪽 for를 실행해 공백을 출력
                System.out.print(" ");
            }
            for (int k = 1; k < 2 * (n - i); k++) { //바깥for에 대하여 안쪽 for를 실행해 *을 출력
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printStarDecrease(7);
    }
}
//for에 대한 for문에서는 바깥 for문의 스텝이 변경될 때마다 안쪽 for문이 실행된다.