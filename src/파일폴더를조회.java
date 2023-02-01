import java.io.File;

public class 파일폴더를조회 {
    public static void main(String[] args) {
        //String folder = "C:\\Users\\user\\Desktop\\BackEnd\\JavaStudent\\src\\JavaClass";
        String folder = "src/chat_10";
        File fileandfolder = new File(folder);
        System.out.println("현재 폴더 경로 : " + fileandfolder.getAbsolutePath());
        for (File file:fileandfolder.listFiles()) {
            if(file.isFile()){
                System.out.println("(파일)" + file.getName());

            } else if (file.isDirectory()) {
                System.out.println("(폴더)" + file.getName());
            }
            System.out.println(file.getName());
        }
    }
}
