package chat_10.chat13;

import java.io.File;
import java.io.IOException;

public class _file {
    public static void main(String[] args) throws IOException {
        //파일 생성 + 정보 얻기
        String filename = "test.txt";
        File file = new File(filename);
        file.createNewFile();//파일생성
        if(file.exists()){ //exists라는 건 파일 있다라고 하면

            System.out.println("파일이름" + file.getName());
            System.out.println("파일 절대 경로:" + file.getAbsolutePath());
            System.out.println("파일 크기(Byte): " + file.length());
        }

    }
}
