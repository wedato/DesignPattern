package ct.exo3;

public class ModificationHeure extends Mode {


    public ModificationHeure(Montre montre) {
        super(montre);
    }

    @Override
    public void onButtonMode() {
        montre.setMode(new ModificationMinutes(montre));

    }

    @Override
    public void onButtonAvancer() {

        montre.setHeure((montre.getHeure()+1) % 24);

    }

    @Override
    public void onButtonAvanceRapide() {
        montre.setHeure((montre.getHeure() + 5) % 24);
    }

    @Override
    public String quelmode() {
        return "modif heure";
    }
}
