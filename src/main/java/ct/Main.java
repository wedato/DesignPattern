package ct;

public class Main {

    public static void main(String[] args) {

        var sujetExam = new SujetExam();
        Participant jojo = new Participant("jojolamenace");
        Participant truc = new Participant("truc");
        sujetExam.addObserver(jojo);
        sujetExam.addObserver(truc);


        var premiereQuestion = new Question("Petit d ?");
        var deuxiemeQuestion = new Question("On retape ?");

        sujetExam.proposerReponse(jojo,premiereQuestion,"la reponse d");
        sujetExam.proposerReponse(jojo,premiereQuestion,"la reponse e");
        System.out.println(sujetExam.getListeQuestions());
        sujetExam.voterReponse(jojo,premiereQuestion,"la reponse d");
        sujetExam.voterReponse(jojo,premiereQuestion,"la reponse d");
        System.out.println(sujetExam.getListeQuestions());




    }
}
