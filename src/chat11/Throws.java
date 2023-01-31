package chat11;

import javax.jws.soap.SOAPBinding;
import java.io.FileWriter;
import java.io.IOException;

public class Throws {
    public static void main(String[] args) {
        try {
            writefile();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("메인 메소드에서 해결할게요");
        }
    }
    public static void writefile () throws IOException{
       /* try {
            FileWriter writer = new FileWriter("text txt");
            throw  new IOException("파일쓰기에 실패했어요");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("writefile 메소드 내에서 자체 해결했어요");
        }*/

        FileWriter writer = new FileWriter("text txt");
        throw  new IOException("파일쓰기에 실패했어요");

    }
}
