package JavaClass.카메라;

public class 느린액션캠 extends 액션캠{
    public 느린액션캠() {
        this.name ="슬로우 액션 카메라";
    }

    public void make(){
        System.out.println(this.name + " : " +  this.lens + "로 촬영한 영상을 통해 멋진 슬로우 모드" +
                "비디로을 제작합니다.");
    }
}
