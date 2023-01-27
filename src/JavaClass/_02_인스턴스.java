package JavaClass;

public class _02_인스턴스 {
    public static void main(String[] args) {
        //처음만든 블랙박스 제품
        블랙박스 b1 = new 블랙박스();
        b1.modelName = "까망";
        b1.resolution = "fnd";
        b1.color = "블랙";
        b1.price = 20000;

        System.out.println(b1.color + " " + b1.price + " " + b1.resolution + " " + b1.modelName );
        System.out.println("-------------------");

        블랙박스 b2 = new 블랙박스 ();
        b2.modelName = "하양이";
        b2.resolution = "ic";
        b2.price = 30000;
        b2.color = "red";

        System.out.println(b2.color + " " + b2.price + " " + b2.resolution + " " + b2.modelName );
    }
}
