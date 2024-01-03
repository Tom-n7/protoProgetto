import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;
public class Catalogo{

    private ArrayList<Articolo> articoli = new ArrayList<>();
    private String nomeArticolo;
    public Catalogo(){

        try{
            File f = new File("src/catalogo.txt");
            BufferedReader buffer = new BufferedReader(new FileReader(f.getCanonicalPath()) );
            boolean stop = false;

            while(!stop) {
                nomeArticolo = buffer.readLine();
                if(nomeArticolo == null){
                    stop = true;
                }else {
                    this.articoli.add(new Articolo(nomeArticolo));
                }
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }catch (NullPointerException e){
            e.printStackTrace();
        }
        System.out.println(articoli.get(0).getNome());
    }


    public String getArticolo(int i){
        return this.articoli.get(i).Nome;
    }


    public ArrayList<Articolo> getArticoli() {
        return articoli;
    }
}
