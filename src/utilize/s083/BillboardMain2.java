package utilize.s083;
public class BillboardMain2 {
    public static void main(String[] args) {
        //빌보드 객체를 생성한다. 왼쪽 빌보드는 설계도이고, 오른쪽 빌보드는 생성된 객체이다. 생성하면서 순위부터 가수명까지를 대입하여 초기화한다.
        Billboard b1 = new Billboard(1, "Cateen",1,"https://www.billboard.com/images/pref_images/q61808osztw.jpg","yula");
        //객체 출력
        showAbout(b1); // 빌보드 객체의 정보를 출력한다.
        //객체로 전달
        Billboard b = b1; //주소 복사한 후 주소의 객체 정보를 출력한다.
        showAbout(b); //객체 내용을 출력
    }
    public static void showAbout(Billboard bb){ //객체를 전달하여 출력...
        String sf = String.format("%d, %s, %d, %s, %s",
                bb.getRank(), bb.getSong(), bb.getLastweek(), bb.getImagesrc(), bb.getArtist());
        System.out.println(sf);
    }
}
