package intermediate2;

import java.lang.reflect.Constructor; //Class에서 생성자와 메서드의 정보를 찾기 위해서 java.lang.reflect 패키지의 생성자와 메서드를 import 한다.
import java.lang.reflect.Method;

/*
리플렉션을 이용하면 클래스에 대한 생성자와 메서드 등에 대한 정보를 얻을 수 있다.
- 생성자는 new 예약어로 객체를 생성할 때 한 번 호출되는 초기화용 메서드이다. 생성자는 public String(char[])처럼 "제한자 클래스이름(인자)"의 형태로 사용된다.
- 메서드는 public int charAt(index)와 같이 "제한자 리턴타입 메서드이름(인자)"의 형태를 취한다.
- "제한자(modifier)"는 int 타입이므로 문자열로 변환해야 보기에 편리하다.
    예를 들어 1은 "public", 2는 "private"이다. 아규먼트나 리턴 타입에서 배열은"["로 시작하고, 타입은 "[C"처럼 "["뒤에 대문자를 붙인다. "[B"는 byte, "[C"는 char[]이다.
 */
public class S68UsingReflection {
    public static String toModi(int n) { //제한자(modifier)가 정수이므로 switch~case를 이용하여 정수에 대한 문자열로 변환한다.
        String s = "";
        switch(n){
            case 0 : s=" ";break;
            case 1 : s="public ";break;
            case 2 : s="private ";break;
            case 4 : s="protected ";break;
            case 8 : s="static ";break;
            case 10 : s="private static ";break;
            case 9 : //break를 만날 때까지 다음 case도 실행된다.(fall through 현상)
            case 137 : s="public static ";break;
            case 17 : s="public final ";break;
            case 257 : s="public  native ";break;
            case 260 : s="protected native ";break;
            case 273 : s="public final native ";break;
            default : s="xxxx"; break;
        }
        return s;
    }

    public static String toRe(String msg) {
        String s = "";
        if (msg.indexOf("[") != -1) { //아규먼트나 리턴 타입에 "["가 있으면 배열이다.
            if (msg.contains("[C")) { //"[C"는 char[]이다.
                s = msg.substring(msg.indexOf(" ") + 1).trim();
                s = s.replace("[C", "char[] ");
            } else if (msg.contains("[L")) { //"[L"는 java.lang.String[]이다.
                s = msg.substring(msg.indexOf(" ") + 1).trim();
                s = s.replace("[L", "").replace(";", "");
                s = s.concat("[]");
            } else if (msg.contains("[B")) { //"[B"는 byte[]이다.
                s = msg.substring(msg.indexOf(" ") + 1).trim();
                s = s.replace("[B", "byte[] ");
            }
        } else if (msg.indexOf(" ") != -1) {
            s = msg.substring(msg.indexOf(" ") + 1).trim();
        } else {
            s = msg.trim();
        }
        return s;
    }

    public static void main(String[] args) {
        Object obj1 = new Object();
        try {
            //Class classes=obj1.getClass();
            Class classes = Class.forName("java.lang.String"); // ClassNotFoundException
            System.out.println("--------------Method 찾기----------------");
            Method[] mes = classes.getDeclaredMethods();//모든 메서드를 얻는다.
            for (Method me : mes) { //메서드의 정보를 toModi, toRe메서드를 이용하여 출력한다.
                if (me.getModifiers() > 4000) {
                    continue;
                }    //  4000초과면  다음 스텝
                System.out.printf("%s\t\t", toModi(me.getModifiers()));  // 제한자 종류
                System.out.printf("%-30s\t\t", toRe(me.getReturnType().toString())); // 리턴 종류
                System.out.printf("%s", me.getName()); // 클래스 이름
                System.out.printf("(", ""); // 2개 이상일 때 ,로 표시
                Class[] aa = me.getParameterTypes(); // 아규먼트(인자, 파라메터)
                for (int j = 0; j < aa.length; j++) {
                    System.out.printf("%s", toRe(aa[j].getName()));  // 아규먼트의 이름
                    if (j != aa.length - 1) {   // 2개 이상이면
                        System.out.print(",");
                    }
                }
                System.out.printf(")", "");
                System.out.println();
            }
            System.out.println("--------------생성자 찾기----------------");
            Constructor[] constructor = classes.getDeclaredConstructors(); //모든 생성자를 얻는다.
            for (Constructor con : constructor) { //생성자의 정보를 toModi, toRe메서드를 이용하여 출력한다.
                System.out.print(con.getName());
                System.out.printf("(", "");
                Class[] aa = con.getParameterTypes();
                for (int j = 0; j < aa.length; j++) {
                    System.out.printf("%s", toRe(aa[j].getName()));
                    if (j != aa.length - 1) {
                        System.out.print(",");
                    }
                }
                System.out.printf(")", "");
                System.out.println();
            }
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}