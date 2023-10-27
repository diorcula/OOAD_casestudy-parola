package nl.han;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Parola {
    private static Parola parola;
    private Quiz quiz;
    private String gebruikersnaam;
    private boolean quizFinished;
    private int huidigeVraagID;
    private Vraag huidigeVraag;
    private Antwoordformulier antwoordformulier;

    public Parola(){}

    public static Parola getInstance(){
        if(parola == null){
            parola = new Parola();
        }

        return parola;
    }

    public void startQuiz(String playername){
        gebruikersnaam = playername;
        quiz = new Quiz().mockedQuiz();
        antwoordformulier = new Antwoordformulier();
        quizFinished = false;
        huidigeVraagID = 0;
    }

    public String nextQuestion(String playername){
        huidigeVraag = quiz.getVraag(huidigeVraagID);

        if(huidigeVraag instanceof MeerkeuzeVraag){
            var antwoorden = ((MeerkeuzeVraag) huidigeVraag).getMultiplechoise();
            Collections.shuffle(antwoorden);
            return huidigeVraag.getVraagtekst() + " " + antwoorden.get(0).getAntwoord() + " - " + antwoorden.get(1).getAntwoord() + " - " + antwoorden.get(2).getAntwoord() + " - " + antwoorden.get(3).getAntwoord();
        } else {
            return huidigeVraag.getVraagtekst();
        }
    }

    public void processAnswer(String playername, String antwoord){
        antwoordformulier.addAntwoord(antwoord);
        huidigeVraagID++;

        if(huidigeVraagID == 8){
            quizFinished = true;
        }
    }

    public boolean quizFinished(String playername){
        return quizFinished;
    }
    
    public String getLettersForRightAnswers(String playername){
        for (int i = 0; i < 8; i++) {
            quiz.getVraag(i).checkAntwoord(antwoordformulier.getAntwoord(i));
        }

        return null;
    }
}
