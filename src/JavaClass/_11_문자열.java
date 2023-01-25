package JavaClass;

public class _11_문자열 {
    public static void main(String[] args) {
        String a = "I love like Java and kk";

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



    }
}
