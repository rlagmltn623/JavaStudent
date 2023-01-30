package chat_10;

public class 함수형인터페이스 {
    public static void main(String[] args) {
        KRW컨버터 covertble = new KRW컨버터();
        //컨버트.컨버트(1);
        컨버트USD(covertble,2);

        //람다형식
        컨버트USD((USD -> System.out.println(USD + "달러 = " + (USD * 1400)+ " 원 ")),1);
        컨버터블 covertable = (USD -> System.out.println(USD + "달러 = " + (USD * 1400)+ " 원 "));
        컨버트USD(covertable, 4);

        //전달 값이 하나도 없다면?
        컨버터블노프람스 c1 =() -> System.out.println("1달러는 14000원");
        c1.컨버터();

        //두 줄 이상의 코드가 있다면?
        c1 = () -> {
            int USD = 5;
            int KRW = 1400;
            System.out.println(USD + " 달러 = " + (USD * KRW)+ " 원");


        };
        c1.컨버터();

        컨버터블함께 c2 = (d, w) ->{
            System.out.println(d + " 달러 = " + (d * w)+ " 원");
        };
        c2.컨버터(10, 1400);

        //반환값이 있는 경우?
        컨버터블리턴 c3 = (d, w) -> d * w;
        int result = c3.컨버터(20, 1400);
        System.out.println("20달러 =림 " + result + " 원");

    }

    public static void 컨버트USD(컨버터블 covertble, int USD){
        covertble.covert(USD);
    }
}
