package chat11;

public class Catch {
    public static void main(String[] args) {
        try{
            //System.out.println(3/ 0);
            //int[] arr = new int[3];
            //arr[5] =100;
            //Object obj = "test";
            //System.out.println((int)obj);

            String s = null;
            System.out.println(s.toLowerCase());

        } catch (ArithmeticException |  ArrayIndexOutOfBoundsException e){
            System.out.println("뭔가 잘못 계산하셨네요");
        } catch (ClassCastException e){
            System.out.println("잘못된 형 변환입니다.");
        }
        catch (Exception e){
            //Exception 다른 모든클래스의 조상클래스라고 생각하면 됨
            System.out.println("그 외에 모든 에러는 여기서 처리 돼요");
            e.printStackTrace();

        }
    }
}
