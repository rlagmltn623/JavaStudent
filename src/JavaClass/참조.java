package JavaClass;
import JavaClass.카메라.*;
import javax.jws.soap.SOAPBinding;

public class 참조 {
    public static void main(String[] args) {
        // 참조
        // 기본자료형: int, float, double, long, boolean
        int [] i = new int[3];
        System.out.println(i[0]);

        //참조자료형 : String, 카메라, 팩토리캠, 스피드캠

        String[] s = new String[3];
        System.out.println(s[0]); //null

        카메라[] c = new 카메라[3];
        System.out.println(c[0] == null); //true

        //기본 자료형은 소문자로 시작
        //참조 자료형은 대문자로 시작
        System.out.println("----------------");
        ////////////////////////
        int a = 10;
        int b = 20;
        b = a;
        System.out.println(a);
        System.out.println(b);
        카메라 c1 = new 카메라();
        카메라 c2 = new 카메라();

        c1.name = "카메라1";
        c2.name = "카메라2";
        c2 = c1;
        changeName(c2);
        System.out.println(c1.name);
        System.out.println(c2.name);
    }
    public static void changeName(카메라 camera){
        camera.name = "잘못된카메라";
    }

}
