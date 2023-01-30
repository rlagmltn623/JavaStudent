package Chat09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _ArrayList {
    public static void main(String[] args) {
        // 컬렉션 프레임 워크 (List, set, Map)
        //많은 데이터를 편리하게 관리하는거
        ArrayList <String> List = new ArrayList<>();

        //데이터 추가
        List.add("유재석");
        List.add("김종국");
        List.add("박명수");
        List.add("조세호");
        List.add("강호동");

        //데이터 조회 (인덱스)

        System.out.println(List.get(0));
        System.out.println(List.get(1));
        System.out.println(List.get(2));
        System.out.println(List.get(3));
        System.out.println(List.get(4));


        System.out.println("-------------");

        //삭제하는 방법
        System.out.println("신청학생 수 (이사전): " + List.size()); //5
        List.remove("박명수");
        System.out.println("신청학생 수 (이사후): " + List.size()); //4

        System.out.println("-------------");
        System.out.println("남은 학생 수 (제외 전)" + List.size());
        // 1을 무족건 지운다.
        // 마지막을 지운다.
        List.remove(List.size() - 1);
        System.out.println("남은 학생 수 (제외 후)" + List.size());

        System.out.println("-------------");
        //순회
        for (String s: List) {
            System.out.println(s);
        }
        System.out.println("-------------");
        //변경 (순강권 양동)
        System.out.println("수강권 양도전: " + List.get(0));
        System.out.println("-------------");
        List.set(List.indexOf("유재석"), "이수근");
        for (String s: List) {
            System.out.println(s);
        }
        //확인
        System.out.println(List.indexOf("이수근"));

        //선착순 5명 내에 포홤되었는가?
        //contains true or fales
        if(List.contains("김종국")){
            System.out.println("수강신청 성공");
        }
        else {
            System.out.println("수강실패");
        }
        System.out.println("--------------");

        //전체삭제
        List.clear();
        //isEmpty
        if(List.isEmpty()){
            System.out.println("학생 수::" +List.size());
            System.out.println("리스트가 비웠습니다.");
        }
        System.out.println("--------------");

        //다음 학기에 새로 공부 시작
        List.add("유재석");
        List.add("김종국");
        List.add("박명수");
        List.add("조세호");
        List.add("강호동");

        // 정렬 가나다 순으로 정렬
        Collections.sort(List);
        for (String s: List) {
            System.out.println(s);
        }
    }
}
