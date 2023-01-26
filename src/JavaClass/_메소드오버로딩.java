package JavaClass;

public class _메소드오버로딩 {
    // 메소드 오버로딩: 이름이 같은 메소드를 여러게 만드는것
    public static int getpower(int number){
        //int result = number* number;
        return number * number;
    }

    public static int getpower(String strnumber){
        //문자열을 인트로 바꿔주기
        int number = Integer.parseInt(strnumber);
        return number * number;
    }

    public static int getpower(int number, int exponent){
        //문자열을 인트로 바꿔주기
        int result = 1;
        for (int i = 0; i < exponent ; i++) {
            result *= number;

        }
        return result;
    }
    public static void main(String[] args) {
        //메소드 오버로딩
        //같은 이름의 메소드를 여러 번 선언
        // 1. 전달값의 타입이 다르거나
        // 2. 전달값의 갯수가 다르거나
        System.out.println(getpower(3));//3*3 = 9
        System.out.println(getpower("4")); //4*4 = 16
        System.out.println(getpower(3, 3)); // 3*3 * 3 =27
    }
}
