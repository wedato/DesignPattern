package ct.exo3;

public class Montre {

    private Mode mode;
    private int heure;
    private int minutes;
    private int secondes;



    public Montre() {
        this.mode = new Affichage(this);

    }

    public void pressButtonMode(){
        mode.onButtonMode();
    }

    public void pressButtonAvance(){
        mode.onButtonAvancer();
        affichage();
    }
    public void pressButtonRapideAvance(){
        mode.onButtonAvanceRapide();
        affichage();
    }

    public void affichage(){
        String heureDisplay = Integer.toString(heure);
        String minuteDisplay = Integer.toString(minutes);


        if (heure < 10)
            heureDisplay = "0"+heure;
        if (minutes < 10)
            minuteDisplay = "0"+minutes;

        System.out.println(heureDisplay + ":" + minuteDisplay);

    }


    public int getSecondes() {
        return secondes;
    }

    public void setSecondes(int secondes) {
        this.secondes = secondes;
    }

    public void setHeure(int heure) {
        this.heure = heure;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getHeure() {
        return heure;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMode(Mode mode){
        this.mode = mode;
    }
    public String getMode(){
        return this.mode.quelmode();
    }



}
