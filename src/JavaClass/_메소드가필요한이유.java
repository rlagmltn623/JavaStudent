package JavaClass;

public class _메소드가필요한이유 {

    //동일한 형태에 문제들이면
    //실제 개발할때 수천번을 써야하지만
    //메소드를 사용하면 메소드만 불러와
    //코드 양을 줄일 수 있는 편리한 기능을 할 수 있다.
    public static int power(int number, int exponet){
        int result = 1;
        for (int i = 0; i < exponet ; i++) {
            result *= number;
        }
        return result;
    }
    public static void main(String[] args) {
       /* int result = 1;
        for (int i = 0; i < 2 ; i++) {
            result *= 2;

        }
        System.out.println(result); //2*2 =4

        result = 1;
        for (int i = 0; i < 3 ; i++) {
            result *= 3;

        }
        System.out.println(result); // 3* 3 * 3 = 27
        result = 1;
        for (int i = 0; i < 2 ; i++) {
            result *= 4;

        }


        System.out.println(result); //4*4 =16*/


        //2의 2승을 구하는거니깐
        int y = power(2, 2);
        System.out.println(y); //2*2 = 4
        //3의 3승 구하기
        System.out.println(power(3, 3)); //3*3*3 = 27
        //4의 2승 구하기
        System.out.println(power(4, 2)); //4*2 = 16
    }
}
