package utilize.s083;
import java.io.Serializable;
public class Billboard implements Serializable {
    private int rank; //데이터를 보호하기 위해 private으로 선언한다.
    private String song;
    private int lastweek;
    private String imagesrc;
    private String artistsrc;
    private String artist;
    public Billboard() {} //기본 생성자를 선언ㅇ한다.
    public Billboard(int rank, String song, int lastweek, String imagesrc, //멤버 6개, 5개를 초기화 할 생성자를 오버로딩한다.
                     String artist, String artistsrc) {
        super();
        this.rank = rank;
        this.song = song;
        this.lastweek = lastweek;
        this.imagesrc = imagesrc;
        this.artist = artist;
        this.artistsrc = artistsrc;
    }
    public Billboard(int rank, String song, int lastweek, String imagesrc, String artist) {
        super();
        this.rank = rank;
        this.song = song;
        this.lastweek = lastweek;
        this.imagesrc = imagesrc;
        this.artist = artist;
    }
    @Override
    public String toString() { //멤버를 살펴볼 수 있도록 toString()을 오버라이딩한다.
        return "[rank=" + rank + ",song=" + song + ",lastweek=" + lastweek +
                ",imagesrc=" + imagesrc +
                ", artist=" + artist + "]";
    }
    public int getRank(){ //맴버필드를 내보내고 대입하기 위해 getXXX/setXXX 메서드를 만든다.
        return rank;
    }
    public void setRank(int rank){
        this.rank= rank;
    }
    public String getSong(){
        return song;
    }
    public void setSong(){
        this.song =song;
    }
    public int getLastweek(){
        return lastweek;
    }
    public void setLastweek(int lastweek){
        this.lastweek = lastweek;
    }
    public String getImagesrc(){
        return imagesrc;
    }
    public void setImagesrc(String imagesrc){
        this.imagesrc = imagesrc;
    }
    public String getArtistsrc(){
        return artistsrc;
    }
    public void setArtistsrc(String artistsrc){
        this.artistsrc = artistsrc;
    }
    public String getArtist(){
        return artist;
    }
    public void setArtist(String artist){
        this.artist = artist;
    }
}
/*
5개의 데이터(멤버필드)를 5번 전달하는 것보다 빌보드 차트 순위에 따라 순위(rank)와 일주 전 순위, 곡명, 이미지 위치, 가수를 저장하는 전송 객체(DTO- Data Transfer Object)를 만들어 저장하고 한 번에 전송하면 편리하다.
데이터는 private로 보호하고, 멤버필드를 가져오고 저장하기 위해 get/set 메서드를 마든다. 또한 필요한 생성자들을 오버로딩한다.
*/