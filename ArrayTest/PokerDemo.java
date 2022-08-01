package ArrayTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PokerDemo {
    public static void main(String[] args) {
        ArrayList<String> array =new ArrayList<String>();
        String[] colors ={"����","����","����","����"};
        String[] numbers ={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        for (String color :colors){
            for (String number:numbers){
                array.add(color+number);
            }
        }
        array.add("С��");
        array.add("����");
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
        lookPoker("����",m1);
        lookPoker("����",m2);
        lookPoker("����",m3);
    }
    public static void lookPoker(String name,ArrayList<String> array){
        System.out.println(name+"�����ǣ�");
        for (String poker:array){
            System.out.print(poker+" ");
        }
        System.out.println();
    }
}
