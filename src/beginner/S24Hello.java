package beginner;

public class S24Hello {

    public static void showYou(){
        System.out.println("곧 자바왕이 될거야.");
    }

    public static void main(String[] args) { //메인 메서드가 static이므로 객체 생성 없이 static 메서드 showYou()를 바로 호출할 수 있다.
        showYou();
    }
    //참조 타입(객체)는 중요한 데이터를 저장하거나 전송할 때 사용한다. 메서드는 이런 데이터를 가공하거나 변환하기 위해 사용한다. 또한 반복되거나 복잡한 부분도 메서드로 만들 수 있다
    // public 반환타입 메서드 이름 ( 아규먼트타입 아규먼트 이름){}
    //반환하지 않은 메서드는 리턴 타입이 void 이다.
}
