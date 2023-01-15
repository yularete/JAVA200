package intermediate2;

public class S54ForeachLotto {
    public static void main(String[] args) {
        int[] mm={1,6,16,22,23,33};
        for(int m : mm) {
            System.out.printf(m+"\t");
        }
        System.out.println();
    }
}
//향상된 for는 배열이나 리스트를 index로 굳이 지정하지 않아도 되므로 출력에 용이하다.
//배열의 값을 변경하지 않고 출력 위주로 사용된다.
// :(in) 뒤에는 배열이나 리스트가 오고, :(in) 앞에는 타입을 사용한다.
//1차원 배열을 선언과 함께 초기화 한다.
/* for(int i = 0; i<mm.length; i++){
    int m = mm[i];
    System.out.printf(m+"\t");
        } */
