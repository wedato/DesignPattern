package ct.exo3;

public class ModificationSeconde extends Mode{

    public ModificationSeconde(Montre montre) {
        super(montre);
    }

    @Override
    public void onButtonMode() {
        montre.setMode(new Affichage(montre));
    }

    @Override
    public void onButtonAvancer() {
        montre.setSecondes(0);
    }

    @Override
    public void onButtonAvanceRapide() {

    }

    @Override
    public String quelmode() {
        return "MODIF SECOND";
    }
}
