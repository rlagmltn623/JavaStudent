package JavaClass;

public class _퀴즈05 {
    public static void main(String[] args) {
        //배열을 활용하여 쇼핑몰에서 구매 가능한 신발 사이즈 옵션을 출력하시오.
        //신발 사이즈 250부터 295까지 5단위로 증가
        //신발 사이즈 수는 총 10가지

        int [] [] Shoes = {
                {250},{255},{260},{265},{270},{275},{280},{290},{295}

        };

        for(int i=0; i < Shoes.length; i++){
            for(int j=0; j < Shoes[i].length; j++){
                System.out.println("사이즈 " + Shoes[i][j] + " " + "(재고 있음)");
            }
        }
        System.out.println("---------------------");
        //해답

        int [] size = new int[10];
        for (int i = 0; i < size.length; i++) {
            size[i] = 250 + (5 * i);

        }
        //foreach
        for (int sizeup: size) {
            System.out.println("사이즈 " + sizeup + " " + "(재고 있음)");
        }

    }
}
