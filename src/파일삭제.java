import java.io.File;

public class 파일삭제 {
    public static void main(String[] args) {
        //파일 삭제

        File file =new File("test.txt");
        if(file.exists()){
            if(file.delete()){
                System.out.println("파일 삭제 성공" + file.getName());
            }else {
                System.out.println("파일 삭제 실패" + file.getName());
            }
        }

        //폴더삭제
        File folder = new File("A");
        if(folder.exists()){
            if(file.delete()){
                System.out.println("파일 삭제 성공: " + folder.getName());
            }else {
                System.out.println("파일 삭제 실패: " + folder.getName());
            }
        }
        //하위폴더까지 지우는방법
        if(폴더삭제(folder)){
            System.out.println("폴더삭제 성공: " + folder.getAbsolutePath());
        }else {
            System.out.println("폴더삭제 실패: " + folder.getAbsolutePath());
        }
    }
    public static boolean 폴더삭제(File folder){
        if(folder.isDirectory()){
            for(File file : folder.listFiles()){
                폴더삭제(file);
            }
        }
        System.out.println("삭제대상:" + folder.getAbsolutePath());
        return folder.delete();
    }
}
