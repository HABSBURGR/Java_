package I_test;

import java.util.HashMap;
import java.util.Map;

public class jie5 {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<String,String>();
        map.put("С��","����");
        map.put("da","xiao");
        System.out.println(map.remove("da"));
    }
}
