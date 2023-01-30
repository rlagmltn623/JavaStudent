package chat_10;

public class KRW컨버터 implements 컨버터블 {




    @Override
    public void covert(int USD) {
        // 1달러는 1400원
        System.out.println(USD + "달러 = " + (USD * 1400) + " 원");
    }
}
