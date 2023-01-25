package JavaClass;

public class _09_논리연산자 {
    public static void main(String[] args) {
        boolean 논리연산 = true;
        boolean 논리연산2 = true;
        boolean 논리연산3 = false;


        System.out.println(논리연산 || 논리연산2 || 논리연산3);// 3개중에 하나라도 true면 true
        System.out.println(논리연산 && 논리연산2 && 논리연산3);// 3개중에 하나라도 false면 false

        System.out.println((3 > 1) &&  (3 < 1));
        System.out.println((3>1)|| (3< 1));

    }
}
