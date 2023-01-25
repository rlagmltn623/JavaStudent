package JavaClass;

public class _퀴즈02 {
    public static void main(String[] args) {
        //어린이 키에 따른 놀이 기구 탑승 가능여부를 확인하는 프로그램
        //조건 키 120cm 이상인 경우에만 탑승가능
        //삼항 연산자 이용

        //결과 물 키카 115cm 이므로 탑승 불가

        int a = 121;
        int b = 115;

        int x = (a == b) ? a  :
                 b; //115cm 이므로 탑승불가
        int g = (a != b) ? a  :
                b; //115cm 이므로 탑승불가
        System.out.println(x +"cm 이므로 탑승불가");
        System.out.println(g +"cm 이므로 탑승가능");
    }
}
