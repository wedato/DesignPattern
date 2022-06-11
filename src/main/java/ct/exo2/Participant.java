package ct.exo2;

public class Participant implements Observer {

    String pseudo;

    public Participant(String pseudo) {
        this.pseudo = pseudo;
    }

    @Override
    public void update(Question question, Reponse reponse) {
        System.out.println("La reponse : " + reponse.contenu + " vient d'être envoyé à la question :" + question.intitule);
    }


    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }
}
