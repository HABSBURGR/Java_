package Calender;

import java.util.Calendar;

public class Calenderdemo {
    public static void main(String[] args) {
        Calendar c= Calendar.getInstance();
        c.add(Calendar.YEAR,10);
        c.add(Calendar.DATE,-5);

        int year=c.get(Calendar.YEAR);
        int mouth=c.get(Calendar.MONTH)+1;
        int date=c.get(Calendar.DATE);
        System.out.println(year+"Äê"+mouth+"ÔÂ"+date+"ÈÕ");

    }
}
