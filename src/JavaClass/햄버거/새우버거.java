package JavaClass.햄버거;

public class 새우버거 extends 햄버거{
    public 새우버거() {
        this.name = ("새우버거");
    }
    public void cook(){
        //햄버거에 다 넣음
        super.cook();
        System.out.println("+ 새우");
    }
}
