package JavaClass;

public class _break {
    public static void main(String[] args) {
        int max = 20;
        for(int i = 0; i <= 50; i++){
            System.out.println(i + "주문하신 치킨 나왔습니다" );
            if(i == max){
                break;
                //반복문 조욜
            }
        }
        int index = 1;
        while (index <= 50){
            System.out.println(index + "몇번소님");
            if(index == max){
                System.out.println("모두 소진되었습니다.");
                break;
            }
            index ++;
        }
    }
}
