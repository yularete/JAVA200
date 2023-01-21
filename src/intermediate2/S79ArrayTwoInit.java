package intermediate2;
public class S79ArrayTwoInit {
    public static void main(String[] args) {
        System.out.println("//2차원 배열 방법 1");
        int[][] a = new int[4][3];//4행 3열 동적 배열을 선언한다. 0으로 모두 초기화된다.
        a[0][0] = 1; //0행 0열 위치에 1을 대입한다.
        a[0][1] = 2; //0행 1열 위치에 2를 대입한다.
        println(a); //2차원 배열을 출력한다.

        System.out.println("//2차원 배열 방법 2(JigJagged도 가능)");
        int[][] b = new int[3][]; //3X? 파스칼의 삼각형에 사용... 3행 지그재그 2차원 배열을 선언한다. 열의 개수가 결정되지 않았기 때문에 열의 수를 결정하는 부분이 필요핟.
        b[0] = new int[4]; //0행을 4열, 1행을 5열, 2행을 3열로 선언하면서 생성한다.
        b[1] = new int[5];
        b[2] = new int[3];
        println(b);//지그재그 배열을 출력한다.

        System.out.println("//2차원 배열 방법3");
        int[][] c = new int[][]{{1, 2, 3, 4, 5}, {2, 3, 4, 5, 6}, {6, 7, 8, 9, 0}}; //2차원 동적 배열을 선언하면서 초기화한다.
        println(c);

        System.out.println("//2차원 배열 방법4");
        int[][] g = {{1, 2, 3, 4, 5}, {2, 3, 4, 5, 6}, {6, 7, 8, 9, 0}};
        println(g);

        System.out.println("copy 1");
        int[][] d = new int[c.length][c[0].length]; //3X5
        for (int i = 0; i < c.length; i++) { //배열에 대한 배열이므로 1차원 배열을 복사하는 System.arraycopy()를 이용하여 2차원 배열을 복사한다.
            System.arraycopy(c[i], 0, d[i], 0, d[i].length);
        }
        println(d);
    }

    public static void println(int[][] p) { //2차원 배열 이름.length는 행의 개수이고, 2차원 배열 이름[행의위치].length는 열의 개수이다.
        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p[i].length; j++) {
                System.out.print("[" + p[i][j] + "]");
            }
            System.out.println();
        }
    }
}
/*
new int[4][3]은 4행 3열로 12개의 저장 장소를 확보한다. new int[3][]는 3행에 대한 열의 개수가 정해지지 않았다.
이런 형태의 배열을 지그재그 배열이라고 한다. 배열 a는 12개의 개수가 결정되지만, b와 같은 지그재그 배열은 b[0]=new int[4];처럼 행에 대한 열의 개수를 필요에 따라 결정할 수 있다.
*/