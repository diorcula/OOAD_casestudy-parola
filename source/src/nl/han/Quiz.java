package nl.han;

import java.util.ArrayList;

public class Quiz {
    private String quiznaam;
    private ArrayList<Vraag> vragen;

    public Quiz(String quiznaam) {
        this.quiznaam = quiznaam;
    }

    public void addVraag(Vraag vraag){
        vragen.add(vraag);
    }

    public void test(){
        MeerkeuzeVraag mkv = new MeerkeuzeVraag("Wat is 2x2?", "Wiskunde", "1", "2", "3", "4");
        addVraag(mkv);

        Kortantwoordvraag kav = new Kortantwoordvraag("Voornaam van de koningin?", "Koningshuis");
        kav.addAntwoord(new Antwoord("Maxima"));
        addVraag(kav);
    }


}
