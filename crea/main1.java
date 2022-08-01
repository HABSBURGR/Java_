package crea;

public class main1 {
    public static void main(String[] args) {
        Phone p = new Phone();
        System.out.println(p.brand);
        System.out.println(p.price);
        p.brand="小米手机";
        p.price=3000;
        System.out.println(p.brand);
        System.out.println(p.price);
    }
}
