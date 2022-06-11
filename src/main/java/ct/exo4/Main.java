package ct.exo4;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        List<Gouteur> gouteurs1 = Arrays.asList(new Gouteur(),new Gouteur(),new Gouteur());
        List<Gouteur> gouteurs2 = Arrays.asList(new Gouteur(),new Gouteur(),new Gouteur());

        List<Connecteur> connecteurs = Arrays.asList(new ConnecteurX(gouteurs1), new ConnecteurX(gouteurs2));

        var recuperateurDeau = new RecuperateurDeau(connecteurs);

        recuperateurDeau.transferEauToConnecteur();














    }
}
