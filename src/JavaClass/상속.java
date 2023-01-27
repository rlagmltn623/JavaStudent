package JavaClass;

import JavaClass.카메라.*;

public class 상속 {
    public static void main(String[] args) {
        //상속
        카메라 carmera= new 카메라();
        팩토리캠 factory = new 팩토리캠();
        스피드캠 speed = new 스피드캠();

        System.out.println(carmera.name);
        System.out.println(factory.name);
        System.out.println(speed.name);

        carmera.takePictuer();
        factory.recode();
        speed.takePictuer();


        factory.fire();
        speed.check();
        speed.lize();
    }
}
