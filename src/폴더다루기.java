import java.io.File;

public class 폴더다루기 {
    public static void main(String[] args) {
        String foldername = "A";
        File foler = new File(foldername);
        foler.mkdir();
        if(foler.exists()){
            System.out.println("폴더가 존재합니다:" + foler.getAbsolutePath());
        }
        System.out.println("-----------------------------");
        foldername = "A/B/C"; //부모자식으로 계속 만들어줌

        // "A" + File.separator + "B"+ File.separator  + "C";
        // 윈도우 C:\\Users\\user\\Desktop\\
        // 맥: C:/Users/user/Desktop
        // 이렇게 만들어짐
        foler = new File(foldername);
        //foler.mkdir 단일폴더만 만들 때
        foler.mkdirs(); //s를 넣어야 여러게를 만들수 있음
        if(foler.exists()){
            System.out.println("폴더가 존재합니다:" + foler.getAbsolutePath());
        }else {
            System.out.println("폴더 생성 실패");
        }
    }
}
