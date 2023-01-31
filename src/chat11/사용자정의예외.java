package chat11;

public class 사용자정의예외 {
    public static void main(String[] args) {
        int age = 17; //만 17세

        try {
            if(age < 19){
                //System.out.println("만 19세 미만에는 판매하지 않습니다.");
                //일부러 에러 발생
                throw  new Age19("만 19세 미만에는 판매하지 않습니다.");
            }else {
                System.out.println("주문하신 상품 여기 있습니다.");
            }

        }catch (Age19 e){
            System.out.println("조금 더 성장한 뒤에 오세요");
        }

        catch (Exception e){
            System.out.println("모든 예외를 처리합니다.");
        }
    }
}
//사용자 정의 예외 클래스 만듬
class Age19 extends Exception{
    public Age19(String message) {
        super(message);
    }

}