
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GUI {
    private BufferedReader buffer;
    private final String stop = "stop";
    boolean ferma = false;
    public GUI(){
        buffer = new BufferedReader(new InputStreamReader(System.in));
    }

    public void stampaMessaggio(String mes){
        System.out.println("GUI:"+ mes);
    }

    public int articoloOrdinato(){
       try {
           int i = Integer.parseInt(buffer.readLine());
           return i;
       }catch (IOException e){
           e.printStackTrace();
           return 0;
       }
    }

    public void stampaStringa(String s){
        System.out.println(s);
    }



}
