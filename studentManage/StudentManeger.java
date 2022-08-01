package studentManage;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManeger {
    public static void main(String[] args) {
        ArrayList<Student> array=new ArrayList<>();
        while (true){
            System.out.println("---欢迎来到学生管理系统");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看所有学生");
            System.out.println("5 退出");
            System.out.println("请输入你的选择");
            Scanner sc =new Scanner(System.in);
            String line =sc.nextLine();
            switch(line){
                case "1":
                    System.out.println("1 添加学生");
                    addStudent(array);
                    break;
                case "2":
                    System.out.println("2 删除学生");
                    deleteStudent(array);
                    break;
                case "3":
                    System.out.println("3 修改学生");
                    changeStudent(array);
                    break;
                case "4":
                    System.out.println("4 查看所有学生");
                    findAllStudent(array);
                    break;
                case "5":
                    System.out.println("5 退出");
                    System.exit(0);
            }
        }
    }
    public static void addStudent(ArrayList<Student> array) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入学生学号，姓名，年龄和居住地：");
        String sid=sc.nextLine();
        String name=sc.nextLine();
        String age=sc.nextLine();
        String address=sc.nextLine();
        Student s=new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);
        array.add(s);
        System.out.println("添加学生成功");
    }
    public static void findAllStudent(ArrayList<Student> array){
        for (int i=0;i< array.size();i++){
            Student s=array.get(i);
            System.out.println(s.getSid()+"\t"+s.getName()+"\t"+s.getAge()+"岁\t"+s.getAddress());
        }
    }
    public static void deleteStudent(ArrayList<Student> array){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要删除的学生的学号");
        String sid = sc.nextLine();
        for (int i=0;i<array.size();i++){
            Student s=array.get(i);
            if (s.getSid().equals(sid)){
                array.remove(i);
            }
        }
        System.out.println("删除学生成功");
    }
    public static void changeStudent(ArrayList<Student> array){
        System.out.println("输入要修改学生的学号");
        Scanner sc = new Scanner(System.in);
        String sid = sc.nextLine();
        System.out.println("请输入学生姓名，年龄和居住地：");
        String name=sc.nextLine();
        String age=sc.nextLine();
        String address=sc.nextLine();
        Student s=new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);
        for (int i=0;i<array.size();i++){
            Student stu=array.get(i);
            if (s.getSid().equals(sid)){
                array.set(i,s);
            }
        }
    }
}


