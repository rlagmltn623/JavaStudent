package JavaClass.카메라;


//스피드캠 is a 카메라.
public class 스피드캠 extends 카메라 { //자식 클래스

    public 스피드캠() {
        super("과속 단속카메라");

    }
    public  void takePictuer(){
        //사진촬용
        super.takePictuer();
        check();
        lize();
    }

    public void check(){
        //속도 체크
        System.out.println("속도를 측정합니다");
    }

    public void lize(){
        //번호 인식
        System.out.println("번호를 인식합니다.");
    }

    @Override //annotation 컴파일러에 알려주는거 이거 필수다
    public void showmain() {
        System.out.println(this.name + "의 주요 기능: 속도측정, 번호원칙 ");
    }

}
