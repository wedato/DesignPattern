package ct.exo4;

import java.util.List;

public class ConnecteurY extends Connecteur {


    public ConnecteurY(List<Gouteur> gouteurs) {
        super(gouteurs);
    }

    @Override
    void diviserDebit(int debitRentrant) {

        for (Gouteur gouteur : gouteurs)
            gouteur.litreParHeure = debitRentrant/2;
    }
}
