package chat11;

import javax.jws.soap.SOAPBinding;

public class Finally {
    public static void main(String[] args) {

        try {
            System.out.println("택시의 문을 연다");
            //throw  new Exception("휴무 예시");
            System.out.println("택시를 탑승한다.");
        }catch (Exception e){
            System.out.println("!! 문제 발생" + e.getMessage());
        }finally {
            //try 이던 catch이던 finally를 무족건 거친다
            System.out.println("택시의 문을 닫는다");
        }
        // try + catch
        // try + catch + finally
        // try + finally

        System.out.println("---------");

        try {
            System.out.println(3/0);
        }finally {
            System.out.println("프로그램 정상종료");
        }
    }
}
