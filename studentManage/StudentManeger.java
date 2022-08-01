package studentManage;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManeger {
    public static void main(String[] args) {
        ArrayList<Student> array=new ArrayList<>();
        while (true){
            System.out.println("---��ӭ����ѧ������ϵͳ");
            System.out.println("1 ���ѧ��");
            System.out.println("2 ɾ��ѧ��");
            System.out.println("3 �޸�ѧ��");
            System.out.println("4 �鿴����ѧ��");
            System.out.println("5 �˳�");
            System.out.println("���������ѡ��");
            Scanner sc =new Scanner(System.in);
            String line =sc.nextLine();
            switch(line){
                case "1":
                    System.out.println("1 ���ѧ��");
                    addStudent(array);
                    break;
                case "2":
                    System.out.println("2 ɾ��ѧ��");
                    deleteStudent(array);
                    break;
                case "3":
                    System.out.println("3 �޸�ѧ��");
                    changeStudent(array);
                    break;
                case "4":
                    System.out.println("4 �鿴����ѧ��");
                    findAllStudent(array);
                    break;
                case "5":
                    System.out.println("5 �˳�");
                    System.exit(0);
            }
        }
    }
    public static void addStudent(ArrayList<Student> array) {
        Scanner sc=new Scanner(System.in);
        System.out.println("������ѧ��ѧ�ţ�����������;�ס�أ�");
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
        System.out.println("���ѧ���ɹ�");
    }
    public static void findAllStudent(ArrayList<Student> array){
        for (int i=0;i< array.size();i++){
            Student s=array.get(i);
            System.out.println(s.getSid()+"\t"+s.getName()+"\t"+s.getAge()+"��\t"+s.getAddress());
        }
    }
    public static void deleteStudent(ArrayList<Student> array){
        Scanner sc=new Scanner(System.in);
        System.out.println("������Ҫɾ����ѧ����ѧ��");
        String sid = sc.nextLine();
        for (int i=0;i<array.size();i++){
            Student s=array.get(i);
            if (s.getSid().equals(sid)){
                array.remove(i);
            }
        }
        System.out.println("ɾ��ѧ���ɹ�");
    }
    public static void changeStudent(ArrayList<Student> array){
        System.out.println("����Ҫ�޸�ѧ����ѧ��");
        Scanner sc = new Scanner(System.in);
        String sid = sc.nextLine();
        System.out.println("������ѧ������������;�ס�أ�");
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


