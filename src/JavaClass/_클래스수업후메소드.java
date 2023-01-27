package JavaClass;

public class _클래스수업후메소드 {
    public static void main(String[] args) {
        블랙박스 b1 = new 블랙박스();
        b1.modelName = "안녕";

        b1.autoReport();//지원안됨
        블랙박스.cona = true;
        b1.autoReport(); //지원됨
        b1.insertMemory(256);

        //일반 영상 : 1 type
        //이벤트 영상 (충돌감지) : 2 type
        int fileCount = b1.getvoide(1);
        System.out.println("일반영상 파일 수: " + fileCount + "개" );

        fileCount = b1.getvoide(2);
        System.out.println("일반영상 파일 수: " + fileCount + "개" );
    }
}
