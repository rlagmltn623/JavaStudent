package chat_10;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class 익명클래스후반전 {
    public static void main(String[] args) {
        homebuger 엄마버거 = get엄마버거();
        엄마버거.cook();
        System.out.println("-----------");

        homebuger 브라운버거  = getBroMadbuger();
        브라운버거.cook();
        System.out.println("---------------");
    }

    private static homebuger getBroMadbuger() {
      return  new homebuger() {
          @Override
          public void cook() {
              System.out.println("집에서 만드는 동생표 햄버거");
              System.out.println("재료: 빵, 소고기패티, 해시브라운, 양상추");
          }
      };
    };

    public  static homebuger get엄마버거 (){
        return new homebuger() {
            @Override
            public void cook() {
                System.out.println("집에서 만드는 엄마표 수제버거");
                System.out.println("재료: 빵, 소고기패티, 해시브라운, 양상추");
            }
        };
    }
}

abstract class homebuger{
    public abstract void cook();
}