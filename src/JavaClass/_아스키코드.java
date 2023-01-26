package JavaClass;

public class _아스키코드 {
    public static void main(String[] args) {
        //아스키 코드 : 미국 표준코드
        char c = 'A'; //대문자 A는 65부터 시작, 소문자(a)는 97부터 시작, 숫자(0) 48부터 시작

        System.out.println(c);
        System.out.println((int)c);//65숫자가 나옴
        c = 'b';
        System.out.println(c);
        System.out.println((int)c);

        c++;
        System.out.println(c);
        System.out.println((int)c);

        String[][] move = new String[10][15];
        char ch = 'A';
        for (int i = 0; i < move.length; i++) {
            for (int j = 0; j < move[i].length; j++) {
                move[i][j] = String.valueOf(ch) + (j + 1);
            }
            ch++;
        }

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
