package JavaClass;

public class _퀴즈06 {


    //해답
    public static String getHiddenData(String name, int id){
       String B =  name;

        for (int i = 0; i < name.length(); i++) {
            if(i == id){
                B = name.substring(0, id);
            }
            B += "*";
        }
        return B;

    }


    public static void main(String[] args) {
        //개인 정보 중 일부를 비공개로 전환하는 프로그램
        //개인정보를 비공개로 전환하는 메소드 작성
        //하나의 메소드에서 모든 동작 처리
        //각 정보는 아래 위치부터 비공개 적용
        // 이름: 2번째 글자 (나코딩)
        // 주민등록번호: 9번째 글자(990130-1234567)
        //전환번호: 10번째 글자(010-1234-5678)
        String name = "나코딩";
        String id = "990130-1234567";
        String phone = "010-1234-5678";

        System.out.println("이름:" + getHiddenData(name, 1));
        System.out.println("주민등록번호:" + getHiddenData(id, 8));
        System.out.println("전화번호:" + getHiddenData(phone, 9));
    }
}
