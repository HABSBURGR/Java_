package ArrayTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PokerDemo {
    public static void main(String[] args) {
        ArrayList<String> array =new ArrayList<String>();
        String[] colors ={"方块","黑桃","红桃","黑桃"};
        String[] numbers ={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        for (String color :colors){
            for (String number:numbers){
                array.add(color+number);
            }
        }
        array.add("小王");
        array.add("大王");
        Collections.shuffle(array);
        ArrayList<String> m1=new ArrayList<String>();
        ArrayList<String> m2=new ArrayList<String>();
        ArrayList<String> m3=new ArrayList<String>();
        ArrayList<String> m4=new ArrayList<String>();
        for (int i=0;i<array.size();i++){
            String poker=array.get(i);
            if (i>=array.size()-3){
                m4.add(poker);
            } else if (i%3==0) {
                m1.add(poker);
            }else if (i%3==1) {
                m2.add(poker);
            }else if (i%3==2) {
                m3.add(poker);
            }
        }
        lookPoker("张三",m1);
        lookPoker("李四",m2);
        lookPoker("王五",m3);
    }
    public static void lookPoker(String name,ArrayList<String> array){
        System.out.println(name+"的牌是：");
        for (String poker:array){
            System.out.print(poker+" ");
        }
        System.out.println();
    }
}
