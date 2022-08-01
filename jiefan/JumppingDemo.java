package jiefan;

public class JumppingDemo {
    public static void main(String[] args) {
        JumppingOperator ju=new JumppingOperator();
        Jumpping j=new cat();
        ju.useJumpping(j);

        Jumpping j2=ju.getJumpping();
        ju.useJumpping(j2);
    }
}
