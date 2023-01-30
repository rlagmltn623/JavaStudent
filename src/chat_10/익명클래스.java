package chat_10;

public class 익명클래스 {
    public static void main(String[] args) {
        //익명 클래스
        Coffee c1 = new Coffee();
        c1.order("아메리카노");

        System.out.println("---------");
        Coffee c2 = new Coffee();
        c2.order("라뗴");
        System.out.println("-------------");


        //과장히 친한 친구 행동
        //익명 클래스
        Coffee 프리엄커피 = new Coffee() {
            @Override
            public void order(String coffee) {
                super.order(coffee);
                System.out.println("(귓속말) 딸기케이크는 서비스에요");

            }


        };
        프리엄커피.order("바닐라라뗴");
        System.out.println("-----------------------");
        Coffee 반납 = new Coffee() {
            @Override
            public void returnTree() {
                super.returnTree();
                System.out.println("(귓속말) 자리에 두시면 제가 치울게요");
            }
        };
        반납.returnTree();
    }
}

class  Coffee {
    public void order(String coffee){
        System.out.println("주문하신 " + coffee + "나왔습니다.");
    }
    public void returnTree(){
        System.out.println("커피가 반납되었습니다.");
    }
}
