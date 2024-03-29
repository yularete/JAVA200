package utilize.s084;

import utilize.s083.Billboard;

public class BillboardMainObject {
    public static void main(String[] args) {
        Billboard b1 = new Billboard(1,
                "Cateen", 1, "https://www.billboard.com/images/pref_images/q61808osztw.jpg", "yula");
        Billboard b2 = new Billboard(2,
                "My", 2, "https://www.billboard.com/images/pref_images/q61808osztr.jpg", "yula");
        Billboard b3 = new Billboard(3,
                "Love", 3, "https://www.billboard.com/images/pref_images/q61808qsztr.jpg", "yula");
        showAbout(b1);
        showAbout(b2);
        showAbout(b1, b2);
        showAbout(b1, b2, b3);
        Billboard[] b = new Billboard[3];
        b[0] = new Billboard(1, "Cateen", 1,
                "https://www.billboard.com/images/pref_images/q61808osztw.jpg", "yula");
        b[1] = b2;
        b[2] = b3;
        showAbout(b[0], b[1]);
        showAbout(b);
    }
        public static void showAbout(Billboard bb){
            System.out.println("1------------------");
            String sf = String.format("%d,%s,%d,%s,%s",
                    bb.getRank(), bb.getSong(), bb.getLastweek(), bb.getImagesrc(), bb.getArtist());
            System.out.println(sf);
        }
        public static void showAbout(Billboard... b) {
            System.out.println("2===================>");
            for(Billboard bill : b){
                showAbout(bill);
            }
            System.out.println("<===================2");
    }
}
/* 빌보드 객체를 생성하면서 인자들을 대입하여 초기화 한다.
빌보드 객체 배열을 생성하고 초기화한다. 1개의 객체, 2개의 객체, 3개의 객체 그리고 배열을 아규먼트로 모두 받을 수 있는 varargs(...)를 이용하여 객체의 개수에 관계 없이 출력한다.
*/