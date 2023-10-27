package nl.han;

import java.util.ArrayList;

public class Antwoordformulier {
    private ArrayList<String> gegevenAntwoorden;

    public Antwoordformulier(){
        gegevenAntwoorden = new ArrayList<>();
    }

    public void addAntwoord(String gegevenAntwoord){
        gegevenAntwoorden.add(gegevenAntwoord);
    }

    public void maakWoord(){}

    public String getAntwoord(int i){
        return gegevenAntwoorden.get(i);
    }
}
