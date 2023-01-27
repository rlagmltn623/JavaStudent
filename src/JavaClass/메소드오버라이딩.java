package JavaClass;
import JavaClass.카메라.*;
public class 메소드오버라이딩 {
    public static void main(String[] args) {
        //메소드 오버라이딩: 자식 클래스에서 부모 클래스의 메소드를 덮어쓰기
        카메라 carmera = new 카메라();
        팩토리캠 factory = new 팩토리캠();
        스피드캠 speed = new 스피드캠();

        carmera.showmain();
        factory.showmain();
        speed.showmain();

    }
}
