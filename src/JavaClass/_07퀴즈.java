package JavaClass;

import JavaClass.햄버거.*;

public class _07퀴즈 {

    //클래스 이용하여 햄버거를 자동으로 만드는 프로그램 작성

    //햄벅의 종류는 햄버거, 치즈버거, 새우버거 3가지
    //각 버거는 각각의 클래스로 생성
    //버거 이름을 담기 위한 name 변수 정의
    //재료 정보를 표시하는 cook() 메소드 정의
    //공통 부분은 상속 및 메소드 오버라이딩으로 처리



    public static void main(String[] args) {
        햄버거[]  hm = new 햄버거[3];
        hm[0] =new 햄버거();
        hm[1] = new 치즈버거();
        hm[2] = new 새우버거();
        System.out.println();
        for (햄버거 bug: hm) {
            bug.cook();
            System.out.println("--------");
        }
        System.out.println("메뉴 준비가 완료되었습니다.");
    }
}
