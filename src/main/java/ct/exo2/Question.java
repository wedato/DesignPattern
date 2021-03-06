package ct.exo2;

import java.util.ArrayList;
import java.util.List;

public class Question extends Observable {

    String intitule;

    private List<Reponse> propositions = new ArrayList<>();



    public Question(String intitule) {
        this.intitule = intitule;
    }

    public void ajouterProposition(Reponse proposition){


        propositions.add(proposition);
        notifyObserver(this,proposition);
    }

    public void voter(String reponseVote){


        for (Reponse proposition : propositions){
            if (proposition.contenu.equals(reponseVote)) {
                proposition.voter();
            }
        }
    }

    public String getIntitule() {
        return intitule;
    }


    @Override
    public String toString() {
        return "Question{" +
                "intitule='" + intitule + '\'' +
                ", propositions=" + propositions +
                '}';
    }
}
