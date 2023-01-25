package JavaClass;

import java.sql.SQLOutput;

public class _11_문자열 {
    public static void main(String[] args) {
        String a = "I love like Java and kk.";

        System.out.println(a.length()); //문자열 갯수

        System.out.println(a.toUpperCase());//대문자로 변환
        System.out.println(a.toLowerCase());//소문자로 변환

        //포함관계 찾기
        System.out.println(a.contains("Java")); //contains를 통해서 java라는 문자열이 있는지 확인 있으면 true 없으면 false
        System.out.println(a.indexOf("Java")); //indexof를 사용해 java 문자열의 위치를 알려준다
        System.out.println(a.indexOf("C#")); //indexof를 사용해 포함되지 않는다면 -1
        System.out.println(a.indexOf("and")); //indexof를 사용해 처음 일치하는 정보
        System.out.println(a.lastIndexOf("and")); //indexof를 사용해 마지막 일치하는 정보
        System.out.println(a.startsWith("I love")); // 이 문자열로 시작하면 true 아니면 false
        System.out.println(a.endsWith("kk")); //이 문자열로 끝나면 true 아니면 false


        //문자열 전환
        System.out.println(a.replace(" and", ",")); //"한칸 띄우고 and" 를 ","로 변환
        System.out.println(a.substring(12)); //인덱스 기준 7부터 시작(이전 내용은 삭제)
        System.out.println(a.substring(a.indexOf("Java"))); //위에 처럼 해도 되지만 아래처럼 해도 된다.
        System.out.println(a.substring(a.indexOf("Java"), a.indexOf("."))); //시작 위치부터 끝 위치 "직전까지"

        //공백 제거 하는 방법

        String d = "           I Love Java.       ";
        System.out.println(d);
        System.out.println(d.trim());//공백저거

        //문자열 결합
        String s1 = "java" ;
        String s2 = "python" ;
        System.out.println(s1 + s2);
        System.out.println(s1 + "," +  s2);
        System.out.println(s1.concat(",").concat(s2)); //concat 사용할 수 있다

    }
}
