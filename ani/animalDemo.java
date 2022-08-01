package ani;

public class animalDemo {
    public static void main(String[] args) {
        animalOperator an=new animalOperator();
        cat c=new cat();
        an.useAnimal(c);
        dog d=new dog();
        an.useAnimal(d);

    }
}
