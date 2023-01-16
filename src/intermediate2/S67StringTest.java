package intermediate2;

public class S67StringTest {
    public static void main(String[] args) {
        String text = " Hello Java4Android";
        String com = " HEllo Java4Android";

        System.out.println(text.charAt(2)); //자바에서 위치(index)는 0부터 시작한다. ' ', 'H', 'e'이므로 2번째 index 문자는 'e'
        System.out.println(text.concat("s")); // concat() = +, 문자열 's'를 우측에 붙인다.
        System.out.println(text.contains("And"));   //"And"문자열을 포함하고 있는지 판별한다.
        System.out.println(text.equals(com));//두 문자열이 같은지 판별한다 false
        System.out.println(text.equalsIgnoreCase(com));//대소문자 구별 않고 두 문자열이 같은지 판별한다.
        System.out.println(text.indexOf("a"));// 문자열(혹은 문자)이 처음 발견된 위치를 반환, 없다면 -1 반환. index=8
        System.out.println(text.lastIndexOf("a"));//문자열(혹은 문자)이 가장 뒤쪽에서 발견된 위치를 반환, 없다면 -1 반환. index=10
        System.out.println(text.trim()); //양쪽의 공백을 제거
        System.out.println(text.length());//공백을 포함한 문자열의 길이를 반환 = 19
        System.out.println(text.substring(7));//입력된 위치의 문자열 앞쪽을 자른 다음, 그 위치부터 뒤쪽을 반환한다. 0~6번째를 잘라버리고 7이후를 반환한다. = Java4Android
        System.out.println(text.substring(7, 11));// substring(index1, index2)는 index1부터 (index2-index1)자를 반환한다. = Java
        System.out.println(text.replace(" ", "-")); //replace(oldc, newc)는 oldc를 newc로 변환한다.
        System.out.println(text.replaceAll(" ", "-"));
        System.out.println(text.toUpperCase()); //모두 대문자로
        System.out.println(text.toLowerCase()); //모두 소문자로

        String[] sp = text.split(" "); //split(del)은 del 문자를 기준으로 문자열을 잘라 배열로 반환한다. " "를 기준으로 분할하기 때문에 sp ={"", "Hello", "Java4Android"}로 분할된다.
        for (int i = 0; i<sp.length; i++){
            System.out.println(i + "\t\t" + sp[i] + "\t\t" + sp[i].length());
        }
    }
}
