import java.util.ArrayList;

public class MeerkeuzeVraag extends Vraag{
    private String vraagtekst;
    private ArrayList<Antwoord> antwoorden;

    public MeerkeuzeVraag(String vraagtekst, String fout1, String fout2, String fout3, String correct){
        antwoorden = new ArrayList<>();
        this.vraagtekst = vraagtekst;
        antwoorden.add(fou)
    }

    public boolean checkAntwoord(String gegevenAntwoord){
        return gegevenAntwoord.matches(correctAntwoord);
    }
}
