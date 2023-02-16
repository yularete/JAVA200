package utilize3.s142;

public class JSortMain {
    public static void main(String[] args) {
        int[] m = {12,236,458,65,679,436,35,125,236,658,680,124,573,58,32};
        int[]n = new int[m.length];
        System.arraycopy(m,0,n,0,m.length);
        JSort.print(n);
        long a = System.nanoTime();
        JSort.QuickSort(n);
        long b = System.nanoTime();
        System.out.println((b-a)+"nano sec"); //10의 -9제곰
        JSort.print(n);
    }
}
