package nl.han;

import java.util.ArrayList;

public class MeerkeuzeVraag extends Vraag{
    private String vraagtekst;
    private ArrayList<Antwoord> antwoorden;

    public MeerkeuzeVraag(String vraagtekst, String fout1, String fout2, String fout3, String correct){
        this.vraagtekst = vraagtekst;
        this.antwoorden = new ArrayList<>();
        antwoorden.add(new Antwoord(fout1, false));
        antwoorden.add(new Antwoord(fout2, false));
        antwoorden.add(new Antwoord(fout3, false));
        antwoorden.add(new Antwoord(correct, true));
    }

    public boolean checkAntwoord(String gegevenAntwoord){
        return antwoorden.stream().anyMatch(a -> gegevenAntwoord.matches(a.getAntwoord()) && a.isCorrect());
    }
}
