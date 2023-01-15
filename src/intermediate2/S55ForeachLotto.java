package intermediate2;

public class S55ForeachLotto {
    //var args variable arguments
    public static void print(int... mm) {
        for (int m : mm) {
            System.out.printf(m + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] mm = {1, 6, 16, 22, 23, 33};
        print(mm); //배열
        int a = 1, b = 6, c = 16;
        print(a);
        print(a, b);
        print(a, b, c);
    }
}

// 가변인자(varargs, variable arguments)는 아규먼트의 개수가 몇 개라도 배열처럼 사용할 수 있다.
//아규먼트의 개수가 한 개일 때, 여러 개일 때, 배열일 때는 여러 메서드가 필요한데, 가변인자를 사용하면 한 개의 메서드로 처리할 수 있다.
//따라서 오버로딩 메서드 개수가 줄어드는 효과를 갖는다.

// 가변인자(varargs, ...)는 변수의 타입이 같을 경우, 한 개 이상의 변수를 배열처럼 받아서 사용할 수 있다.
//배열을 편리하게 출력하기 위해 "향상된 for( foreach)"를 이용해 입력받은 아규먼트를 출력한다. 가변인자를 배열처럼 사용