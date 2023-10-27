package nl.han;

public abstract class Vraag {
    private String vraagtekst;
    private String categorie;

    protected Vraag(String vraagtekst, String categorie){
        this.vraagtekst = vraagtekst;
        this.categorie = categorie;
    }

    public String getVraagtekst() {
        return vraagtekst;
    }

    public abstract boolean checkAntwoord(String gegevenAntwoord);
}
