package JavaClass;

public class 블랙박스 {


    public  void pleaseName(){

    };
    //이건 클래스를 사용하기 위한 설계도
    String modelName;
    String resolution;
    int price;
    String color;
    int seralNumber;
    //static 클래스 변수가 된다.
    static boolean cona = false; //자동 신고 기능
    static int counter = 0; //시리얼 번호를 생성해주는 역할
    블랙박스(){
//        System.out.println("기본생성자");
//        this.seralNumber = ++counter;
//        System.out.println("새로운 시리얼 넘버를 발급받았습니다.");
    }

    블랙박스(String modelName, String resolution, int price, String color){
        this(); //통해 위에 블랙박스를 호출 받음
        System.out.println("사용자 정의 생성자 호출");
        this.modelName = modelName;
        this.resolution = resolution;
        this.price = price;
        this.color = color;


    }
    static String name = "안녕";

    //자동으로 신고하는 메소드
    void autoReport(){

        if(cona){
            System.out.println("충돌이 감지되어 자동으로 신고합니다.");
        }else{
            System.out.println("자동 신고기능이 지원되지 않습니다.");
        }
    }

    void insertMemory(int capacity){
        System.out.println("메모리 카드가 삽입되었습니다.");
        System.out.println("용량은" + capacity + "GB 입니다");
    }

    int getvoide(int type){
        if(1 == type){
            return 9;
        } else if (2== type) {
            return  1;
        }
        return  10;
    }


    // datatype : 날씨정보 표시여부
    //speed : 속도정보 표시여부
    // min : 영상 기록 단위(분)
    void recode(boolean datatype,boolean speed, int min) {
        System.out.println("녹화를 시작합니다.");
        // datatype 만 적으면 true 일 때는 라는거다
        if(datatype){
            System.out.println("영상에 날씨정보가 표시됩니다.");
        }
        if(speed){
            System.out.println("영상에 속도정보가 표십됩니다.");
        }
        System.out.println("영상은" + min + "분 단위로 표시됩니다.");

    }

    void  recode(){
        //위에 recode 를 호출하여 넣는다.
        //이렇게 사용하는게 오버로딩이다.
        recode(true, true, 5);
    }

    static  void tellcell(){
        System.out.println("서비스 센터(1899-5057)");

    }
    void pleaseName(String modelName){
        this.modelName += modelName;
    };


    //Getter & Setter
    String getModelName(){
        return modelName;
    }

    void setModelName(String modelName){
        this.modelName = modelName;
    }

    String getResolution(){
        if(resolution == null || resolution.isEmpty()){
            //isEmpty 빈 문자열
            return "판매자에게 문의하세요";
        }
        return resolution;

    }
    void setResolution(String resolution){
        this.resolution = resolution;
    }

    int getPrice(){
        return price;
    }
    void setPrice(int price){
        if(price < 100000){
            this.price = 100000;
        }
        else {
            this.price = price;
        }
    }
    String getColor(){
        return color;
    }

    void setColor(String color){
        this.color =color;
    }
}
