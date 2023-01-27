package JavaClass;

public class 열거형 {
    public static void main(String[] args) {
        //열거형
        //달력: Jun, feb, mar
        레볼루션 re = 레볼루션.HD;
        System.out.println(re);

        System.out.println("동영상 녹화 품질");

        switch (re){
            case HD:
                System.out.println("일반화질");
                break;
            case FND:
                System.out.println("고화질");
                break;
            case UHD:
                System.out.println("초고화질");
                break;
            default:
                System.out.println("잘못되었습니다");
        }
        re = 레볼루션.valueOf("UHD");
        System.out.println(re);
        System.out.println("----------------------");
        //value 하면 하나씩 꺼내 보는거
        for (레볼루션 ic: 레볼루션.values()) {
            System.out.println(ic.name() + "" + ic.ordinal());
        }
        System.out.println("----------------------");
        for (레볼루션 ic: 레볼루션.values()) {
            System.out.println(ic.name() + " " + ic.getWidth());
        }
    }
}

enum 레볼루션{
    HD(1280), FND(1920), UHD(3840);

    private final int width;

    레볼루션(int width){
        this.width = width;
    }

    public int getWidth(){
        return width;
    }
}
