package JavaClass;

public class _클래스 {
    public static void main(String[] args) {
        //블랙박스 클래스로부터 bbox 객체 생성
        //bbox 객체는 블랙박스 클래스의 인스턴스
        블랙박스 Box = new 블랙박스();

        블랙박스 Box2 = new 블랙박스();
        //2개도 만들 수 있다.

        //새로운 블랙박스 제품
        블랙박스 b2 = new 블랙박스 ();
        b2.modelName = "하양이";
        b2.resolution = "ic";
        b2.price = 30000;
        b2.color = "red";

        System.out.println(b2.color + " " + b2.price + " " + b2.resolution + " " + b2.modelName );
    }

}
