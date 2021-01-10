import java.io.FileWriter;

public class TryWithResouce {
    public static void main(String[] args) {

        try(FileWriter f = new FileWriter("data.txt")) {
            f.write("Hello");
            f.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
