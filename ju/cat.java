package ju;

public class cat extends animal implements Jumpping{
    @Override
    public void eat() {
        System.out.println("è����");
    }

    @Override
    public void jump() {
        System.out.println("è����������");
    }

    public cat() {
    }

    public cat(String name, int age) {
        super(name, age);
    }
}
