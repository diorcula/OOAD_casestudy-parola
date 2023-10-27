public class Antwoord {
    private String antwoord;
    private boolean correct;

    public Antwoord(String antwoord, boolean correct){
        this.antwoord = antwoord;
        this.correct = correct;
    }

    public String getAntwoord(){
        return antwoord;
    }

    public boolean isCorrect(){
        return correct;
    }
}
