package JavaClass;

import JavaClass.카메라.*;

public class _final {
    public static void main(String[] args) {
        액션캠 action = new 액션캠();
        //action.lens = "표준렌즈";
        action.recode();
        action.make();
        action.recode();

        느린액션캠 slow = new 느린액션캠();
        slow.recode();
        slow.make();
    }
}
