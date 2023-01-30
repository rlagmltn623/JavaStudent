package Chat09;

import com.sun.xml.internal.ws.encoding.soap.SOAP12Constants;

public class Wrapper {
    public static void main(String[] args) {
        // 래퍽 클래스
        //int double flaot char
        //모두 대문자로 시작하면 됨

        Integer i = 123; //int i = 123
        Double d = 1.0; //double d = 1.0;
        Character c = 'A'; //char c = 'A';

        System.out.println(i);
        System.out.println(d);
        System.out.println(c);

        System.out.println("------");

        System.out.println(i.intValue());
        System.out.println(d.intValue()); //실수를 인트로 바꾼다
        System.out.println(c.charValue());
        System.out.println("------");

        String S = i.toString();
        System.out.println(S);

    }
}
