package JavaClass.햄버거;

public class 치즈버거 extends 햄버거{
    public 치즈버거() {
        this.name = ("치즈버거");

    }
    public void cook(){
        super.cook();
        System.out.println("+ 치즈");
    }


}
