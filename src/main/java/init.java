import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileReader;
import java.io.FileNotFoundException;


public class init{




    public static void main(String args[]) {
        init me = new init();
        me.controller = new CreaOrdineController();

        System.out.println("arrivederci");

    }




    CreaOrdineController controller;
    String start = "-continua-";
    BufferedReader br;

    boolean stop = false;
public init() {
        System.out.println("Salve e benvenuti alla Casa del gusto");
        System.out.println("Inserisci comando -continua- per iniziare a ordinare");

        InputStreamReader isr = new InputStreamReader(System.in);
        br = new BufferedReader(isr);

        String line;
        try {
            while (!stop) {
                //insert start command line
                line = this.br.readLine();
                stop = line.equalsIgnoreCase(start);
            }
        } catch(IOException e){
            e.printStackTrace();
            return;
        }



    }
}