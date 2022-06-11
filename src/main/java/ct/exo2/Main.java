package ct.exo2;

public class Main {

    public static void main(String[] args) {

        var sujetExam = new SujetExam();
        Participant jojo = new Participant("jojolamenace");
        Participant truc = new Participant("truc");



        var premiereQuestion = new Question("Petit d ?");
        premiereQuestion.addObserver(jojo);
        premiereQuestion.addObserver(truc);
        var deuxiemeQuestion = new Question("On retape ?");

        sujetExam.proposerReponse(jojo,premiereQuestion,"la reponse d");
        sujetExam.proposerReponse(jojo,premiereQuestion,"la reponse e");
        System.out.println(sujetExam.getListeQuestions());
        sujetExam.voterReponse(jojo,premiereQuestion,"la reponse d");
        sujetExam.voterReponse(jojo,premiereQuestion,"la reponse d");
        System.out.println(sujetExam.getListeQuestions());




    }
}
