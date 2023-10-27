package nl.han;

public abstract class Vraag {
    private String vraagtekst;


    public String getVraagtekst() {
        return vraagtekst;
    }

    public abstract boolean checkAntwoord(String gegevenAntwoord);
}
