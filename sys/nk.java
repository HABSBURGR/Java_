package sys;

public class nk {
    public void throwerr (int score) throws ScoreException{
        if (score<0||score>100){
            throw new ScoreException("����ķ�������");
        }else{
            System.out.println("��������");
        }
    }
}
