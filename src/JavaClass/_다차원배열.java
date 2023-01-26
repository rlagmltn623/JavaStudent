package JavaClass;

public class _다차원배열 {
    public static void main(String[] args) {
        //다차원 배열
     String[][] coffe = new String[][] {
             {"A1", "A2", "A3", "A4"},
             {"B1", "B2", "B3", "B4"},
             {"C1", "C2", "C3", "C4"},
             {"D1", "D2", "D3", "D4"}
        };
        System.out.println(coffe[1][1]);
        for(int i = 0; i < 3; i++){
            System.out.println(coffe[i][i]);
        }
        /*for(String coffese: coffe) {
            System.out.println(coffese);
        }*/
        // 첫 줄에는 3칸, 둘쨰 줄은 4칸, 셋째 줄에는 5칸
        String[][] seat2 = {
                {"A1","A2","A3"},
                {"B1","B2","B3", "B4"},
                {"C1","C2","C3", "C4", "C5"},
        };
        //A3 에 접근하려면
        System.out.println(seat2[0][2]);
        //B4 에 접근하려면
        System.out.println(seat2[1][3]);
        //C5에 접근하려면
        System.out.println(seat2[2][4]);


        // 3차원 배열 만들기
        String [][][] hi = {
                {{}, {}, {}},
                {{}, {}, {}},
                {{}, {}, {}}
        };
        System.out.println("------------");
        //다차원배열 순회
        //seat2.length 배열이 3개 인걸 확인 할 수 있다.
        for(int i = 0; i < seat2.length ; i++){
            System.out.println("배열갯수" + seat2.length);
            for(int j =0; j < seat2[i].length; j++){
                System.out.print(seat2[i][j] + " ");
                //seat2[i].length 를 찍어보면
                //seat2[1] = 3
                //seat2[2] = 4
                //seat2[3] = 5
                //가 출력된거 알기 때문에 이렇게 사용하면된다.
                System.out.println("배열안에 있는 갯수"+seat2[i].length);
            }
            System.out.println();
        }
        //String[][] move = new String[세로크기][가로크기]
        String[][] move = new String[10][15];
        String[] eng = {"A", "B", "C","D","E","F","G","H","I","J"};
        for (int i = 0; i < move.length; i++) {
            for (int j = 0; j < move[i].length; j++) {
                move[i][j] = eng[i] + (j + 1);
            }
        }
        // 표 구매
        // H9 H10 7 8,9
        //영화관 좌석 번호
        move[7][8] = "--";
        move[7][9] = "--";
        for(int i = 0; i < move.length ; i++){
            //System.out.print("배열갯수" + move.length);
            for(int j =0; j < move[i].length; j++){
                System.out.print(move[i][j] + " ");

                //System.out.print("배열안에 있는 갯수"+ move[i].length);
            }
            System.out.println();
        }
    }
}
