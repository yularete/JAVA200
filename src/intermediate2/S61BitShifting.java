package intermediate2;

public class S61BitShifting {
    public static final int BITMASK = 1;
    public String makeBit(int value){
        char[] val = new  char[32]; // 문자를 저장할 문자 배열(char[])을 준비한다. int 타입이 32비트이므로 크기가 32인 배열을 만든다.
        for(int i=31; i>=0;i--){    //첫번째로 얻은 나머지를 가장 오른쪽에 저장하고 다음에 얻은 나머지를 우측에서 두 번째에 저장한다. 나중에 얻은 나머지일수록 더 좌측에 저장한다. 배열의 우에서 좌로 이동하기 위해 인덱스(위치)는 감소한다.
            if((value &BITMASK)==1){    // 1의 자리만 자르면 나머지가 되므로 비트 연산(&)한다. 나머지가 1이면 배열에 문자'1'을 저장하고, 0이면 '0'을 저장한다.
                val[i]='1'; //1&1일 때만 1, 그 외 0
            }else {
                val[i]='0'; //1&1일 때만 1 그 외 0
            }
            value >>>=1; //value = value>>>1; 부호 무시하고 오른쪽 이동.
            /*
            >>는 부호를 유지하면서 쉬프트 연산하지만, >>부호도 우측으로 쉬프트(이동)한다. 여이거 >>와 >>>는 같다. 9를 2진수로 변환하는 과정을 보면

            vlue의 값     value&BITMASK       >>> shift       char[] val
            -------------------------------------------------------------
            value=9      value & 1 = 1      value >>1=4      val[31]='1'
            value=4      value & 1 = 0      value >>1=2      val[31]='0'
            value=2      value & 1 = 0      value >>1=1      val[31]='0'
            value=1      value & 1 = 1      value >>1=0      val[31]='1' */
        }
        return new String(val); //char 배열을 String으로 ... char[] val = {'0','0',・・・,'0','1'};
                                                            // new String(val)은 "00000000000000000000100100101001"이 된다.
    }

    public static void main(String[] args) {
        int ival = 2345;
        int eval = -2345;
        S61BitShifting bitsh = new S61BitShifting();
        String vals=bitsh.makeBit(ival);
        System.out.println(vals);

        vals=bitsh.makeBit(eval);
        System.out.println(vals);

        char[] vs = vals.toCharArray();
        System.out.println(vs[0]);
    }
}

/*
* 문자열(String)은 내부적으로 char[]를 이용하여 만든 클래스이다. 그래서 문자열과 문자 사이의 변환 관계를 알고 있어야 한다.
* 1) 문자열.charAt(index)는 index 위치의 문자(char)를 반환한다.
* 2) 문자열.length()는 문자열의 길이(문자 개수)를 반환한다.
* 3) new String(char[])는 char[]를 문자열로 변환한다.
* 4) 문자열.toCharArray()는 문자열 내부에 저장된 문자들을 char[]로 반환한다.
* */