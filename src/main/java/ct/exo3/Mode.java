package ct.exo3;

public abstract class Mode {
    Montre montre;

    public Mode(Montre montre) {
        this.montre = montre;
    }

    public abstract void onButtonMode();
    public abstract void onButtonAvancer();

    public abstract void onButtonAvanceRapide();

    public abstract String quelmode();
}
