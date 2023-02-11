package utilize3.s134;

public class JSortMain {
    public static void main(String[] args) {
        int [] m = {12,100,53,76,95,37,99};
        int[]n = new int[m.length];
        System.arraycopy(m,0,n,0,m.length);
        JSort.print(n);
        long a = System.nanoTime();
        JSort.BubbleSort(n);
        //Sort.InsertSort(n);
        long b = System.nanoTime();
        System.out.println((b-a)+"nano sec"); //10의 -9승
        JSort.print(n);
    }
}
