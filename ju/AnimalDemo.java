package ju;

public class AnimalDemo {
    public static void main(String[] args) {
        Jumpping j=new cat();
        j.jump();

        animal a=new cat();
        a.setName("¼Ó·Æ");
        a.setAge(6);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();

        cat c=new cat("¼Ó·Æ",4);
        c.setAge(4);
        System.out.println(c.getName()+","+c.getAge());
        c.eat();
        c.jump();
    }
}
