package JavaClass;

public class _배열 {
    public static void main(String[] args) {
     //배열: 같은 자료형의 값 여러개를 저장하는 연속공간

    //배열선언 첫번째 방법
    //String[] Coffe = new String[2];

    //배열선언 두번째 방법
    //String Coffe[] = new String[1];
    //    Coffe[1] = "아메리카노";
    //    Coffe[2] = "아아";
    //세번째 방법
        String[] coffe = new String[]{
          "아메리카노", "아아", "라뗴" , "몰라"      };

        //배열 순회
        for(int i =0; i< coffe.length; i++){
            System.out.println(coffe[i]);
        }
        boolean[] b = {true, false, true};
        for(int i = 0; i < 3; i++){
            System.out.println(b[i]);
        }
        System.out.println("------------");
        //forech 사용법
        for (String coffes: coffe) {
            System.out.println(coffes);
        }

    }
}
