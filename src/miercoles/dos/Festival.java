package miercoles.dos;

import java.util.ArrayList;

public class Festival {
    //Atributos
    // Arrays
    private ArrayList<Grupo> listGrupos = new ArrayList<>();

    // Constructor
    // Getters & Setters
    public ArrayList<Grupo> getListGrupos() {
        return listGrupos;
    }

    public void setListGrupos(ArrayList<Grupo> listGrupos) {
        this.listGrupos = listGrupos;
    }

    // toString
    public String toString() {
        String rString = "";

        for (Grupo valor : listGrupos) {
            rString += valor.toString() + "\n";
        }

        return rString;
    }

    // Metodos
    public void añadirGrupo(String pNombre, short pDuracion, byte pPopularidad, float pCoste) {
        listGrupos.add(new Grupo(pNombre, pDuracion, pPopularidad, pCoste));
    } // añdirGrupo end

    public double costeTotalFestival() {
        double rDouble = 0;
        for (Grupo valor : listGrupos) {
            rDouble += valor.costeTotal();
        }
        return rDouble;
    } // costeTotalFestival end

} // class end
