package JavaClass.카메라;

// 팩토리캠 is a 카메라 (IS -A)
public class 팩토리캠 extends 카메라 { //자식 클래스


    public 팩토리캠() {
        super("공장카메라");

    }


    public void fire(){
        //속도 체크
        System.out.println("화재를 감지합니다");
    }
    public void showmain(){
        System.out.println(this.name + "의 주요 기능: 화재감지");

    }
    public  void recode(){
        //동영상 녹화
        super.recode();
        fire();
    }
}
