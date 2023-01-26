package JavaClass;

public class _04_퀴즈 {
    public static void main(String[] args) {
        //조건문을 활용하여 주차 요금 정산 프로그램
        // 주차요금은 시간당 4000원 (일일 최대 요금은 30000원)
        // 경차 또는 장애인 차량은 최종 요금에서 50% 할인

        //주차요금 예시
        // 일반 차량 5시간 주차 시 20000원
        // 경차 5시간 주차 시 10000원
        // 장애인 차량 10시간 주차시 15000원
        // 일반 차량 4000 * 5 = 20,000
        // 경차 2000 * 5000 = 10,000
        // 4000 * 10/ 2 = 15,000
        // 1일 최대 금액 30000원

        int 차량 = 4000;
        int 일일 = 5;

        for(int i = 1; i <= 10; i++){

            if(i == 5){
                System.out.println("주차요금은"+ 차량 * 일일 +"원 입니다.");
                System.out.println("주차요금은"+ 차량 * 일일 / 2 +"원 입니다.");

            } else if (i == 10) {

                System.out.println("주차요금은"+ 차량 * 10 / 2 +"원 입니다.");

            }

        }

        System.out.println("----------------");
        //해답
        int num = 5; //주차시간
        boolean isSmallcar = false;
        boolean 장애인 = true;

        int free = 4000 * 10;
        if(free > 30000){
            free = 30000;
        }
        if(isSmallcar || 장애인){
            free /= 2; //50% 할인적용
        }

        //실행결과
        System.out.println("추가 요금은" + free + "동일합니다.");

    }
}
