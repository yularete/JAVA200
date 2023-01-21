package intermediate2;

public class S76UsingCharacterMain {
    /*
    랩퍼 클래스는 기본 타입을 참조 타입으로 변환하거나, 무자열을 기본 타입으로 변환하는 등 기본 타입 처리에 필요한 메서드를 제공한다.
    Character는 char에 대한 성격(숫자형인ㄴ가, 알파벳인가, 공백 문자인가 등)을 확인하거나 숫자형 문자를 숫자로 변환하는 데 사용한다. char와 Character는 서로 자동 변환(박싱/언박싱)할 수 있다.
    */
    public static void main(String[] args) {
        Character char1 = new Character('W'); // Character 클래스의 객체를 생성, Character chr1 = 'W'와 동일.
        Character char2 = new Character('9'); //Character 클래스의 객체를 생성, Character chr1 = '9'와 동일, 48+9

        if(Character.isLetter(char1.charValue())){
            System.out.println("1 : "+char1.charValue());
            /*
            Character 클래스의 static 메서드 isLetter를 호출한다. isLetter는 문자가 입력되면 해당 문자의 문자(letter, character)여부를 boolean 타입으로 리턴한다.
            chr1.charValue()는 객체에 대입되었던 문자('W')를 리턴한다. 'W'가 문자이므로 isLetter('W')는 true이다.
            */
        }
        System.out.print(" ");
        System.out.print('\u0057'); // '\u0057'는 유니코드(16진수 char)로 57(16)=87('W')이다.
        System.out.print("\t");
        System.out.println(Integer.toHexString((int)char1)); //'W' int로 변환하면 87이다. Integer.toHexString(87)이다. Integer.toHexString(87)는 정수 87을 16진수 문자열로 변환하므로 "57"이다.
        System.out.println((int)char1); //87 -> 5*16+7
        if(Character.isDigit(char2.charValue())){ //Character 클래스의 static 메서드 isDigit를 호출한다. isDigit는 문자가 입력되면 해당 문자의 숫자(Digit, number) 여부를 boolean 타입으로 리턴한다. 정수를 얻으려면 (int)로 캐스팅.
            System.out.println("2 : " +(int)char2.charValue()); //'9'=48+9
        }

        System.out.println("3 : " + Character.getType('a')); //소문자 2 //Character 클래스의 static 메서드 getType을 호출한다. getType은 문자가 입력되면 이 문자가 속한 분류를 int로 리턴한다.
        System.out.println("4 : " + Character.getType('A')); //대문자 1
        System.out.println("5 : " + Character.getType('3')); // 숫자 9
        System.out.println("6 : " + Character.getType('&')); //특수문자 24
        //OTHER_PUNCTUATION 24
        System.out.println("7 : " + Character.getType('\n')); //white Space(공백 문자) 15
        System.out.println("8 : "+(int)'\b'); // 8 , 뒤로 한 칸(Backspace)인 \b의 값을 알기 위해 (int) 캐스팅.
        //9~13, 28~31 white space
        System.out.println("9 : " +(int)'\t'); //9 //white space의 값을 알기 위해 (int) 캐스팅한다.
        System.out.println(""+(int)'\n'); // 10
        System.out.println(""+(int)'\f'); // 12
        System.out.println(""+(int)'\r'); // 13
        System.out.println("3 : " + Character.getNumericValue('9')); // charValue()는 9를 리턴한다. static 메서드 getNumericValue를 이용하면 문자(char)의 int값을 쉽게 얻을 수 있다.
                                                                        // getNumberValue('9') 또는 getNumericValue(chr2.charValue())는 '9'의 숫자인 9를 리턴한다. '9'-'0'을 이용해도 9를 얻을 수 있다.
        System.out.println("" + Character.isWhitespace(' ')); //공백 문자인지 확인하는 isWhitespace statix 메서드를 호출한다.
        System.out.println("" + Character.isWhitespace('\n'));
        System.out.println("" + Character.isWhitespace('\r'));
        System.out.println("" + Character.isWhitespace('\b'));
        System.out.println("" + Character.isLetterOrDigit('9')); //숫자나 일반 문자인지 확인하는 메서드를 호출한다.
        System.out.println("" + Character.isLowerCase('A')); //소문자인지 확인하는 메서드 호출
        System.out.println("" + Character.isUpperCase('A'));// 대문자인지 확인하는 메서드 호출

        //radix 기수 0~9가 기본
        //digit(number, radix) static 메서드를 호출한다. radix보다 작은 number 숫자 타입 문자를 입력하면 int 타입 숫자로 리턴한다. digit('8',9)는 9보다 작은 정수 8을 반환.
        System.out.println(""+Character.digit('8',9));
        //SPACE_SEPARATOR 12 '\f'
        // LINE_SEPARATOR 13'\r'
        // PARAGRAPH_SEPARATOR 14
        //SPACE 32
        System.out.println(""+(int)' ');//32
        System.out.println(""+Character.isSpaceChar(' '));
        System.out.println(""+Character.isSpaceChar('\n'));
    }
}
