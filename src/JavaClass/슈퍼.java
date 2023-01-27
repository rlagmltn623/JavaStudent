package JavaClass;

import JavaClass.카메라.*;

public class 슈퍼 {
    public static void main(String[] args) {
        카메라 carmera = new 카메라();
        팩토리캠 factory = new 팩토리캠();
        스피드캠 speed = new 스피드캠();

        factory.recode();
        System.out.println("-----------");
        speed.takePictuer();
    }

}
