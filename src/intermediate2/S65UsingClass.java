package intermediate2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/*
Object의 getClass() 메서드는 Class를 반환한다. Class는 해당 클래스의 선언된 메서드와 생성자들을 반환하는 메서드를 제공한다.
getDeclaredConstructors()는 선언한 생성자, getMethods()는 선언된 메서드를 제공한다.
Class는 모든 객체에 대한 객체 자신의 정보(생성자 관련, 메서드 관련) 등을 제공한다. 이를 Reflection이라고 한다.
*/

public class S65UsingClass {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Class classes = obj1.getClass(); //클래스에 대한 모든 정보는 java.lang.Class를 이용한다.
        System.out.println(classes.getName()); //클래스 이름을 리턴한다.

        System.out.println("-----constructor------");

        //클래스의 모든 생성자를 리턴한다. 생성자에 대한 모든 정보는 java.lang.reflect.Constructor를 이용하여 얻는다. 모든 생성자를 리턴하므로 배열로 받는다.
        Constructor[] constructor = classes.getDeclaredConstructors();

        //향상된 for(foreach)를 이용해 생성자의 이름을 출력한다.
        for(Constructor con : constructor){
            System.out.println(con.getName());
        }

        System.out.println("------Method--------");

        //클래스의 모든 메서드를 리턴한다. 모든 메서드를 리턴하므로 배열로 받는다.
        Method[] method = classes.getMethods();

        //향상된 for(foreach)를 이용해 메서드의 이름을 출력한다.
        for(Method me : method){
            System.out.println(me.getName());
        }
    }
}
