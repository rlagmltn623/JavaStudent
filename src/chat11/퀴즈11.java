package chat11;

public class 퀴즈11 {
    public static void main(String[] args) {
        //인기가 많은 상품이 선착순으로 판매되는 온라인 쇼핑몰에서 발생할 수 있는 문제를
        //처리하는 프로그램을 작성하시오.

        //발생 가능 문제의 2가지 조건: 상품 구매 가능 시간, 상품매진
        // 각 문제에 대한 사용자 정의 예외 클래스 작성
        // 에러 코드에 따른 의도적 예외 발생 및 예외 처리
        int i = 2;
        try{
           switch (i){
               case 0:
                   System.out.println("상품 구매를 완료했습니다.");
                   break;
               case 1:
                   throw new User("상품 구매 가능 시간이 아닙니다.");
               case 2:
                   throw  new User1("해당 상품은 모두 매진되었습니다.");
               default:
                   System.out.println("모두 해당하지 않습니다.");
           }
        }catch (User e){
            System.out.println(e.getMessage());
            System.out.println("상품 구매는 20시부터 가능합니다.");
        }catch (User1 e){
            System.out.println(e.getMessage());
            System.out.println("다음 기회에 이용해주세요");
        }
    }
}

class User extends Exception{
    public User(String message){
        super(message);
    }

}

class User1 extends Exception{
    public User1(String message){
        super(message);
    }

}
