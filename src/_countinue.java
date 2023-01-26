public class _countinue {
    public static void main(String[] args) {
        //치킨 주문 손님중에 노쇼 손님있다가 정
        //for
        int max= 20;
        int sold = 0;
        int noShow = 17;
        for(int i = 1; i <= 50; i++){
            System.out.println("몇번손님" + i);

            if(i == noShow){
                System.out.println(i + "번 손님, 노쇼로 인해 다음손님에게 넘어갑니다.");
                continue; //이건 그냥 넘어가 다시 시작하는 기능
            }
            sold ++;
            if(sold == max){
                System.out.println("금일 재료가 소진되었습니다.");
                break;
            }

        }
        System.out.println("----------");

        //while 문
        sold = 0;
        int index = 1;
        while (true){
            index++;
            System.out.println(index + "번 손님, 주문하신 치킨나왔습니다.");
            if(index == noShow){
                System.out.println(index+"번 손님, 노쇼를 통해 넘어갑니다.");
                index++;
                continue;
            }
            sold++;
            if(sold == max){
                System.out.println("금일 재료가 소진되었습니다.");
                break;
            }
        }
        System.out.println("영업을 종료합니다.");
    }
}
