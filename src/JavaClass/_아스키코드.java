package JavaClass;

public class _아스키코드 {
    public static void main(String[] args) {
        //아스키 코드 : 미국 표준코드
        char c = 'A'; //대문자 A는 65부터 시작, 소문자(a)는 97부터 시작, 숫자(0) 48부터 시작

        System.out.println(c);
        System.out.println((int)c);//65숫자가 나옴
        c = 'b';
        System.out.println(c);
        System.out.println((int)c);

        c++;
        System.out.println(c);
        System.out.println((int)c);
    }
}
