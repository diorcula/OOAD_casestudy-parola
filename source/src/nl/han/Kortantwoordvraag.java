package nl.han;

import java.util.ArrayList;

public class Kortantwoordvraag extends Vraag{
    private String vraagtekst;
    private ArrayList<Antwoord> antwoorden;

    public Kortantwoordvraag(String vraagtekst, String categorie) {
        super(vraagtekst, categorie);
        antwoorden = new ArrayList<>();
    }

    public void addAntwoord(Antwoord antwoord){
        antwoorden.add(antwoord);
    }

    @Override
    public boolean checkAntwoord(String gegevenAntwoord) {
        //TOTO return eerste letter antwoord
        return antwoorden.stream().anyMatch(a -> gegevenAntwoord.toLowerCase().matches(a.getAntwoord().toLowerCase()));
    }
}
