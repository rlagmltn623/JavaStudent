package JavaClass;

public class _전달값반환값 {

    public static int getpower(int number){
        //int result = number* number;
        return number * number;
    }

    public static  int getpowerxp(int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent ; i++) {
            result *= number;
        }
          return result;

    }
    public static void main(String[] args) {
        int good = getpower(2); // 2* 2 = 4;
        System.out.println(2 * good);

        good = getpowerxp(3, 3); // 3* 3 * 3 = 27
        System.out.println(good); // 3* 3 * 3 = 27
    }
}
