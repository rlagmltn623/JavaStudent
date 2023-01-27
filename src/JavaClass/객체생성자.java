package JavaClass;

public class 객체생성자 {
    public static void main(String[] args) {
        블랙박스 b1 = new 블랙박스("하양이", "fnd", 2000, "red");
        System.out.println(b1.modelName + "  " +  b1.resolution + "  " + b1.price + "  "+ b1.color + "  " + b1.seralNumber);

        블랙박스 b2 = new 블랙박스("하양이", "fnd", 2000, "red");
        System.out.println(b2.modelName + "  " + b2.resolution + "  " + b2.price + "  " + b2.color+ "  "  + b2.seralNumber);
    }

}
