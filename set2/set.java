package set2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;

public class set {
    public static void main (String[] args)throws IOException{
        FileInputStream fis =new FileInputStream("E:\\test1.txt");
        FileOutputStream fos =new FileOutputStream("E:\\test2.txt");
        int by;
        while((by=fis.read())!=-1){
            fos.write(by);
        }
        fos.close();
        fis.close();
    }
}
