package chat11;

import java.io.BufferedWriter;
import java.nio.Buffer;

public class TryWithResources {
    public static void main(String[] args) {
        myfile wirte = null;
        try{
            wirte= new myfile();
            wirte.write("아이스크림 먹고 싶어요");

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                wirte.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("------------");
        try (myfile write2 = new myfile()){
            write2.write("빵을 먹고싶어요");
        }catch (Exception e){
            e.printStackTrace();
        }

        BufferedWriter be = null;

    }
}
class myfile implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("파일을 정상적으로 닫습니다.");
    }

    public void write(String line){
        System.out.println("파일에 내용을 입력합니다.");
        System.out.println("입력내용:" + line);
    }
}