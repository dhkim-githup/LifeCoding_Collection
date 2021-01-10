import java.io.FileWriter;
import java.io.IOException;

public class CheckedExceptionApp {
    public static void main(String[] args){

        FileWriter f = null;

        try {
            f = new FileWriter("data.txt");
            f.write("Hello");
            //f.close();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (f != null) {
                try {
                    f.close();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }

    }
}
