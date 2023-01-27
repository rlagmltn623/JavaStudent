package JavaClass;

public class _접근제어자{
    public static void main(String[] args) {
        //접근 제어자
        // private : 해당 클래스 내에서만 접근 간으
        // public : 모든 클래스에서 사용가능 (공개)
        // default : (아무것도 적지 않았을 때) 같은 패키지 내에서만 가능
        // protected : 같은 패키지 내에서, 다른 패키지인 경우 자식 클래스에서 접근 가능
        블랙박스리퍼 b1 = new 블랙박스리퍼();
        //ctrl + r 누르면 글자를 바꿀 수 있는 기능이 있다.

        //할인 행사
        b1.modelName = "김희수";
        b1.color = "블랙";
        b1.setPrice(-50000);

        System.out.println("가격:" + b1.getPrice() + "원");
        System.out.println("해상도: " + b1.getResolution());


        블랙박스리퍼 b2 = new 블랙박스리퍼();
        //ctrl + r 누르면 글자를 바꿀 수 있는 기능이 있다.

        //할인 행사
        b2.setPrice(-5000);
        b2.setModelName("김희수");
        b2.setColor("레드");

        System.out.println("가격:" + b2.getPrice() + "원");
        System.out.println("해상도: " + b2.getResolution());

    }
}
