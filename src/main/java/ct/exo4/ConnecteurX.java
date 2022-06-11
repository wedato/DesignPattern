package ct.exo4;

import java.util.List;

public class ConnecteurX extends Connecteur {


    public ConnecteurX(List<Gouteur> gouteurs) {
        super(gouteurs);
    }

    @Override
    void diviserDebit(int debitRentrant) {
        for (Gouteur gouteur : gouteurs){
            gouteur.litreParHeure = debitRentrant/3;
        }

    }
}
