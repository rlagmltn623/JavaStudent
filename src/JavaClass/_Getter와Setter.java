package JavaClass;

public class _Getter와Setter {
    public static void main(String[] args) {
        블랙박스 b1 = new 블랙박스();


        //할인 행사
        b1.setPrice(-5000);
        b1.setModelName("김희수");
        b1.setColor("레드");

        System.out.println("가격:" + b1.getPrice() + "원");
        System.out.println("해상도: " + b1.getResolution());


    }
}
