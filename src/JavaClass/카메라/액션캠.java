package JavaClass.카메라;

public class 액션캠 extends 카메라{

    //완전히 바꾸지 못하게 하려면 finall 넣어주면됨

    public final String lens; //= "광각렌즈";
    public 액션캠() {
        super("액션 카메라");
        lens = "광각렌즈";
    }

    public void make(){
        System.out.println(this.name + " : " +  this.lens + ": 멋진 비디오를 제작합니다.");
    }
}
