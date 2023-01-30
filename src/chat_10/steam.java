package chat_10;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class steam {
    public static void main(String[] args) {
        //stream 스트림
        //5명의 학생들을 관리하는 배열
        //스트림 생성
        int[] scores = {100, 95, 90, 85, 80};
        IntStream scoreStream = Arrays.stream(scores);

        String[] legns = {"python", "java", "c", "javascripct", "c++", "c#"};
        Stream<String> stream = Arrays.stream(legns);

        //collection.stream();
        List<String> langlist = new ArrayList<>();

        langlist = Arrays.asList("python", "java", "c", "javascripct", "c++", "c#");
        System.out.println(langlist.size());
        Stream<String> langliststream = langlist.stream();


        //stream of 사용법
        Stream<String> langliststrea = Stream.of("python", "java", "c", "javascripct", "c++", "c#");


        //스트림 사용
        //중간 연산(Intermediate Operation): filter, map, sorted, disinct, skip ....
        //최종 연산(Terminal Operation): count, min, max, sum, forEach, anyMatch, allMatch

        //90점 이상인 점수만 출력
        Arrays.stream(scores).filter(x -> x>= 90).forEach(x -> System.out.println(x));
        System.out.println("---------------");

        //위와 같다 Arrays.stream(scores).filter(x -> x>= 90).forEach(System.out::println);
        //90 점 이상인 사람의 수
        int count = (int) Arrays.stream(scores).filter(x-> x >=90).count();
        System.out.println(count);

        //90 점 이상인 점수의 합
        int sum = Arrays.stream(scores).filter(x-> x >=90).sum();
        System.out.println(sum);

        //90 점 이상인 점수들을 정렬
        Arrays.stream(scores).filter(x-> x >=90).sorted().forEach(System.out::println);
        System.out.println("------------");

        // legns "python", "java", "c", "javascripct", "c++", "c#"
        // c로 시작하는 프로그램 언어
        Arrays.stream(legns).filter(x -> x.startsWith("c")).forEach(System.out::println);
        System.out.println("-----------------");

        // java를 포함하는 언어
        Arrays.stream(legns).filter(x -> x.contains("java")).forEach(System.out::println);
        System.out.println("-----------------");

        //4글자 이하의 숫자와 정렬해서 출력
        Arrays.stream(legns).filter(x -> x.length() <= 4).sorted().forEach(System.out::println);
        System.out.println("-----------------");
        //위와 같은 문제로 리스트를 할것.
        langlist.stream().filter(x -> x.length() <= 4).sorted().forEach(System.out::println);
        System.out.println("-----------------");

        //4글자 언어중에서 c라는 글자만 뽑아볼것
        langlist.stream().filter(x -> x.length() <= 4).filter(x -> x.contains("c")).forEach(System.out::println);
        System.out.println("-----------------");

        // 4글자 이하의 언어 중에서 c를 포함되는 확인할 것
        int i = 4;
        boolean anyMatch  = langlist.stream().filter(x -> x.length() <= i ).anyMatch(x -> x.contains("c"));
        System.out.println(anyMatch);
        System.out.println("-----------");

        // 4글자 이하의 언어들은 모두 c를 포함하는지 여부
        boolean allMatch  = langlist.stream()
                .filter(x -> x.length() <= 3 )
                .allMatch(x -> x.contains("c"));
        System.out.println(allMatch);
        System.out.println("---------");

        // 4글자 이하의 언어중에서 c라는 글자를 포함하는 언어 뒤에 (어려워요) 라는 글자를 함꼐 출력
        //map
        langlist.stream()
               .filter(x -> x.length() <= 4)
               .filter(x -> x.contains("c"))
               .map(x -> x + "(어려워요)")
               .forEach(System.out::println);
        System.out.println("---------");

        //대문자로 바꿔서 출력하기
        //c라는 글자를 포함하는 글자를 대문자로 변환
        langlist.stream()
                .filter(x -> x.length() <=4)
                .filter(x -> x.contains("c"))
                .map(String::toUpperCase)
                //.map(x -> x.toUpperCase()) 이렇게 사용해도 됨.
                .forEach(System.out::println);
        System.out.println("---------");


        //c 라는 글자를 포함하는 언어를 대문자로 변경하여 리스트로 저장
        List<String> langListStartWithc = langlist.stream()
                .filter(x -> x.length() <=4)
                .filter(x -> x.contains("c"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        langListStartWithc.stream().forEach(System.out::println);

        //한번사용하면 다시 만들어야한다.
    }
}
