package JavaClass;

public class _10_삼항연산자 {
    public static void main(String[] args) {
    // 결과 = (조건) ? (참일경우의 결과값:) : (거짓일 경우의 결과 값)
        int x = 3;
        int y = 5;
        int max = (x>y) ? x : y ;
        System.out.println(max); // 5 앞에 참이 아니기 때문에 뒤에 Y값인 5가 나온다

        int min = (x < y) ? x : y;
        System.out.println(min); //3 앞에 참이기 때문에 값이 3이 나온다.
        boolean pass = (x==y) ? true : false;
        System.out.println(pass);
    }
}
