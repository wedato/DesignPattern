package ct;

import java.util.ArrayList;
import java.util.List;

public class SujetExam extends Observable {


    private List<Question> listeQuestions = new ArrayList<>();
    private List<Participant> participantsDejaProposerQuestion = new ArrayList<>();
    private List<Participant> participantsDejaVoter = new ArrayList<>();



    void proposerReponse(Participant participant,Question question, String reponse){
        if (participantsDejaProposerQuestion.contains(participant)){
            System.out.println("BEEP BOOP VOUS AVEZ DEJA PROPOSER");
            return;
        }
        participantsDejaProposerQuestion.add(participant);
        question.ajouterProposition(new Reponse(reponse));
        listeQuestions.add(question);
        notifyObserver(question,reponse);
    }

    void voterReponse(Participant participant, Question question, String reponseVote){
        if (participantsDejaVoter.contains(participant)){
            System.out.println("BEEP BOOP VOUS AVEZ DEJA VOTER");
            return;
        }

        participantsDejaVoter.add(participant);
        question.voter(reponseVote);
        listeQuestions.remove(question);
        listeQuestions.add(question);

    }

    public List<Question> getListeQuestions() {
        return listeQuestions;
    }
}
