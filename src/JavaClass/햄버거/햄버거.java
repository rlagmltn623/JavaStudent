package JavaClass.햄버거;

public class 햄버거 {
    public String name;
    public 햄버거() {
        this.name = "햄버거";
    }

    //super 쓰게 해주기 위한 함수


    public void cook(){
        //햄버거에 다 넣음
        System.out.println(this.name + "를 만듭니다.");
        System.out.println("빵에 들어갈 재료는");
        System.out.println("> 양상추");
        System.out.println("+ 패티");
        System.out.println("+ 피클");

    }


}
