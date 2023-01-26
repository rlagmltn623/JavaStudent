package JavaClass;

public class _반환값 {

    //반환값, return
    //호텔 전화번호
    //호텔 주소
    //호텔 액티비티


    //void 반환값이 없는 형태임
    //반환하려면 void 위치에 다른걸 적어줘야한다.
    public static String getphoneNumber(){
        String phonenumber = "02-529-5954";
        return phonenumber;
    }

    public static String address(){
//        String HoTell = "양재2동";
//        return  HoTell;
        return  "서울 어딘가";
    }

    public static String active(){
        return "볼링장"+ "야구장" + "게임장";
    }
    public static void main(String[] args) {

        //위에 반환 값을 받기 위해선
        String contectNumber = getphoneNumber();
        String hotell = address();
        System.out.println("호텔전화번호: "+contectNumber);
        System.out.println("호텔주소: "+ hotell);
        System.out.println("호텔 활동: " + active( ));
    }
}
