package sys;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class systemDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int score=sc.nextInt();
        nk t=new nk();
        try{
            t.throwerr(score);
        }catch (ScoreException e){
            e.printStackTrace();
        }
    }
}
