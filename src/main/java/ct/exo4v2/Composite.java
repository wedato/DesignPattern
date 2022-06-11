package ct.exo4v2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Composite implements Connecteur{
    private Collection childrens;

    public Composite() {
        childrens = new ArrayList<>();
    }
    public void add(Connecteur connecteur){
        childrens.add(connecteur);
    }
    public void remove(Connecteur connecteur){
        childrens.remove(connecteur);
    }
    public Iterator getChildren(){
        return childrens.iterator();
    }

    @Override
    public double aroser() {
        return 0;
    }
}
