package pac;

public class catDemo {
    public static void main(String[] args) {
        catOperator co=new catOperator();
        cat c=new cat();
        co.useCat(c);

        cat c2=co.getCat();
        c2.eat();
    }
}
