package JavaClass;

public class _메소드 {
    //메소드
    //아래가 메소드다
    //메소드는 동사를 쓰는게 좋다
    //메소드 정의
    public static void sayhello(int number){
        //전달값이 있는 메소드
        System.out.println("안녕하세요 메소드 입니다.");
        int result = number * number;
        System.out.println(number + "의 2승은 " + result);
    }

    public static  void power(int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent ; i++) {
            result *= number;
        }
        System.out.println(number + " 의" + exponent + " 승은 " + result);
    }
    public static void main(String[] args) {

        //메소드 호출
        System.out.println("메소드 호출전");
        int a = 1;
        sayhello(2); //2*2 = 4가 출력됨
        sayhello(3); //3*3 = 9가 출력됨
        System.out.println("메소드 호출 후");

        power( 2, 3);//2*2 * 2 = 8
    }
}
