package intermediate1;

public enum S38PEI {
    PHYSICAL(23), EMOTIONAL(28), INTELLECTUAL(33); //23,28,33을 생성자를 통해 enum 값으로 초기화 = 더 이상 값을 변경할 수 없다.
    private final int peiValue; //PEI에 있는 모든 상수값을 이 enum 변수를 통해 저장할 수 있다.

    S38PEI(int pei) {    //enum 값을 초기화할 수 있는 생성자.
        this.peiValue = pei;
    }

    public int getPei() {    //enum이 정수로 변환될 수 없다. 대신 해당 값을 반환하는 메서드를 선언해서 사용한다.
        return peiValue;
    }
}

enum FRUIT {    //생성자와 사용자 정의 메서드가 없는 enum의 예
    APPLE, BANANA, MANGO
}
