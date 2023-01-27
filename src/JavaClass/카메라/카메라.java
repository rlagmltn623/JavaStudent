package JavaClass.카메라;

public class 카메라 { //부모 클래스
    //부모는 하나의 클래스만 상속 받을 수 있음
    public String name;

    public 카메라(){
        this("카메라");

    }

    protected 카메라(String name){
        this.name ="카메라";
    }
    public  void takePictuer(){
        //사진촬용
        System.out.println(this.name + ": 사진을 촬영합니다.");

    }

    public  void recode(){
        //동영상 녹화
        System.out.println(this.name + "녹화를 시작합니다.");
    }

    public void showmain(){
        System.out.println(this.name + "의 주요 기능: 사진 촬영, 동영상 녹화 ");

    }
}
