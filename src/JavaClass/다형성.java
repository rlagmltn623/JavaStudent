package JavaClass;

import JavaClass.카메라.*;

public class 다형성 {
    public static void main(String[] args) {
        //다형성
        //class person : 사람
        //class student extends person : 학생 (학생은 사람이다.)
        //class Techer extends person : 선생님(선생님은 사람이다)

        카메라 carmera = new 카메라();
        카메라 factory = new 팩토리캠();
        카메라 speed = new 스피드캠();


        System.out.println("-------------");
        carmera.showmain();
        factory.showmain();
        speed.showmain();

        카메라[] carmerases = new 카메라[3];
        carmerases[0] = new 카메라();
        carmerases[1] = new 팩토리캠();
        carmerases[2] = new 스피드캠();

        for (카메라 cam : carmerases) {
            cam.showmain();
        }
        System.out.println("-------------");
        //다만 문제는 부모클래스에 있는 것 사용할 수 있다.
        //하지만, 이걸로 쓰면 사용가능하다.
        if(carmera instanceof 카메라){
            System.out.println("카메라입니다.");
        }

        if(factory instanceof 팩토리캠){
            //형 변환 후 사용할 수 있다.
            ((팩토리캠)factory).fire();

        }

        if(speed instanceof 스피드캠){
            ((스피드캠) speed).check();
            ((스피드캠) speed).lize();
        }

//        Object[] objs = new Object[3];
//        objs[0] = new 카메라();
//        objs[1] = new 팩토리캠();
//        objs[2] = new 스피드캠();

    }
}
