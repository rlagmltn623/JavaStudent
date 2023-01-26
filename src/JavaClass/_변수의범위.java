package JavaClass;

public class _변수의범위 {
    public static void method(){

    }

    public static void methodb(){
        int result = 1; //지역변수
    }
    public static void main(String[] args) {

        int number = 3;
        for (int i = 0; i < 5 ; i++) {
            System.out.println(i);
        }
    }
}
