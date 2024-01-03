import java.io.BufferedReader;

public class CreaOrdineController {

    Catalogo menu;
    private Comanda comanda;
    private GUI gui;


    public CreaOrdineController(){
        System.out.println("questo è il menu di oggi");
        this.menu = new Catalogo();
        this.gui = new GUI();
        stampaCatalogo();

    }

    public void stampaCatalogo(){
        int numeroArticoli = menu.getArticoli().size();
        int i = 0;
        while(i < numeroArticoli){
            gui.stampaMessaggio(menu.getArticolo(i));
            i++;

        }
    }

    public boolean prendiOrdine(){
        gui.
    }


}
