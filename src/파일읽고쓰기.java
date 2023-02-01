import java.io.*;
import java.nio.Buffer;

public class 파일읽고쓰기 {
    public static void main(String[] args) throws IOException {
        // BufferedReader : 파일에서 내용을 읽어올 떄
        // BufferedWrite : 파일에 내용을 적을 때


        //파일 쓰기
        //FileWriter fw = new FileWriter("goodjob.text");
        //BufferedWriter bw = null;
        //값을 추가하기 위해선 파일명 뒤에 콤바 후 True를 설정하면 됨
        /*try (BufferedWriter bw = new BufferedWriter(new FileWriter("goodjob.text", true))){
            bw.write("3. 조금만 더 힘내요");
            bw.newLine(); //줄바꿈
            bw.write("4.좋아요 아주");
            bw.newLine(); //줄바꿈
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/

        //파일 읽기
        try (BufferedReader br = new BufferedReader(new FileReader("goodjob.text"))){
            String line;
            while ((line = br.readLine())!= null){
                System.out.println(line);
            }
        }catch (IOException e){

        }
    }
}
