package utilize3.s122;
public class SilverStar {
    public static void stepDia(int n){
        for(int i =0; i<n; i++){
            for(int j=0; j<Math.abs(i-n/2); j++){ //Math.abs()는 양수로 만든다
                System.out.printf(" ");
            }
            for(int k = 0; k <n-2*Math.abs(i-n/2); k++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        SilverStar.stepDia(9);
    }
}
