package ct.exo4;

import java.util.List;

public abstract class Connecteur {

    List<Gouteur> gouteurs;

    public Connecteur(List<Gouteur> gouteurs) {
        this.gouteurs = gouteurs;
    }






    abstract void diviserDebit(int debitRentrant);




}
