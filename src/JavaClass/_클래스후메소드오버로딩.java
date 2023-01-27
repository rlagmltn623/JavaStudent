package JavaClass;

public class _클래스후메소드오버로딩 {
    public static void main(String[] args) {
        블랙박스 b1 = new 블랙박스();
        b1.modelName = "까망이";

        b1.recode(false, false, 10);
        System.out.println("--------------");

        b1.recode(true, false, 3);
        System.out.println("--------------");
        b1.recode(true, true, 3);
        System.out.println("--------------");
        b1.recode();






    }
}
