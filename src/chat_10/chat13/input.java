package chat_10.chat13;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        //사용자 입력
        Scanner sc = new Scanner(System.in);
//        System.out.println("이름을 입력하세요.");
//        String name = sc.next();
//        System.out.println("혈액형을 입력하세요.");
//        String bloodType = sc.next();
//        System.out.println("키를 입력하세요 ");
//        int height = sc.nextInt();//이렇게 해도 되고
//        //int kk  = Integer.parseInt(sc.next()); //이렇게 해도됨
//        System.out.println("몸무게를 입력하세요");
//        //int kk  = Double.parseInt(sc.next()); //이렇게 해도됨
//        double kw = sc.nextDouble();
//
//
//        System.out.println("입력하신 정보는 다음과 같습니다.");
//        System.out.println("이름:  " + name);
//        System.out.println("혈액형:  " + bloodType);
//        System.out.println("키: " + height);
//        System.out.println("몸무게: " + kw);

        System.out.println("무슨 프로그램을 배웠나요?");
        //String lang = sc.next(); 이렇가면 뛰어쓰기가 된다.
        String lang = sc.nextLine(); //한줄로 표현된다.
        System.out.println("언어 : " + lang);
        System.out.println("배우고 나니 기분이 어땠나요? ");
        String 기분 = sc.nextLine(); //한 문장(재밌었어요)
        System.out.println("기분: " + 기분);
    }
}
