package intermediate1;

public class S45EvenOdd {
    public static void showOddnEven(int n){
        int temp = n;
        for(; temp!=1 ;) {
            if(temp%2==1) {
                temp=temp*3+1;
            } else {
                temp/=2;
            }
            System.out.print("["+temp+"]");
        }
        System.out.println("\n----------------");
    }

    public static void main(String[] args) {
        showOddnEven(122);
    }
}
