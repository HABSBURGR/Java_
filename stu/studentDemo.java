package stu;

import java.util.ArrayList;
import java.util.Scanner;

public class studentDemo {
    public static void main(String[] args) {
        ArrayList<student> array = new ArrayList<student>();
        addStudent(array);
        addStudent(array);
        addStudent(array);
        for (int i=0;i< array.size();i++) {
            System.out.println(array.get(i).getName()+array.get(i).getAge());
        }
    }

    public static void addStudent(ArrayList<student> array) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入学生姓名");
        String name=sc.nextLine();
        System.out.println("请输入学生年龄");
        String age=sc.nextLine();
        student s1=new student(name,age);
        array.add(s1);
    }
}
