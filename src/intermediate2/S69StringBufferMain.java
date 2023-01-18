package intermediate2;
/*
문자열을 저장 또는 처리하는 String은 참조 타입이지만 성격을 변경해서(오버라이딩) 기본 타입과 동일한 CBV(값 복사)를 한다.
문자열을 연산한 후 대입 연산자로 저장해야 변경한다. 바꾼 문자열을 다시 대입하지 않으면 원래 문자열이 되는 특징이 이뮤터블이다.
내용이 변경되면 새로운 주소를 갖는다.
StringBuffer는 저장하는 내용이 변경되어도 처음 주소가 변하지 않는다. 바꾼 문자열을 다시 대입하지 않아도 원래 문자열이 변하는 것을 뮤터블이라고 한다.
StringBuffer로 문자열을 연산한 다음, 최종으로 toString()을 통하여 String으로 변환해서 사용한다.
* */
public class S69StringBufferMain {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer(); //StringBuffer 객체를 생성
        //1 계속해서 붙이는 함수 mutable
        sb1.append("안녕하세요.") //append는 String의 스트링 컨케트네이션(+, concat) 역할을 한다. 그러나 StringBuffer는 뮤터블하므로 다시 대입하지 않아도 된다.
                .append("또 만나요.")
                .append("사랑해요. 기다려 봐.");
        System.out.println(sb1.toString()+sb1.hashCode());

        //2 replace
        sb1.replace(0,2,"달이 예쁘네요."); //0번째부터 (2-1)번쨰까지의 문자열 "안녕"을 제거하고 "달이 예쁘네요." 라고 바꾼다.
        System.out.println(sb1.toString()+sb1.hashCode());

        //3 reverse
        sb1.reverse(); //뮤터블 문자열을 반대로 뒤집는다.
        System.out.println(sb1.toString());

        //4 delete
        sb1.delete(10,15);//10번째부터 (15-1)까지의 문자열을 지운다. 자리는 0부터 시작한다.
        System.out.println(sb1.toString());

        //5 cal by reference, shallow copy
        replaces(sb1); //StringBuffer가 뮤터블하기 때문에 문자열을 변경한다.
        System.out.println(sb1.toString());
    }
    public static void replaces(StringBuffer sb){
        sb.reverse();
        sb.replace(0,3, "Rock Lee Go !"); //0부터 2까지를 ""로
    }
}
