package tes;

public class innerDemo {
    public static void main(String[] args) {
        outer o=new outer();
        inter j=new cat();
        o.method(j);
        o.method(new inter() {
            @Override
            public void jump() {
                System.out.println("狗可以跳高了");
            }
        });
    }
}
