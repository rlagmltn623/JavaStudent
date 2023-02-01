import java.io.*;
import java.util.Scanner;
public class 퀴즈13 {
    public static void main(String[] args) {
        //속담 퀴즈 프로그램
        //퀴즈 내용은 saying.txt
        //문제 만들기
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("saying.txt"))){
            bw.write("세살__여든까지 간다");
            bw.newLine(); //줄바꿈
            bw.write("버릇"); //정답
            bw.newLine(); //줄바꿈
            bw.write("소 잃고___고친다"); //정답
            bw.newLine(); //줄바꿈
            bw.write("외양간"); //정답
            bw.newLine(); //줄바꿈
            bw.write("천 리 길도 한__부터"); //정답
            bw.newLine(); //줄바꿈
            bw.write("걸음"); //정답
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Scanner sc = new Scanner(System.in); //input 사용하기 위한

        try (BufferedReader br = new BufferedReader(new FileReader("saying.txt"))){
            System.out.println("속담 퀴즈입니다. 빈 칸에 알맞은 말을 입력하시오.");
            System.out.println("-----------------------------------------");

            String quiz; //문제
            String answer; //
            String input;
            while (true){

                quiz = br.readLine();
                answer = br.readLine();
                if(quiz == null || answer == null){
                    break;
                }
                System.out.println("(문제)" + quiz);
                System.out.println("정답 입력 => " );
                input = sc.next();
                if(input.equals(answer)){
                    System.out.println("정답입니다.");
                }else {
                    System.out.println("오답입니다!");
                }
            }
            System.out.println("-----------------------------");
            System.out.println("수고하셨습니다.");
        }catch (IOException e){

        }


    }
}
