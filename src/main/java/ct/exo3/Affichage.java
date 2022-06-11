package ct.exo3;

public class Affichage extends Mode {

    public Affichage(Montre montre) {
        super(montre);
        montre.affichage();
    }

    @Override
    public void onButtonMode() {
        montre.setMode(new ModificationHeure(montre));

    }

    @Override
    public void onButtonAvancer() {
        System.out.println("BIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIP");

    }

    @Override
    public void onButtonAvanceRapide() {
        System.out.println("BIIIIIIIIIIIIIIIP MOTHERFUCKER BIIIIIIII");
    }


    @Override
    public String quelmode() {
        return "affichage";
    }
}
