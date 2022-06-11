package ct.exo3;

public class ModificationMinutes extends Mode {

    public ModificationMinutes(Montre montre) {
        super(montre);
    }

    @Override
    public void onButtonMode() {
        montre.setMode(new ModificationSeconde(montre));
    }

    @Override
    public void onButtonAvancer() {
        montre.setMinutes((montre.getMinutes() +1) % 60);

    }

    @Override
    public void onButtonAvanceRapide() {
        montre.setMinutes((montre.getMinutes() +10) % 60);
    }

    @Override
    public String quelmode() {
        return "modif minute";
    }
}
