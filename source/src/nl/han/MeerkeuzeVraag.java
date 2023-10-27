package nl.han;

import java.util.ArrayList;
import java.util.Locale;

public class MeerkeuzeVraag extends Vraag{

    public MeerkeuzeVraag(String vraagtekst, String categorie, Character letter, String fout1, String fout2, String fout3, String correct){
        super(vraagtekst, categorie, letter);
        antwoorden.add(new Antwoord(fout1, false));
        antwoorden.add(new Antwoord(fout2, false));
        antwoorden.add(new Antwoord(fout3, false));
        antwoorden.add(new Antwoord(correct, true));
    }

    protected ArrayList<Antwoord> getMultiplechoise(){
        return antwoorden;
    }

    public boolean checkAntwoord(String gegevenAntwoord){
        //TODO return eerste letter antwoord
        return antwoorden.stream().anyMatch(a -> gegevenAntwoord.toLowerCase().matches(a.getAntwoord().toLowerCase()) && a.isCorrect());
    }
}
