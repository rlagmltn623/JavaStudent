package Chat09;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.Map;

public class 퀴즈09 {
    public static void main(String[] args) {
        //ArraList를 이용하여 학생 별 프로그램 언어 자격증 취득 정보를 관리하고, 자바 자격증을 보유한 학생 이름을 출력

        //학생 이름 및 자격증  취득정보를 위한 student 클래스 생성
        //1인당 보유 자격증 1개로 제한

        //유재석 파이썬, 박명수 자바, 김종국 자바, 조세호 c, 서장훈 파이썬
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("유재석","파이썬"));
        students.add(new Student("박명수","자바"));
        students.add(new Student("김종국","자바"));
        students.add(new Student("조세호","C"));
        students.add(new Student("서장훈","파이썬"));

        System.out.println("자바를 보유한 학생은");
        System.out.println("-------------");
        for (Student s: students) {


            if(s.job.contains("자바")){ //이것도 되지만 equals를 사용해야 한다.
                System.out.println(s.name.concat(" : " + s.job));
            }else{
                System.out.println(s.name.concat(" : " + s.job));
            }
        }
        System.out.println("-----------");



    }
}

class Student {
    public String name;
    public String job;

    ArrayList <String> std = new ArrayList<>();

    public Student(String name, String job){
        this.name = name;
        this.job = job;
    }


}