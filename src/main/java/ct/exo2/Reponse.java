package ct.exo2;

public class Reponse {

    String contenu;

    int nbVotes = 0;

    public Reponse(String contenu) {
        this.contenu = contenu;
    }

    public void voter(){


        nbVotes++;
    }


    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public int getNbVotes() {
        return nbVotes;
    }

    public void setNbVotes(int nbVotes) {
        this.nbVotes = nbVotes;
    }

    @Override
    public String toString() {
        return "Reponse{" +
                "contenu='" + contenu + '\'' +
                ", nbVotes=" + nbVotes +
                '}';
    }
}
