package Chat09;

import java.util.*;

public class _iterator {
    public static void main(String[] args) {
        //이터레이터
        List<String> list = new ArrayList<>();
        list.add("유재석");
        list.add("(알수없음)");
        list.add("(알수없음)");
        list.add("김종국");
        list.add("강호동");
        list.add("박명수");
        list.add("조새호");

        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("--------");

        Iterator<String> it = list.iterator();
        System.out.println(it.next());
        System.out.println(it.next());

        System.out.println("---------");
        it = list.iterator(); //커서를 처음 위치로 이동
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("---------");

        it = list.iterator(); //커서를 처음 위치로 이동

        while (it.hasNext()){
            String s = it.next();
            //삭제기능
            if(s.contains("(알수없음)")){
                it.remove();
            }
        }
        it = list.iterator(); //커서를 처음 위치로 이동
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("---------");

        HashSet <String> set = new HashSet<>();
        set.add("유재석");
        set.add("박명수");
        Iterator <String> itset = set.iterator();
        while (itset.hasNext()){
            System.out.println(itset.next());
        }
        System.out.println("---------");

        HashMap<String, Integer> map =new HashMap<>();

        map.put("유재석", 10);
        map.put("박명수", 10);
        map.put("김희수", 10);

        // map.iterater(); 이렇게는 사용할 수 없음
        Iterator<String> itmapkey =  map.keySet().iterator();
        while (itmapkey.hasNext()){
            System.out.println(itmapkey.next());
        }
        System.out.println("-----------");


        /*
        Iterator<Integer> itmapvalue = map.values().iterator();
        while (itmapvalue.hasNext()){
            System.out.println(itmapkey.hasNext());
        }
        System.out.println("----------");
        */
        Iterator<Map.Entry<String, Integer>> itmap =map.entrySet().iterator();
        while (itmap.hasNext()){
            System.out.println(itmap.next());
        }

        System.out.println("-----------------");
    }
}
