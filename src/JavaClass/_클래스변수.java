package JavaClass;

public class _클래스변수 {
    public static void main(String[] args) {
        블랙박스 b1 = new 블랙박스();
        b1.modelName = "가망이";
        System.out.println(b1.modelName);

        블랙박스 b2 = new 블랙박스();
        b2.modelName = "하양이";
        System.out.println(b2.modelName);

        // 특정 범위를 초과하는 충돌 감지 시 자동 신고 기능
        System.out.println(" 개발전 ");
        System.out.println(b1.modelName + " 자동신고 기능"+ b1.cona);

        System.out.println(b2.modelName + "자동신고 기능:" + b2.cona);
        System.out.println("모든 블랙박스 제품 자동신고 기능"+블랙박스.cona);
        System.out.println("이름 개발전:" + 블랙박스.name); //권장되는 방식드
        //제품 개발 기능
        블랙박스.cona = true;
        블랙박스.name = "김희수";
        System.out.println("개발 후:" +b2.cona);
        System.out.println("개발 후 이름:" + b2.name);
    }

}
