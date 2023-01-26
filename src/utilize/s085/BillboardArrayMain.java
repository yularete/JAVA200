package utilize.s085;
import utilize.s083.Billboard;

import java.util.ArrayList;
public class BillboardArrayMain {
    public static void main(String[] args) {
        ArrayList<Billboard> bills = new ArrayList<>(); //ArrayList를 생성한다. ArrayListdp Billboard 객체만 저장하기 위해 <Billboard>(제네릭)으로 제한한다.
        bills.add(new Billboard(1,"Cateen", 1,//1등의 정보를 저장한 Billboard 객체를 저장
                "https://www.billboard.com/images/pref_images/q61808osztw.jpg", "yula"));
        bills.add(new Billboard(2,
                "My", 2, "https://www.billboard.com/images/pref_images/q61808osztr.jpg", "yula"));
        bills.add(new Billboard(3,
                "Love", 3, "https://www.billboard.com/images/pref_images/q61808qsztr.jpg", "yula"));
        System.out.println(bills.size());//ArrayList에 저장한 billboard 객체의 개수를 출력.
        showAbout(bills.get(0)); //ArrayList에 billboard 객체를 저장할 때 자동으로 0번부터 순서가 정해진다. 3개의 객체가 저장됐기에 0,1,2번째 객체로 저장된다. get(0)은 0번째로 저장된 객체를 반환한다.
        bills.remove(1); //1번째 billboard객체(2등)을 제거한다.
        System.out.println(bills.size()); //ArrayList엔 2개의 Billboard 객체가 저장되어 ㅣㅇㅆ다.
        System.out.println("-----------------");
        for(Billboard bb : bills){ //ArrayList에 저장된 Billboard 객체를 향상된 for을 이용해서 출력한다.
            showAbout(bb);
        }
    }
    public static void showAbout(Billboard bb){
        String sf = String.format("%d, %s, %d, %s, %s", bb.getRank(), bb.getSong(), bb.getLastweek(),bb.getImagesrc(), bb.getArtist());
        System.out.println(sf);
    }
}
