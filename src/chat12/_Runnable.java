package chat12;

import chat12.clean.cleanRun;

public class _Runnable {
    public static void main(String[] args) {
        cleanRun clean = new cleanRun();
        Thread thread = new Thread(clean);
        thread.start();

    }
    public static void cleanmybos(){
        System.out.println("사장 청소 시작");
        for (int i = 1; i <= 10; i+=2){
            System.out.println("(사장)" + i + "번방 청소 중");
        }
        System.out.println("---사장 청소 중---");
    }
}
