package chat_10.chat13;

public class output {
    public static void main(String[] args) {
        //System.out.format("");

        System.out.println("------ 정 수 -------");
        System.out.printf("%d%n", 1);
        System.out.printf("%d %d %d%n", 1, 2, 3);
        System.out.printf("%d%n", 1234);
        System.out.printf("%6d%n", 1234);// __1234 6자리의 공간을 확보하고 난 뒤 1234출력
        System.out.printf("%06d%n", 1234); // 001234 (6자리 공간 확보하고 난 뒤 1234
        System.out.printf("%6d%n", -1234); // _-1234
        System.out.printf("%+6d%n", 1234); // _+1234
        System.out.printf("%,12d%n", 1000000000); // 1,000,000,000 3자리마다 콤마 적용
        System.out.printf("%-6d%n", 1234); //1234__ (6자리 공간을 활용)


        System.out.println("------ 실 수 -------");
        System.out.printf("%f%n", Math.PI); //3.141593 일반 출력
        System.out.printf("%.2f%n", Math.PI ); //소수점 둘째까지 3.14
        System.out.printf("%6.2f%n", Math.PI ); //오른쪽정렬
        System.out.printf("%-6.2f%n", Math.PI ); //왼쪽정렬
        System.out.printf("%06.2f%n", Math.PI ); //003.14
        System.out.printf("%.2f%n", 3.22222 ); //003.14

        System.out.println("------ 문 자 열 -------");
        System.out.printf("%s%n", "JAVA"); // 일반출력
        System.out.printf("%6s%n", "JAVA"); // __JAVA
        System.out.printf("%-6s%n", "JAVA"); // JAVA__
        System.out.printf("%6.2s%n", "JAVA"); // ____JA
        System.out.printf("%-6.2s%n", "JAVA"); // JA____

        System.out.println("------ 응 용 -------");
        System.out.println("이름 영어 수학 평균");
        System.out.println("강백호" + 90 + " " + 80 + " " + 85.0);
        System.out.println("서태용" + 100 + " " + 100 + " " + 100.0);
        System.out.println("채치수" + 95 + " " + 100 + " " + 97.5);

        System.out.println("------ 응 용2 -------");
        System.out.println("이름    영어    수학    평균"); //공백이 각각 6칸
        System.out.printf("%-6s %4d %4d %6.1f%n", "강백호", 90,80, 85.0 );
        System.out.printf("%-6s %4d %4d %6.1f%n", "서태용", 100,100, 100.0 );
        System.out.printf("%-6s %4d %4d %6.1f%n", "채치수", 95,100, 97.5 );
    }
}
