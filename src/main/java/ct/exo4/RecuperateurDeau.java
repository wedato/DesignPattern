package ct.exo4;

import java.util.ArrayList;
import java.util.List;

public class RecuperateurDeau {

    List<Connecteur> connecteurs = new ArrayList<>();

    int eauStocker = 0;


    public RecuperateurDeau(List<Connecteur> connecteurs) {
        this.connecteurs = connecteurs;
    }

    void debiteEau(){
        eauStocker += 10;
    }

    void transferEauToConnecteur(){
        for (Connecteur connecteur : connecteurs) {
            connecteur.diviserDebit(eauStocker/connecteurs.size());
        }

    }

    public int getEauStocker() {
        return eauStocker;
    }
}
