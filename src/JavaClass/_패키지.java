package JavaClass;

import java.util.Random;

public class _패키지 {
    public static void main(String[] args) {
        //패키지 (랜덤클래스)
        Random random = new Random();
        System.out.println("랜덤 정수:" + random.nextInt());
        System.out.println("랜덤 정수:" + random.nextInt(10));//0이상 10미만의 값이 나옴
        System.out.println("랜덤 실수" + random.nextDouble());

        // 만약 5.0 이상 10.0 미만의 실수를 뽑으려면
        double min = 5.0;
        double max = 10.0;
        System.out.println("랜덤 실수" + (min- (max -min)) * random.nextDouble());


        //로또 번호를 뽑으려면
        System.out.println("로또 번호:" + random.nextInt((45) +1 ));
        // 0 이상 45 미만의 수
        // +1 : 1이상 46 미만의 수 = 1 이상 45 이하의 수
    }
}
