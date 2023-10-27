public class MeerkeuzeVraag extends Vraag{
    private String vraagtekst;
    private String[] fouteAntwoorden;
    private String correctAntwoord;

    public MeerkeuzeVraag(String vraagtekst, String fout1, String fout2, String fout3, String correct){
        this.vraagtekst = vraagtekst;
        this.fouteAntwoorden = {fout1, fout2, fout3};
        this.correctAntwoord = correct;
    }

    public boolean checkAntwoord(String gegevenAntwoord){
        return gegevenAntwoord.matches(correctAntwoord);
    }
}
